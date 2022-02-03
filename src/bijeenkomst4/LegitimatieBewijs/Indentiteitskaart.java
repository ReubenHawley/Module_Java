package bijeenkomst4.LegitimatieBewijs;

public class Indentiteitskaart extends Reisdocument {
    public Indentiteitskaart(String naam, String BSN) {
        super(naam, BSN);
    }

    @Override
    public String getDocumenttype() {
        return "Indentiteitskaart";
    }

    @Override
    String getGeldigeLanden() {
        return "Europa";
    }
}
