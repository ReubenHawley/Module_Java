package bijeenkomst4.Postcode;

public abstract class Persoon {
    private Postcode postcode;
    protected int huisnummer;
    protected String toevoeging;

    public abstract String getAan();
    public abstract String getGeachte();

    public Persoon(Postcode postcode, int huisnummer, String toevoeging) {
        this.postcode = postcode;
        this.huisnummer = huisnummer;
        this.toevoeging = toevoeging;
    }

    public String getAdres(){
        String adress = postcode.getStraatnaam() + " " + huisnummer;
        if (toevoeging != null){
            adress += toevoeging;
        }
        adress += "\n"+postcode.getCode() + " "+ postcode.getWoonplaats();
        return adress;
    }

    public void setPostcode(Postcode postcode) {
        this.postcode = postcode;
    }
}
