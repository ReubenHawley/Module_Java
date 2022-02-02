package bijeenkomst3.FilmScenario;

public class Acteur {

    private String naam;
    private Rol rol;

    public Acteur(String naam, Rol rol) {
        this.naam = naam;
        this.rol = rol;
    }
    public void print(){
        System.out.println(naam +" als "+ rol.getNaam());
    }
}