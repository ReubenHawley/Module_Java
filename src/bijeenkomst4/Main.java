package bijeenkomst4;

import bijeenkomst3.TVGids;
import bijeenkomst3.TalkShow;
import bijeenkomst3.TvSeries;

public class Main {
    public static void main(String[] args) {
        TvSeries breakingBad = new TvSeries("Breaking Bad",45,1, "John Malkovich");
        TalkShow JerrySpringer = new TalkShow("Jerry Springer",45, "Jerry Springer","Love not actually");
        TVGids gids = new TVGids();

        gids.VoegProgrammaToe(breakingBad);
        gids.VoegProgrammaToe(JerrySpringer);

        gids.print();

    }
}
