package bijeenkomst4.FilmScenario;

import java.time.LocalDate;

public class Acteur extends Persoon {
    private Rol rol;

    public Acteur(String naam, LocalDate geboortedatum,String sexe, Rol rol) {
        super(naam,geboortedatum,sexe);
        this.rol = rol;
    }
    public void print(){
        System.out.println(this.naam +" als "+ rol.getNaam());
    }

    public Rol getRol() {
        return rol;
    }

    @Override
    public String toString() {
        return naam + " als " + rol;
    }
}