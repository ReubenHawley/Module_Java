package bijeenkomst3.FilmScenario;

import java.util.ArrayList;

public class Scene {

    private String beschrijving;
    private ArrayList<Actie> acties;
    private int tijd;

    public Scene(String beschrijving, int tijd) {
        this.beschrijving = beschrijving;
        this.tijd = tijd;
        acties = new ArrayList<>();
    }

    public void voegActieToe(Rol rol, String tekst) {
        Actie actie = new Actie(rol, tekst);
        acties.add(actie);
    }

    public void voegActieToe(Rol rol, String tekst, String gedrag) {
        Actie actie = new Actie(rol, tekst, gedrag);
        acties.add(actie);
    }

    public void print() {
        try {
            System.out.println(" --- " + beschrijving + " ---");
            for (Actie actie : acties) {
                actie.print();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Actie array is empty");
        }
    }
}