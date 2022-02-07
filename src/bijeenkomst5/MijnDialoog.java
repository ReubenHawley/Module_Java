package bijeenkomst5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class MijnDialoog extends JDialog implements ActionListener {
    private boolean isOk;
    private String text;

    private JLabel jlblGebruikersnaam = new JLabel("Gebruikersnaam:");
    private JLabel jlblWachtwoord = new JLabel("Wachtwoord:");
    private JTextField jtfGebruikersnaam = new JTextField();
    private JTextField jtfwachtwoord = new JPasswordField();
    private JButton jbOK;
    private JButton jbAnnuleer;
    private final JLabel jlblStatus = new JLabel(" ");
    private boolean authenticated = false;


    public MijnDialoog(JFrame frame) {
        super(frame, true);
        setTitle("Inloggen");

        JPanel p3 = new JPanel((new GridLayout(2, 1)));

        p3.add(jlblGebruikersnaam);
        p3.add(jlblWachtwoord);

        JPanel p4 = new JPanel((new GridLayout(2, 1)));
        p4.add(jtfGebruikersnaam);
        p4.add(jtfwachtwoord);

        JPanel p1 = new JPanel((new GridLayout()));
        p1.add(p3);
        p1.add(p4);

        JPanel p2 = new JPanel();
        jbOK = new JButton("OK");
        jbOK.addActionListener(this);
        p2.add(jbOK);
        jbAnnuleer = new JButton("Annuleren");
        jbAnnuleer.addActionListener(this);
        p2.add(jbAnnuleer);

        JPanel p5 = new JPanel(new BorderLayout());
        p5.add(p2, BorderLayout.CENTER);
        p5.add(jlblStatus, BorderLayout.NORTH);

        setLayout(new BorderLayout());
        setSize(600, 400);
        add(p1, BorderLayout.CENTER);
        add(p5, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


    }

    public String getGebruikersnaam() {
        return jtfGebruikersnaam.getText();
    }

    public String getWachtwoord() {
        return jtfwachtwoord.getText();
    }

    public void setAuthenticated(boolean value) {
        this.authenticated = value;
    }

    public void Authenticated() {
        if (Objects.equals(getGebruikersnaam(), "stackoverflow") && Objects.equals(getWachtwoord(), "stackoverflow")) {
            setAuthenticated(true);
        }
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbOK) {
            Authenticated();
            if (authenticated == true) {
                JOptionPane.showMessageDialog(this, "Successvol ingelogd");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Inloggen mislukt");
            }
        } else {
            isOk = false;
            System.out.println(isOk);
        }
    }


    public boolean getIsOk() {
        return isOk;
    }
}
