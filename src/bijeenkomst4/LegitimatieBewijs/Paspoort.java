package bijeenkomst4.LegitimatieBewijs;

public class Paspoort extends Reisdocument {

    public Paspoort(String naam, String BSN) {
        super(naam, BSN);
    }

    @Override
    public String getDocumenttype() {
        return "paspoort";
    }

    @Override
    String getGeldigeLanden() {
        return "de hele wereld";
    }
}
