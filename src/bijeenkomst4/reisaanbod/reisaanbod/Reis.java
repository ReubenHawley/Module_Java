package bijeenkomst4.reisaanbod.reisaanbod;

import bijeenkomst4.reisaanbod.lokatie.Bestemming;

public class Reis {

    protected String naam;
    protected Bestemming bestemming;

    public Reis(String naam, Bestemming bestemming) {
        this.naam = naam;
        this.bestemming = bestemming;
    }

    public void printOverzicht() {
        System.out.println(naam + "Dit is een vakantie naar " + bestemming);

    }
//    public String toString() {
//        return "Reis: " + naam + ", bestemming: " + bestemming.naam + " (" + bestemming.land.naam + ")";
//    }
}
