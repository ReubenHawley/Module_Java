package bijeenkomst3.FilmScenario;

import java.util.ArrayList;

public class Scenario {

    private ArrayList<Scene> scenes;

    public Scenario() {
        scenes = new ArrayList<>();
    }

    public void voegSceneToe(Scene scene) {
        scenes.add(scene);
    }

    public void print() {
        try {
            for (int i = 0; i < scenes.size(); i++) {
                System.out.println("SCENE " + (i + 1));
                scenes.get(i).print();
                System.out.println("\n");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Actie array is empty");
        }
    }

    public int berekenTotaleTijd() {
        int sum = 0;
        for (Scene scene : scenes) {
            sum += scene.getTijd();
        }
        return sum;
    }

    public int telAantalActies() {
        int count = 0;
        for (Scene scene : scenes) {
            count += scene.telAantalActies();
        }
        return count;
    }

    public int telAantalActiesMetGedrag() {
        int count = 0;
        for (Scene scene : scenes) {
            count += scene.telAantalActiesMetGedrag();
        }
        return count;
    }

    public Scene zoekLangsteScene() {
        Scene langste = null;
        for (int i = 0; i < scenes.size(); i++) {
            if (i == 0) {
                langste = scenes.get(i);
            } else {
                if (scenes.get(i).getTijd() > langste.getTijd()) {
                    langste = scenes.get(i);
                }
            }
        }
        return langste;
    }

    public Scene zoeksceneMetMeesteActies() {
        Scene langste = null;
        for (int i = 0; i < scenes.size(); i++) {
            if (i == 0) {
                langste = scenes.get(i);
            } else {
                if (
                        scenes.get(i).telAantalActies() > langste.telAantalActies()) {
                    langste = scenes.get(i);
                }
            }
        }
        return langste;
    }

}