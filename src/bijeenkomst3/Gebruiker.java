package bijeenkomst3;

public class Gebruiker {
    private String naam;
    private int leeftijd;

    public int getLeeftijd() {
        return this.leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Gebruiker(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return naam + '(' + leeftijd +')';
    }
}
