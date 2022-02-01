package bijeenkomst3;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return "Dit is " + naam + ", leeftijd " + leeftijd;
    }
    public void jarig(){
        this.leeftijd ++;
    }

    public static void main(String[] args) {
        Persoon p1 = new Persoon("Hilde", 26);
        System.out.println(p1);
        p1.jarig();
        System.out.println(p1);

        Werknemer w1 = new Werknemer("Piet", 34, 1400.75);
        System.out.println(w1);
        w1.jarig();
        w1.verhoogSalaris(200);
        System.out.println(w1);

        Klant k1 = new Klant("Ashwin", 31, 75.50);
        System.out.println(k1);
        k1.jarig();
        System.out.println(k1);


    }
}
