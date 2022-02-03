package bijeenkomst4.FilmScenario;

import java.time.LocalDate;

public class Acteur extends Persoon {
    private Rol rol;
    private double vastebeloning;

    public Acteur(String naam, LocalDate geboortedatum, String sexe, Rol rol, double dagelijksBeloning, double vastebeloning) {
        super(naam, geboortedatum, sexe, dagelijksBeloning);
        this.rol = rol;
        this.vastebeloning = vastebeloning;
    }

    @Override
    public double berekenBeloning(int draaidagen) {
        return ((dagelijksBeloning * draaidagen) + vastebeloning);
    }

    public void print() {
        System.out.println(this.naam + " als " + rol.getNaam());
    }

    public Rol getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return naam + " als " + rol;
    }
}