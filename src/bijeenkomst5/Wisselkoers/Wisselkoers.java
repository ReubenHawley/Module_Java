package bijeenkomst5.Wisselkoers;

public class Wisselkoers {
    private Munt munt1;
    private Munt munt2;
    private double koers;

    public Wisselkoers(Munt munt1, Munt munt2, double koers) {
        this.munt1 = munt1;
        this.munt2 = munt2;
        this.koers = koers;
    }

    public double munt1NaarMunt2(double bedrag) {
        System.out.println(bedrag*koers);
        return bedrag*koers;
    }

    public double munt2NaarMunt1(double bedrag) {
        return bedrag/koers;
    }

    public Munt getMunt1() {
        return munt1;
    }

    public Munt getMunt2() {
        return munt2;
    }

    public double getKoers() {
        return koers;
    }
}
