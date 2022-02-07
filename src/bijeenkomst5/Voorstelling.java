package bijeenkomst5;

public class Voorstelling {
    private String naam;
    private int aantalPlaatsen;
    private int aantalVerkocht;

    public Voorstelling(String naam, int aantal) {
        this.naam = naam;
        this.aantalPlaatsen = aantal;
        this.aantalVerkocht = 0;
    }

    public int getVerkocht() {
        return this.aantalVerkocht;
    }

    public void setVerkocht(int aantalVerkocht) {
        this.aantalVerkocht = aantalVerkocht;
    }

    public int getAantalPlaatsen() {
        return this.aantalPlaatsen;
    }

    public void setAantalPlaatsen(int aantalPlaatsen) {
        this.aantalPlaatsen = aantalPlaatsen;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void verkooopKaartje() {
        if (aantalPlaatsen > 0) {
            aantalPlaatsen--;
            aantalVerkocht++;
        }
    }

    public void annuleerKaartje() {
        aantalPlaatsen++;
        aantalVerkocht--;

    }

}
