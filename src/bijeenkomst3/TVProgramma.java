package bijeenkomst3;

public abstract class  TVProgramma {
    private String titel;
    private int tijdsDuur;
    private String zender;

    public TVProgramma(String titel, int tijdsDuur) {
        this.titel = titel;
        this.tijdsDuur = tijdsDuur;
    }

    public String getZender() {
        return this.zender;
    }

    public void setZender(String zender) {
        this.zender = zender;
    }

    public int getTijdsDuur() {
        return this.tijdsDuur;
    }

    public void setTijdsDuur(int tijdsDuur) {
        this.tijdsDuur = tijdsDuur;
    }
    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

}
