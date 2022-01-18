package bijeenkomst2;

public class Hemellichaam {
    private String naam;
    private String type;
    private int tempMin;
    private int tempMax;

    public String getNaam() {
        return this.naam;
    }

    public String getType() {
        return this.type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public void setTemperatuur(int temp) {
        this.tempMin = temp;
        this.tempMax = temp;
    }

    public void setTemperatuur(int tempMin, int tempMax) {
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    private void printTemperatuur() {
        if (tempMax == tempMin) {
            System.out.println("Het temperatuur is ongeveer " + tempMin + " graden\n");

        } else {
            System.out.println("Het is minimaal " + tempMin + " graden, en maximaal " + tempMax + " graden\n");
        }
    }

    Hemellichaam(String naam, String type) {
        new Hemellichaam(naam);
        this.type = type;

    }

    Hemellichaam(String naam) {
        this.naam = naam;
        this.type = "onbekend";
        this.tempMin = 0;
        this.tempMax = 0;
    }

    @Override
    public String toString() {
        return naam + "(" + type + ")";
    }

    public static void main(String[] args) {
        Hemellichaam hl1 = new Hemellichaam("Mercurius", "planeet");
        System.out.println("naam: " + hl1.getNaam());
        System.out.println("type: " + hl1.getType());
        System.out.println(hl1);

        //opdracht D
        Hemellichaam hl3 = new Hemellichaam("Pluto", "planeet");
        System.out.println(hl3);
        hl3.setType("dwergplaneet");
        System.out.println(hl3);

        //opdracht E
        Hemellichaam hl4 = new Hemellichaam("Aarde", "planeet");
        hl4.setTemperatuur(-89, 58);
        hl4.printTemperatuur();

        //opdracht G
        Hemellichaam hl5 = new Hemellichaam("Antares", "ster");
        hl5.setTemperatuur(3204);
        hl5.printTemperatuur();


    }


}
