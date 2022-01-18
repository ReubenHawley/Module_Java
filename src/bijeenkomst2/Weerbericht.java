package bijeenkomst2;

public class Weerbericht {
    private String windRichting;
    private int windkracht;
    private double temperatuur;
    private boolean neerslag;
    private boolean zon;

    public double getTemperatuur() {
        return this.temperatuur;
    }

    public int getWindkracht() {
        return this.windkracht;
    }

    public String getWindrichting() {
        return this.windRichting;
    }

    public void setZon(boolean zon) {
        this.zon = zon;
    }

    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
    }

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public void setWindKracht(int windkracht) {
        this.windkracht = windkracht;
    }

    public void setWindRichting(String windRichting) {
        this.windRichting = windRichting;
    }

    Weerbericht(double temperatuur, int windkracht, String windRichting) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windRichting = windRichting;
    }

    public static void main(String[] args) {
        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());

    }
}
