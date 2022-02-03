package bijeenkomst4.FilmScenario;

import java.util.ArrayList;

public class Film {

    private String titel;
    private Scenario scenario;
    private ArrayList<Persoon> personen;
    private int draaidagen;

    public Film(String titel) {
        this.titel = titel;
        personen = new ArrayList<>();
    }

    public void voegActeurToe(Acteur acteur) {
        this.personen.add(acteur);
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public void print() {
        System.out.println('\"' + titel + '\"' + '(' + scenario.berekenTotaleTijd() + " min.)");
        System.out.println("----------------------");
        System.out.println("Een film met:");
        // print actors
        for (Persoon persoon : personen) {
            if (persoon instanceof Acteur) {
                persoon.print();
            }

        }

        // print medewerkers
        for (Persoon persoon : personen) {
            if (persoon instanceof Medewerker) {
                persoon.print();
            }
        }
        System.out.println("\n*** Scenario ***");
        scenario.print();
    }

    public double totaleKosten() {
        double totaleKosten = 0;
        for (Persoon persoon : personen) {
            totaleKosten += persoon.berekenBeloning(draaidagen);
        }
        return totaleKosten;
    }

}
