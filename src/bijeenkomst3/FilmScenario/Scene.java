package bijeenkomst3.FilmScenario;

import java.util.ArrayList;

public class Scene {

    private String beschrijving;
    private ArrayList<Actie> acties;
    private int tijd;

    public int getTijd() {
        return tijd;
    }

    public ArrayList<Actie> getActies() {
        return acties;
    }

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
            System.out.println(" --- " + beschrijving + " (" + tijd + ") ---");
            for (Actie actie : acties) {
                actie.print();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Actie array is empty");
        }
    }

    public int telAantalActies() {
        return acties.size();
    }

    public int telAantalActiesMetGedrag() {
        int count = 0;
        for (Actie actie :
                acties) {
            if (actie.getGedrag() != null) {
                count++;
            }
        }
        return count;
    }

    public int telAantalActiesVanRol(Rol rol) {
        int count = 0;
        for (Actie actie : acties) {
            if (actie.getRol() == rol) {
                count++;
            }
        }
        return count;
    }

    public int telAantalActiesVanRolMetGedrag(Rol rol) {
        int count = 0;
        for (Actie actie : acties) {
            if (actie.getGedrag() != null) {
                if (actie.getRol() == rol) {
                    count++;
                }
            }
        }
        return count;
    }

}