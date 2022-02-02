package bijeenkomst3.FilmScenario;

import java.util.ArrayList;

public class Film {

    private String titel;
    private Scenario scenario;
    private ArrayList<Acteur> acteurs;

    public Film(String titel) {
        this.titel = titel;
        acteurs = new ArrayList<>();
    }

    public void voegActeurToe(Acteur acteur) {
        this.acteurs.add(acteur);
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
}
