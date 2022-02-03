package bijeenkomst4.FilmScenario;

import java.time.LocalDate;

public class Medewerker extends Persoon {
    private String functie;
    private double dagelijksBeloning;

    public Medewerker(String naam, LocalDate geboortedatum, String sexe, String functie, double dagelijksBeloning) {
        super(naam, geboortedatum, sexe,dagelijksBeloning);
        this.functie = functie;
    }

    @Override
    public double berekenBeloning(int draaidagen) {
        return dagelijksBeloning*draaidagen;
    }

    @Override
    public void print() {
        System.out.println(functie + ": " + naam);
    }
}

