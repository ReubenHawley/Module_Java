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

    public void setTemperatuur(int tempMin) {
        this.tempMin = tempMin;
    }

    public void setTemperatuur(int temp, int tempMax) {
        this.tempMin = temp;
        this.tempMax = tempMax;
    }

    private void printTemperatuur() {
        System.out.println("Het is minimaal "+tempMin+" graden, en maximaal "+ tempMax+" graden\n");
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


    }



}
