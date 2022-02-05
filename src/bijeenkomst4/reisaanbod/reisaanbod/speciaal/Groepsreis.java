package bijeenkomst4.reisaanbod.reisaanbod.speciaal;

import bijeenkomst4.reisaanbod.lokatie.Bestemming;
import bijeenkomst4.reisaanbod.reisaanbod.Reis;

public class Groepsreis extends Reis {

    private int aantalPersonen;

    public Groepsreis(String naam, Bestemming bestemming, int aantalPersonen) {
        super(naam, bestemming);
        this.aantalPersonen = aantalPersonen;
    }

    public void printOverzicht() {
        System.out.println(naam + "\n - met  " + aantalPersonen + " personen naar " + bestemming);
    }
}
