package bijeenkomst4.FilmScenario;

import java.time.LocalDate;

public abstract class Persoon {
    protected String naam;
    protected LocalDate geboortedatum;
    protected String sexe;

    public Persoon(String naam, LocalDate geboortedatum, String sexe) {
        this.naam = naam;
        this.geboortedatum = geboortedatum;
        this.sexe = sexe;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public LocalDate getGeboortedatum() {
        return this.geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getNaam() {
        return this.naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public abstract void print();
}

