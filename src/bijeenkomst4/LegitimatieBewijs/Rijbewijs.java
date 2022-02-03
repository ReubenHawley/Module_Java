package bijeenkomst4.LegitimatieBewijs;

public class Rijbewijs implements Legitimatiebewijs {
    private String naam;
    private String BSN;
    private String categorie;

    public Rijbewijs(String naam, String BSN, String categorie) {
        this.naam = naam;
        this.BSN = BSN;
        this.categorie = categorie;
    }


    public String getCategorie() {
        return categorie;
    }

    @Override
    public String getDocumenttype() {
        return "Rijbewijs";
    }

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public String getBSN() {
        return this.BSN;
    }

    @Override
    public String toString() {
        return "Rijbewijs{" +
                "naam='" + naam + '\'' +
                ", BSN='" + BSN + '\'' +
                ", categorie='" + categorie + '\'' +
                ", documenttype='" + getDocumenttype() + '\'' +
                '}';
    }
}
