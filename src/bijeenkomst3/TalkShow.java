package bijeenkomst3;

public class TalkShow extends TVProgramma{
    private String presentator;
    private String onderwerp;

    public TalkShow(String titel, int tijdsDuur,String presentator, String onderwerp) {
        super(titel, tijdsDuur);
        this.onderwerp = onderwerp;
        this.presentator = presentator;
    }

    public String getOnderwerp() {
        return this.onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }
    public String getPresentator() {
        return this.presentator;
    }

    public void setPresentator(String presentator) {
        this.presentator = presentator;
    }

    @Override
    public String toString() {
        return "TalkShow{" +
                "zender='" + getZender() + '\'' +
                ", tijdsDuur=" + getTijdsDuur() +
                ", titel='" + getTitel() + '\'' +
                ", presentator='" + presentator + '\'' +
                ", onderwerp='" + onderwerp + '\'' +
                '}';
    }
}
