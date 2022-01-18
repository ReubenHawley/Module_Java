package bijeenkomst2;

public class Hemellichaam {
    private String naam;
    private String type;

    public String getType() {
        return this.type;
    }

    public String getNaam() {
        return this.naam;
    }
    Hemellichaam(String naam, String type){
        this.naam = naam;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hemellichaam (" + type +')';
    }

    public static void main(String[] args) {
        Hemellichaam hl1 = new Hemellichaam("Mercurius", "planeet");
        System.out.println("naam: " + hl1.getNaam());
        System.out.println("type: " + hl1.getType());
        System.out.println(hl1);
    }
}
