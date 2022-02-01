package bijeenkomst3;

public class Klant extends Persoon {
    private double budget;

    public Klant(String naam, int leeftijd, double budget) {
        super(naam, leeftijd);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + " (budget " + budget + ')';
    }

    public void verhoogBudget(double bedrag) {
        this.budget += bedrag;
    }

}
