package bijeenkomst3;

public class Artiest {
    private String name;

    Artiest(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "artiest " + name ;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
