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
    public int berekenTotaleTijd(){
        int sum =0;
        for (Scene scene:scenes) {
            sum += scene.getTijd();
        }
        return sum;
    }

}