package bijeenkomst5.HackersEdition;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class BordGUI extends JFrame implements MouseListener {
    private JFrame window;
    private JButton submit;
    private final JTextField coordinateX;
    private final JTextField coordinateY;
    private JPanel square1;
    private JPanel square2;
    private JPanel square3;
    private JPanel square4;
    private JPanel square5;
    private JPanel square6;
    private JPanel square7;
    private JPanel square8;
    private JPanel square9;

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

        square1 = new JPanel();
        square1.setPreferredSize(d);
        square1.setBackground(Color.blue);
        square1.setBorder(border);
        square1.setVisible(true);
        square1.addMouseListener(this);

        square2 = new JPanel();
        square2.setPreferredSize(d);
        square2.setBackground(Color.blue);
        square2.setBorder(border);
        square2.setVisible(true);
        square2.addMouseListener(this);

        square3 = new JPanel();
        square3.setPreferredSize(d);
        square3.setBackground(Color.blue);
        square3.setBorder(border);
        square3.setVisible(true);
        square3.addMouseListener(this);

        square4 = new JPanel();
        square4.setPreferredSize(d);
        square4.setBackground(Color.blue);
        square4.setBorder(border);
        square4.setVisible(true);
        square4.addMouseListener(this);

        square5 = new JPanel();
        square5.setPreferredSize(d);
        square5.setBackground(Color.blue);
        square5.setBorder(border);
        square5.setVisible(true);
        square5.addMouseListener(this);

        square6 = new JPanel();
        square6.setPreferredSize(d);
        square6.setBackground(Color.blue);
        square6.setBorder(border);
        square6.setVisible(true);
        square6.addMouseListener(this);

        square7 = new JPanel();
        square7.setPreferredSize(d);
        square7.setBackground(Color.blue);
        square7.setBorder(border);
        square7.setVisible(true);
        square7.addMouseListener(this);

        square8 = new JPanel();
        square8.setPreferredSize(d);
        square8.setBackground(Color.blue);
        square8.setBorder(border);
        square8.setVisible(true);
        square8.addMouseListener(this);

        square9 = new JPanel();
        square9.setPreferredSize(d);
        square9.setBackground(Color.blue);
        square9.setBorder(border);
        square9.setVisible(true);
        square9.addMouseListener(this);
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
        inputPanel.setBounds(0, 460, 400, 140);
        inputPanel.setLayout(new BorderLayout());
        inputPanel.setVisible(true);

        JPanel inputFields = new JPanel();
        inputFields.setBounds(0, 0, 100, 140);
        inputFields.setLayout(new FlowLayout());
        inputFields.setVisible(true);

        Dimension d2 = new Dimension(60, 30);

        coordinateX = new JTextField();
        coordinateX.setBorder(border);
        coordinateX.setPreferredSize(d2);
        inputFields.add(coordinateX);

        coordinateY = new JTextField();
        coordinateY.setBorder(border);
        coordinateY.setPreferredSize(d2);
        inputFields.add(coordinateY);

        JPanel submitPanel = new JPanel();
        submitPanel.setBounds(0, 0, 100, 140);
        submitPanel.setLayout(new FlowLayout());
        submitPanel.setVisible(true);

        submit = new JButton("Kleur");
        submit.setBounds(0, 0, 100, 30);
        submit.setBorder(border);
        submitPanel.add(submit);


        inputPanel.add(inputFields, BorderLayout.WEST);
        inputPanel.add(submitPanel, BorderLayout.EAST);


        window.add(grid, BorderLayout.NORTH);
        window.add(inputPanel, BorderLayout.SOUTH);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == square1) {
            square1.setBackground(Color.RED);
        } else if (e.getSource() == square2) {
            square2.setBackground(Color.RED);
        } else if (e.getSource() == square3) {
            square3.setBackground(Color.RED);
        } else if (e.getSource() == square4) {
            square4.setBackground(Color.RED);
        } else if (e.getSource() == square5) {
            square5.setBackground(Color.RED);
        } else if (e.getSource() == square6) {
            square6.setBackground(Color.RED);
        } else if (e.getSource() == square7) {
            square7.setBackground(Color.RED);
        } else if (e.getSource() == square8) {
            square8.setBackground(Color.RED);
        } else if (e.getSource() == square9) {
            square9.setBackground(Color.RED);
        }
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == square1) {
            square1.setBackground(Color.blue);
        } else if (e.getSource() == square2) {
            square2.setBackground(Color.blue);
        } else if (e.getSource() == square3) {
            square3.setBackground(Color.blue);
        } else if (e.getSource() == square4) {
            square4.setBackground(Color.blue);
        } else if (e.getSource() == square5) {
            square5.setBackground(Color.blue);
        } else if (e.getSource() == square6) {
            square6.setBackground(Color.blue);
        } else if (e.getSource() == square7) {
            square7.setBackground(Color.blue);
        } else if (e.getSource() == square8) {
            square8.setBackground(Color.blue);
        } else if (e.getSource() == square9) {
            square9.setBackground(Color.blue);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
