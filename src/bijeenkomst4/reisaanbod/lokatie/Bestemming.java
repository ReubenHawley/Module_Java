package bijeenkomst4.reisaanbod.lokatie;

public class Bestemming {

    private String naam;
    private Land land;

    public Bestemming(String naam, Land land) {
        this.naam = naam;
        this.land = land;
    }

    @Override
    public String toString() {
        return naam + " in " + land.naam + " (" + land.code + ")";
    }

}
