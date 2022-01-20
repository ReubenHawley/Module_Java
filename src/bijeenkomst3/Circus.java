package bijeenkomst3;

public class Circus {

    private String name;
    private Artiest[] artiesten;

    Circus() {
        this.artiesten = new Artiest[3];
    }

    public int getAantalArtiesten() {
        return artiesten.length;
    }

    public void printArtiesten() {
        for (Artiest kunstenaar : artiesten) {
            System.out.println(kunstenaar);
        }
    }

    public Artiest[] getArtiesten() {
        return this.artiesten;
    }

    public void setArtiesten(Artiest[] artiesten) {
        this.artiesten = artiesten;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
