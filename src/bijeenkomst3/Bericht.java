package bijeenkomst3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bericht {
    private Gebruiker afzender;
    private String bericht;
    private LocalDateTime datum;

    public Bericht(Gebruiker afzender, String bericht) {
        this.afzender = afzender;
        this.bericht = bericht;
        this.datum = LocalDateTime.now();
    }

    public LocalDateTime getDatum() {
        return this.datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public String getBericht() {
        return this.bericht;
    }

    public void setBericht(String bericht) {
        this.bericht = bericht;
    }

    public Gebruiker getAfzender() {
        return this.afzender;
    }

    public void setAfzender(Gebruiker afzender) {
        this.afzender = afzender;
    }

    @Override
    public String toString() {
        return afzender + " (" + datum + ") " + bericht + '\n';
    }

    public static void main(String[] args) {
        int aantal = 6;
        String[] berichten = new String[6];
        berichten[0] = "Hoi";
        berichten[1] = "Hallo, Hoe gaat het?";
        berichten[2] = "Goed! Met jou ook?";
        berichten[3] = "Prima, maar ik moet wel weer verder";
        berichten[4] = "Oké tot snel!";
        berichten[5] = "Doei!";
        if (aantal == berichten.length) {
            System.out.println("Er zijn " + berichten.length + " berichten");
        }

        Gebruiker reuben = new Gebruiker("Reuben",31);
        Gebruiker jolanda = new Gebruiker("Jolanda",39);
        for (int i = 0; i < berichten.length; i++) {
            System.out.println(berichten[i]);
        }
        Bericht bericht1 = new Bericht(reuben, berichten[0]);
        Bericht bericht2 = new Bericht(jolanda, berichten[1]);
        Bericht bericht3 = new Bericht(reuben, berichten[2]);
        Bericht bericht4 = new Bericht(jolanda, berichten[3]);
        Bericht bericht5 = new Bericht(reuben, berichten[4]);
        Bericht bericht6 = new Bericht(jolanda, berichten[5]);
        System.out.println(bericht1);
        ArrayList<Bericht> berichtenLijst = new ArrayList<Bericht>();
        berichtenLijst.add(bericht1);
        berichtenLijst.add(bericht2);
        berichtenLijst.add(bericht3);
        berichtenLijst.add(bericht4);
        berichtenLijst.add(bericht5);
        berichtenLijst.add(bericht6);
        for (Bericht bericht:berichtenLijst) {
            System.out.println(bericht);
        }
    }
}
