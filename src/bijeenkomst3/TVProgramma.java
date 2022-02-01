package bijeenkomst3;

public class TVProgramma {
    private String titel;
    private int tijdsDuur;
    private String zender;

    public String getZender() {
        return this.zender;
    }

    public void setZender(String zender) {
        this.zender = zender;
    }

    public TVProgramma(String titel, int tijdsDuur) {
        this.titel = titel;
        this.tijdsDuur = tijdsDuur;
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
    public void printProgramma(){

    }

    public static void main(String[] args) {


    }
}
