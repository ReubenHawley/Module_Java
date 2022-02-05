package bijeenkomst4.Postcode;

public class Rechtspersoon extends Persoon {
    private String naam;
    private String afdeling;
    private NatuurlijkPersoon contactPersoon;

    public Rechtspersoon(String naam, String afdeling, Postcode pc, int huisnummer, Persoon contactPersoon) {
        super(pc, huisnummer, "");
        this.naam = naam;
        this.afdeling = afdeling;
        this.contactPersoon = (NatuurlijkPersoon) contactPersoon;
    }

    public Rechtspersoon(String naam, String afdeling, Postcode pc, int huisnummer,String toevoeging, Persoon contactPersoon) {
        super(pc, huisnummer, toevoeging);
        this.naam = naam;
        this.afdeling = afdeling;
        this.contactPersoon = (NatuurlijkPersoon) contactPersoon;
    }

    @Override
    public String getAan() {
        return "Aan: " + naam + "\n"
                + "Afdeling: " + afdeling + "\n" +
                "De heer A.B.C.D. Zalm\n" +
                "Postbus: " + getAdres();
    }

    @Override
    public String getGeachte() {
        return contactPersoon.getGeachte();
    }
}
