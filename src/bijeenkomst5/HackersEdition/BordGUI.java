package bijeenkomst5.HackersEdition;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BordGUI extends JFrame {
    JFrame window;

    BordGUI() {
        // create window
        window = new JFrame();
        window.setBounds(0, 0, 600, 600);
        window.setTitle("Hacker Edition");
        window.setLayout(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create grid elements
        Dimension d = new Dimension(30, 30);
        Border border = BorderFactory.createLineBorder(new Color(50, 50, 255), 3);

        JPanel square1 = new JPanel();
        square1.setPreferredSize(d);
        square1.setBackground(Color.blue);
        square1.setBorder(border);
        square1.setVisible(true);

        JPanel square2 = new JPanel();
        square2.setPreferredSize(d);
        square2.setBackground(Color.blue);
        square2.setBorder(border);
        square2.setVisible(true);

        JPanel square3 = new JPanel();
        square3.setPreferredSize(d);
        square3.setBackground(Color.blue);
        square3.setBorder(border);
        square3.setVisible(true);

        JPanel square4 = new JPanel();
        square4.setPreferredSize(d);
        square4.setBackground(Color.blue);
        square4.setBorder(border);
        square4.setVisible(true);

        JPanel square5 = new JPanel();
        square5.setPreferredSize(d);
        square5.setBackground(Color.blue);
        square5.setBorder(border);
        square5.setVisible(true);

        JPanel square6 = new JPanel();
        square6.setPreferredSize(d);
        square6.setBackground(Color.RED);
        square6.setBorder(border);
        square6.setVisible(true);

        JPanel square7 = new JPanel();
        square7.setPreferredSize(d);
        square7.setBackground(Color.blue);
        square7.setBorder(border);
        square7.setVisible(true);

        JPanel square8 = new JPanel();
        square8.setPreferredSize(d);
        square8.setBackground(Color.blue);
        square8.setBorder(border);
        square8.setVisible(true);

        JPanel square9 = new JPanel();
        square9.setPreferredSize(d);
        square9.setBackground(Color.blue);
        square9.setBorder(border);
        square9.setVisible(true);

        //create grid for placement in the window
        JPanel grid = new JPanel();
        grid.setBounds(10, 10, 450, 450);
        grid.setLayout(new GridLayout(3, 3, 10, 10));
        grid.add(square1);
        grid.add(square2);
        grid.add(square3);
        grid.add(square4);
        grid.add(square5);
        grid.add(square6);
        grid.add(square7);
        grid.add(square8);
        grid.add(square9);

        //create input fields and button
        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0,460,140,140);
        inputPanel.setLayout(new BorderLayout());
        inputPanel.setVisible(true);

        JPanel inputFields = new JPanel();
        inputFields.setBounds(0,0,100,140);
        inputFields.setLayout(new FlowLayout());
        inputFields.setVisible(true);

        Dimension d2 = new Dimension(45,30);

        JTextField coordinateX = new JTextField();
        coordinateX.setBorder(border);
        coordinateX.setPreferredSize(d2);
        inputFields.add(coordinateX);

        JTextField coordinateY = new JTextField();
        coordinateY.setBorder(border);
        coordinateY.setPreferredSize(d2);
        inputFields.add(coordinateY);

        JButton submit = new JButton("Kleur");
        submit.setPreferredSize(d2);
        submit.setBorder(border);

        inputPanel.add(inputFields,BorderLayout.WEST);
        inputPanel.add(submit,BorderLayout.EAST);


        window.add(grid, BorderLayout.NORTH);
        window.add(inputPanel,BorderLayout.SOUTH);


    }
}
