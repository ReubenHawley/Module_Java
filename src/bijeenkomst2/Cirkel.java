package bijeenkomst2;

public class Cirkel {
    private double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }

    public double berekenOmtrek(double straal) {
        return 2* straal * Math.PI;
    }
}
