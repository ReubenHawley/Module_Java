package bijeenkomst4.reisaanbod;

import bijeenkomst4.reisaanbod.lokatie.Bestemming;
import bijeenkomst4.reisaanbod.lokatie.Land;
import bijeenkomst4.reisaanbod.reisaanbod.Reis;
import bijeenkomst4.reisaanbod.reisaanbod.speciaal.Groepsreis;

public class Reistest {

    public static void main(String[] args) {
        Land land1 = new Land("Oostenrijk", "AT");
        Land land2 = new Land("Frankrijk", "FR");
        System.out.println(land1.code);
        System.out.println(land2.code);

        Bestemming bestemming1 = new Bestemming("Gerlos", land1);
        Bestemming bestemming2 = new Bestemming("Val Cenis", land2);

        System.out.println(bestemming1);
        System.out.println(bestemming2);

        Reis reis1 = new Reis("De hoogste toppen van Oostenrijk", bestemming1);
        Reis reis2 = new Reis("Franse toppistes", bestemming2);

        reis1.printOverzicht();
        reis2.printOverzicht();

        Groepsreis groepsreis1 = new Groepsreis("Skivakantie voor groepen", bestemming1, 10);
        Groepsreis groepsreis2 = new Groepsreis("Wandelvakantie voor groepen", bestemming2, 5);

        groepsreis1.printOverzicht();
        groepsreis2.printOverzicht();
    }
}
