package bijeenkomst4.LegitimatieBewijs;

public abstract class Reisdocument implements Legitimatiebewijs {
    protected String naam;
    protected String BSN;


    public Reisdocument(String naam, String BSN) {
        this.naam = naam;
        this.BSN = BSN;
    }

    abstract String getGeldigeLanden();

    @Override
    public String toString() {
        return "Reisdocument{" + "naam=" + naam + ", BSN=" + BSN + " type: " + getDocumenttype() + " geldig voor " + getGeldigeLanden() + "}";
    }


    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public String getBSN() {
        return BSN;
    }
}
