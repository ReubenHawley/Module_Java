package bijeenkomst4.LegitimatieBewijs;

import bijeenkomst3.TVGids;
import bijeenkomst3.TalkShow;
import bijeenkomst3.TvSeries;
import bijeenkomst4.LegitimatieBewijs.Paspoort;
import bijeenkomst4.LegitimatieBewijs.Persoon;
import bijeenkomst4.LegitimatieBewijs.Rijbewijs;

public class Main {
    public static void main(String[] args) {
        TvSeries breakingBad = new TvSeries("Breaking Bad", 45, 1, "John Malkovich");
        TalkShow JerrySpringer = new TalkShow("Jerry Springer", 45, "Jerry Springer", "Love not actually");
        TVGids gids = new TVGids();

        gids.VoegProgrammaToe(breakingBad);
        gids.VoegProgrammaToe(JerrySpringer);

        gids.print();
        System.out.println("\n");

        // legitimatieBewijs
        Persoon persoon1 = new Persoon(new Paspoort("Hannie", "44320098"));
        Persoon persoon2 = new Persoon(new Indentiteitskaart("Jennie", "44320098"));
        Persoon persoon3 = new Persoon(new Rijbewijs("Tonnie", "44320098", "BE"));
        System.out.println(persoon1.getLegitimatie());
        System.out.println(persoon2.getLegitimatie());
        System.out.println(persoon3.getLegitimatie());

        persoon1.toonOverzicht();
        persoon2.toonOverzicht();
        persoon3.toonOverzicht();


    }
}
