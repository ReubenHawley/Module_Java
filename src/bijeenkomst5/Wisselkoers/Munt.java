package bijeenkomst5.Wisselkoers;

public class Munt {
    private String naam;
    private String teken;

    public Munt(String naam, String teken) {
        this.naam = naam;
        this.teken = teken;
    }

    public String getTeken() {
        return this.teken;
    }

    public void setTeken(String teken) {
        this.teken = teken;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
