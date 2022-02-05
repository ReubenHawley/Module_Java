package bijeenkomst4.Postcode;

public class NatuurlijkPersoon extends Persoon {
    private String Achternaam;
    private String tussenvoegsel;
    private String voornaam;
    private String voorletters;
    private Character geslacht;

    public NatuurlijkPersoon(Character geslacht, String voorletters, String voornaam, String achternaam, Postcode postcode, int huisnummer) {
        super(postcode, huisnummer, "");
        Achternaam = achternaam;
        this.tussenvoegsel = "";
        this.voornaam = voornaam;
        this.voorletters = voorletters;
        this.geslacht = geslacht;
    }

    public NatuurlijkPersoon(Character geslacht, String voorletters, String voornaam, String achternaam, String tussenvoegsel, Postcode postcode, int huisnummer, String toevoeging) {
        super(postcode, huisnummer, toevoeging);
        Achternaam = achternaam;
        this.tussenvoegsel = tussenvoegsel;
        this.voornaam = voornaam;
        this.voorletters = voorletters;
        this.geslacht = geslacht;
    }


    @Override
    public String getAan() {
        String persoontype = "";
        if (geslacht == 'V') {
            persoontype = "mevrouw";
        } else {
            persoontype = "meneer";
        }
        return "Aan: " + persoontype + ' ' + voorletters + ' ' + Achternaam + "\n" + getAdres();
    }

    @Override
    public String getGeachte() {
        String persoontype = "";
        if (geslacht == 'V') {
            persoontype = "mevrouw";
        } else {
            persoontype = "meneer";
        }
        return "Geachte " + persoontype + ' ' + Achternaam;
    }
}
