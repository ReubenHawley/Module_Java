package bijeenkomst5.Wisselkoers;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class WisselScherm extends JFrame implements ActionListener {

    private Wisselkoers wisselkoers;
    private JLabel jlblteken1;
    private JLabel jlblteken2;
    private JTextField jtMunt1 = new JTextField();
    private JTextField jtMunt2 = new JTextField();
    private JButton jbLeft = new JButton(">>");
    private JButton jbRight = new JButton("<<");


    WisselScherm(Wisselkoers wisselkoers) {
        this.wisselkoers = wisselkoers;
        //create Frame to insert frame onto
        JFrame window = new JFrame();
        window.setLayout(null);
        window.setSize(600, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create new Panel and set properties
        JPanel converter = new JPanel();
        converter.setLayout(null);
        converter.setBounds(0, 15, 600, 280);

        //assign labels values
        jlblteken1 = new JLabel(wisselkoers.getMunt1().getTeken());
        jlblteken1.setBounds(90, 10, 20, 30);


        jlblteken2 = new JLabel(wisselkoers.getMunt2().getTeken());
        jlblteken2.setBounds(380, 10, 20, 30);


        jtMunt1.setBounds(110, 10, 70, 30);
        jtMunt2.setBounds(400, 10, 70, 30);

        jbLeft.setBounds(200, 10, 70, 30);
        jbLeft.setFocusable(false);
        jbLeft.addActionListener(this);

        jbRight.setBounds(290, 10, 70, 30);
        jbRight.setFocusable(false);
        jbRight.addActionListener(this);

        // add elements in horizontal row
        converter.add(jlblteken1);
        converter.add(jtMunt1);
        converter.add(jbLeft);
        converter.add(jbRight);
        converter.add(jlblteken2);
        converter.add(jtMunt2);

        window.add(converter);
        converter.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        if (e.getSource() == jbLeft){
            Double exchangedValue = wisselkoers.munt1NaarMunt2(Double.parseDouble(jtMunt1.getText()));
            String exchangedStringValue = String.valueOf(String.format("%,.2f",exchangedValue));
            exchangedStringValue = exchangedStringValue.replace(',','.');
            jtMunt2.setText(exchangedStringValue);
        }
        if(e.getSource() == jbRight){
            Double exchangedValue = wisselkoers.munt2NaarMunt1(Double.parseDouble(jtMunt2.getText()));
            String exchangedStringValue = String.valueOf(String.format("%,.2f",exchangedValue));
            exchangedStringValue = exchangedStringValue.replace(',','.');
            jtMunt1.setText(exchangedStringValue);
        }

    }
}
