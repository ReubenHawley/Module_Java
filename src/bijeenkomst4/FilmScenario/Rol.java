package bijeenkomst4.FilmScenario;

public class Rol {

    private String naam;
    private String beschrijving;

    public Rol(String naam, String beschrijving) {
        this.naam = naam;
        this.beschrijving = beschrijving;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return  naam;
    }
}

