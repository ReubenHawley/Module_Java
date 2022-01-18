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
        if (!bewolking) {
            setZon(true);
            setNeerslag(false);
        }
    }

    public void setZon(boolean zon) {
        this.zon = zon;
    }

    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
        if (neerslag) {
            setBewolking(true);
        }
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
        this(temperatuur, windkracht, windRichting, false, false, true);
    }

    Weerbericht(double temperatuur, int windkracht, String windRichting, boolean zon, boolean bewolking, boolean neerslag) {
        setTemperatuur(temperatuur);
        setWindKracht(windkracht);
        setWindRichting(windRichting);
        setZon(zon);
        setBewolking(bewolking);
        setNeerslag(neerslag);
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
//        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
//        System.out.println(weerbericht.getTemperatuur());
//        System.out.println(weerbericht.getWindkracht());
//        System.out.println(weerbericht.getWindrichting());
//
//        //opdracht B
//        System.out.println(weerbericht);
//        weerbericht.setZon(true);
//        System.out.println(weerbericht);
//        weerbericht.setBewolking(true);
//        System.out.println(weerbericht);
//        weerbericht.setNeerslag(true);
//        System.out.println(weerbericht);

        //opdracht C
        Weerbericht weerbericht2 = new Weerbericht(5.7, 7, "NO", true, false, false);
        System.out.println(weerbericht2);

        //opdracht e
        // geen bewolking, wel neerslag, geen zon: dat kan niet,
        // dus geen bewolking? dan ook geen neerslag en wel zon
        Weerbericht weerbericht3 = new Weerbericht(4.0, 9, "NO", false, true, false);
        System.out.println(weerbericht3);
        // geen wolken? dan dus ook geen neerslag en wel zon
        weerbericht3.setBewolking(false);
        System.out.println(weerbericht3);
    }
}
