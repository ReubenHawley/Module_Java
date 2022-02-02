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

    public void print() {
        System.out.println('\"' + titel + '\"' + '(' + scenario.berekenTotaleTijd() + " min.)");
        System.out.println("----------------------");
        System.out.println("Een film met:");
        for (Acteur acteur : acteurs) {
            acteur.print();
        }
        System.out.println("\n*** Scenario ***");
        scenario.print();
    }

    public Acteur zoekActeurMetMeesteActies() {
        Acteur meeste = null;
        Rol rol = scenario.getMeesteActies();
        for (Acteur acteur : acteurs) {
            if (acteur.getRol()==rol){
                meeste = acteur;
            }
        }
        return meeste;
    }

}
