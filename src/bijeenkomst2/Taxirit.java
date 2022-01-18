package bijeenkomst2;

import java.time.LocalDate;

public class Taxirit {

    private double prijsPerKm = 1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;
    private LocalDate datum;

    //counstructors

    Taxirit(double afstand) {
        this.aantalPers =1;
        this.afstand = afstand;
        this.maxAantal = 4;
        this.datum = LocalDate.now();
    }

    Taxirit(double afstand, int aantalPers, int maxAantal) {
        this.afstand = afstand;
        this.aantalPers = aantalPers;
        this.maxAantal = maxAantal;
        this.datum = LocalDate.now();
    }

    //getters and setters
    public double getAfstand() {
        return this.afstand;
    }

    public void setAfstand(double afstand) {
        this.afstand = afstand;
    }

    public void setMaxAantal(int maxAantal) {
        this.maxAantal = maxAantal;
    }

    public double getPrijsPerKm() {
        return prijsPerKm;
    }

    //public methods


    @Override
    public String toString() {
        return "Taxirit{" +
                "prijsPerKm=" + prijsPerKm +
                ", aantalPers=" + aantalPers +
                ", maxAantal=" + maxAantal +
                ", afstand=" + afstand +
                ", datum=" + datum +
                ", berekenPrijsPerPeroon=" + berekenPrijsPerPeroon() +
                '}';
    }

    public void voegPersoontoe() {
        if (aantalPers == maxAantal) {
            System.out.println("De auto zit vol, er kunnen niemand nog naar binnen, dit is geen Afrika taxi");
        } else {
            if ((aantalPers + 1) <= maxAantal) {
                this.aantalPers += 1;
            }
        }
    }

    public void voegPersoontoe(int personen) {
        if (aantalPers == maxAantal) {
            System.out.println("De auto zit vol, er kunnen niemand nog naar binnen, dit is geen Afrika taxi");
        } else {
            if ((aantalPers + personen) <= maxAantal) {
                this.aantalPers += personen;
            }
        }
    }

    public double berekenPrijsPerPeroon() {
        double kosten = Math.max(afstand*prijsPerKm,2.50);
        if (aantalPers == maxAantal) {
            this.prijsPerKm *= 0.9;
            kosten = Math.max(afstand*prijsPerKm,2.50);
            return kosten;
        }
        return kosten;
    }


    public static void main(String[] args) {
Taxirit taxi = new Taxirit(5);
        System.out.println(taxi);
        taxi.voegPersoontoe();
        System.out.println(taxi);
        taxi.voegPersoontoe();
        System.out.println(taxi);
        taxi.voegPersoontoe();
        System.out.println(taxi);
        taxi.voegPersoontoe();
        System.out.println(taxi);
    }
}
