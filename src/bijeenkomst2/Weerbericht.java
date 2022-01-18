package bijeenkomst2;

public class Weerbericht {
    private String windRichting;
    private int windkracht;
    private double temperatuur;
    private boolean bewolking;
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

    public void setBewolking(boolean bewolking) {
        this.bewolking = bewolking;
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

    Weerbericht(double temperatuur, int windkracht, String windRichting,boolean zon, boolean bewolking, boolean neerslag) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windRichting = windRichting;
        this.zon = zon;
        this.bewolking = bewolking;
        this.neerslag = neerslag;
    }

    @Override
    public String toString() {
        //Weerbericht - temperatuur: 5.7, wind: 7 NO, zon
        //Weerbericht - temperatuur: 5.7, wind: 7 NO, bewolking, zon
        //Weerbericht - temperatuur: 5.7, wind: 7 NO, neerslag, bewolking, zon
        String weerbericht = ("Weerbericht - temperatuur: " + temperatuur + " ,wind: " + windkracht + " " + windRichting);
        if (neerslag) {
            weerbericht += " ,neerslag";
        }
        if (bewolking) {
            weerbericht += " ,bewolking";
        }
        if (zon) {
            weerbericht += " ,zon";
        }
        return weerbericht;
    }

    public static void main(String[] args) {
        //opdracht A
        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());

        //opdracht B
        weerbericht.setZon(true);
        System.out.println(weerbericht);
        weerbericht.setBewolking(true);
        System.out.println(weerbericht);
        weerbericht.setNeerslag(true);
        System.out.println(weerbericht);

        //opdracht C
        Weerbericht weerbericht2 = new Weerbericht(5.7, 7, "NO",true,true,true);
        System.out.println(weerbericht2);
    }
}
