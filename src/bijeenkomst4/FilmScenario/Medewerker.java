package bijeenkomst4.FilmScenario;

import java.time.LocalDate;

public class Medewerker extends Persoon {
    private String functie;

    public Medewerker(String naam, LocalDate geboortedatum, String sexe, String functie) {
        super(naam, geboortedatum, sexe);
        this.functie = functie;
    }

    @Override
    public void print() {
        System.out.println(functie + ": " + naam);
    }
}

