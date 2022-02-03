package bijeenkomst4.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SchermMetKnop {
    public static void main(String[] args) {
        JFrame scherm = new JFrame("piep");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setSize(300, 300);
        JButton knop = new JButton("klik hier");
        Schakelaar s = new Schakelaar();
        knop.addActionListener(s);

        // hier komt de code voor de actionlistener in opgave b
        scherm.add(knop);
        scherm.setVisible(true);
    }
}