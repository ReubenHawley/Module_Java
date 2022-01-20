package bijeenkomst3;

import java.util.ArrayList;

public class Act {
    private String name;
    private ArrayList<Artiest> artiesten;
    private int tijdsDuur;

    public int getTijdsDuur() {
        return this.tijdsDuur;
    }

    public void setTijdsDuur(int tijdsDuur) {
        this.tijdsDuur = tijdsDuur;
    }

    Act(String name, Artiest artiest){
        this.name = name;
        artiesten = new ArrayList<>();

    }
    public void voegArtiestToe(Artiest artiest){
        artiesten.add(artiest);
    }

    @Override
    public String toString() {
        return name + " "+ artiesten;
    }

    public ArrayList<Artiest> getArtiesten() {
        return this.artiesten;
    }


    public String getName() {
        return this.name;
    }

    public void setNaam(String name) {
        this.name = name;
    }
}
