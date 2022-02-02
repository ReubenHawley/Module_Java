package bijeenkomst3;

public class TvSeries extends TVProgramma{
    private String regisseur;
    private int afleveringsnummer;


    public TvSeries(String titel, int tijdsDuur, int afleveringsnummer,String regisseur) {
        super(titel, tijdsDuur);
        this.afleveringsnummer = afleveringsnummer;
        this.regisseur = regisseur;

    }

    public int getAfleveringsNummer() {
        return this.afleveringsnummer;
    }

    public void setAfleveringsNummer(int afleveringsnummer) {
        this.afleveringsnummer = afleveringsnummer;
    }
    public String getRegisseur() {
        return this.regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "zender='" + getZender() + '\'' +
                ", tijdsDuur=" + getTijdsDuur() +
                ", titel='" + getTitel() + '\'' +
                ", regisseur='" + regisseur + '\'' +
                ", afleveringsnummer=" + afleveringsnummer +
                ", afleveringsNummer=" + getAfleveringsNummer() +
                '}';
    }
}
