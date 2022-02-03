package bijeenkomst4.FilmScenario;

import java.time.LocalDate;

public class Filmtest {

    public static void main(String[] args) {

        Film film = new Film("Een korte ontmoeting");

        Rol mevrouwDeKort = new Rol("Mevrouw de Kort", "vriendelijke mevrouw");
        Rol meneerVanLoon = new Rol("Meneer van Loon", "vriendelijke meneer");
        Rol conducteur = new Rol("Conducteur", "norse conducteur");

        Acteur dWinterland = new Acteur("Dagmar Winterland", LocalDate.of(1990, 02, 12), "m", mevrouwDeKort, 500.0, 100.5);
        Acteur hDrissi = new Acteur("Haroen Drissi", LocalDate.of(1988, 02, 12), "v", meneerVanLoon, 500.0, 95.0);
        Acteur hGerards = new Acteur("Hubert Gerards", LocalDate.of(1960, 06, 22), "m", conducteur, 150.0, 150.0);

        film.voegActeurToe(dWinterland);
        film.voegActeurToe(hDrissi);
        film.voegActeurToe(hGerards);

        Scenario scenario = new Scenario();

        Scene scene1 = new Scene("Op het perron", 3);
        scene1.voegActieToe(mevrouwDeKort, "Pardon, U staat op mijn tas");
        scene1.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien", "schrikt");
        scenario.voegSceneToe(scene1);

        Scene scene2 = new Scene("In de trein", 4);
        scene2.voegActieToe(conducteur, "Goedemorgen, vervoersbewijzen alstublieft");
        scene2.voegActieToe(meneerVanLoon, "Goedemorgen", "laat ov-kaart zien");
        scene2.voegActieToe(mevrouwDeKort, "Moment alstublieft", "zoekt haar tas");
        scene2.voegActieToe(conducteur, "Vervoersbewijs altublieft", "wordt ongeduldig");
        scene2.voegActieToe(meneerVanLoon, "Wat bent u ongeduldig");
        scene2.voegActieToe(mevrouwDeKort, "Ik ben mijn tas kwijt conducteur");
        scene2.voegActieToe(mevrouwDeKort, "Pardon meneer, U zit op mijn tas", "kijkt naar meneer van Loon");
        scene2.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien", "schrikt");
        scene2.voegActieToe(mevrouwDeKort, "Alstublieft", "haalt kaart tevoorschijn");
        scene2.voegActieToe(conducteur, "Dank u, prettige reis");
        scene2.voegActieToe(mevrouwDeKort, "Wat heeft u toch met mijn tas meneer?");
        scene2.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien, ik ben mijn bril vergeten", "lacht");
        scenario.voegSceneToe(scene2);

        film.setScenario(scenario);
        Actie actie1 = new Actie(conducteur, " hallo");

        Actie actie2 = new Actie(conducteur, "hallo", "draait zich om");

        System.out.println("Opdracht A");
        actie1.print();

        actie2.print();

        System.out.println("Opdracht B");
        scene1.print();
        System.out.println("Opdracht C");
        scenario.print();

        System.out.println("\nOpdracht D");
        film.print();
        System.out.println("\nOpdracht E");
        film.print();

        System.out.println("\nOpdracht F");
        System.out.println(scene1.telAantalActies());
        System.out.println(scene1.telAantalActiesMetGedrag());
        System.out.println(scene1.telAantalActiesVanRol(mevrouwDeKort));
        System.out.println(scene1.telAantalActiesVanRolMetGedrag(mevrouwDeKort));
        System.out.println(scenario.telAantalActies());
        System.out.println(scenario.telAantalActiesMetGedrag());
        System.out.println(scenario.zoekLangsteScene());
        System.out.println(scenario.zoeksceneMetMeesteActies());

//        System.out.println(film.zoekActeurMetMeesteActies());
    }
}

