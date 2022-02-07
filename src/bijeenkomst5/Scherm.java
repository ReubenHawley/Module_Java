package bijeenkomst5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scherm extends JFrame implements ActionListener {
    private Voorstelling voorstelling;
    private JLabel jlAantalPlaatsen;
    private JLabel jlAantalVerkochtePlaatsen;
    private JButton jbVerkoop;
    private JButton jbAnnuleer;
    private MijnDialoog dialoog;
    private JButton uitloggen;

    public Scherm(Voorstelling voorstelling) {
        this.voorstelling = voorstelling;
        setTitle("Voorstelling: " + voorstelling.getNaam());
        setSize(600, 400);

        JPanel r1 = new JPanel((new GridLayout(1, 3)));
        JPanel whitespace = new JPanel();
        r1.add(whitespace);
        r1.add(new JLabel("aantal plaatsen vrij:"));
        String aantalPlaatsen = String.valueOf(voorstelling.getAantalPlaatsen());
        jlAantalPlaatsen = new JLabel(aantalPlaatsen);
        r1.add(jlAantalPlaatsen);

        JPanel r2 = new JPanel((new GridLayout(1, 3)));
        JPanel whitespace2 = new JPanel();
        r2.add(whitespace2);
        r2.add(new JLabel("aantal plaatsen verkocht:"));
        String aantalVerkochtePlaatsen = String.valueOf(voorstelling.getVerkocht());
        jlAantalVerkochtePlaatsen = new JLabel(aantalVerkochtePlaatsen);
        r2.add(jlAantalVerkochtePlaatsen);

        JPanel info = new JPanel(new GridLayout(2, 1));
        info.add(r1);
        info.add(r2);

        JPanel buttons = new JPanel(new GridLayout(1, 3));
        jbVerkoop = new JButton("Verkoop kaartje");
        jbVerkoop.addActionListener(this);
        buttons.add(jbVerkoop);
        jbAnnuleer = new JButton("Annuleer kaartje");
        jbAnnuleer.addActionListener(this);
        buttons.add(jbAnnuleer);
        uitloggen = new JButton("Uitloggen");
        uitloggen.addActionListener(this);
        buttons.add(uitloggen);

        setLayout(new BorderLayout());
        setSize(600, 400);
        add(info, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);


        dialoog = new MijnDialoog(this);
        dialoog.setVisible(true);

        setVisible(true);
    }


    public static void main(String[] args) {
        Voorstelling deVuurtoren = new Voorstelling("De Vuurtoren", 10);
        Scherm gui = new Scherm(deVuurtoren);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int plaatsen = voorstelling.getAantalPlaatsen();
        if (e.getSource() == jbVerkoop) {
            JOptionPane.showMessageDialog(this, "Successvol gekocht");
            if (plaatsen > 0) {
                plaatsen--;
                voorstelling.verkooopKaartje();
                if (plaatsen == 0) {
                    jlAantalPlaatsen.setText("Uitverkocht");
                    jlAantalVerkochtePlaatsen.setText(Integer.toString(this.voorstelling.getVerkocht()));

                } else {
                    jlAantalPlaatsen.setText(Integer.toString(this.voorstelling.getAantalPlaatsen()));
                    jlAantalVerkochtePlaatsen.setText(Integer.toString(this.voorstelling.getVerkocht()));
                }
            }
        } else if (e.getSource() == jbAnnuleer) {
            JOptionPane.showMessageDialog(this, "Successvol geannuleerd");
            if (plaatsen > 0) {
                add(jbAnnuleer);
                plaatsen++;
                voorstelling.annuleerKaartje();
                if (plaatsen == 0) {
                    jlAantalPlaatsen.setText("Uitverkocht");
                    jlAantalVerkochtePlaatsen.setText(Integer.toString(this.voorstelling.getVerkocht()));

                } else {
                    jlAantalPlaatsen.setText(Integer.toString(this.voorstelling.getAantalPlaatsen()));
                    jlAantalVerkochtePlaatsen.setText(Integer.toString(this.voorstelling.getVerkocht()));
                }
            } else if (plaatsen == 0) {
                plaatsen++;
                voorstelling.annuleerKaartje();
                jlAantalPlaatsen.setText(Integer.toString(this.voorstelling.getAantalPlaatsen()));
                jlAantalVerkochtePlaatsen.setText(Integer.toString(this.voorstelling.getVerkocht()));
            }
        } else if (e.getSource() == uitloggen) {
            int choice = JOptionPane.showConfirmDialog(this, "Weet u het zeker?", "Uitloggen", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

    }
}

