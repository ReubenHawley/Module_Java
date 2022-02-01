package bijeenkomst3;

public class Werknemer extends Persoon {
    private double salaris;

    public Werknemer(String naam, int leeftijd, double salaris) {
        super(naam, leeftijd);
        this.salaris = salaris;
    }

    @Override
    public String toString() {
        return super.toString() +" (salaris " + salaris + ')' ;
    }

    public void verhoogSalaris(double bedrag){
        this.salaris +=bedrag;
    }
}
