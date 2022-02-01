package bijeenkomst3;

import java.util.ArrayList;

public class TVGids {
    private ArrayList<TVProgramma> programmas;

    public TVGids() {
        this.programmas = new ArrayList<>();
    }
    public void VoegProgrammaToe(TVProgramma programma){
        programmas.add(programma);
    }
    public void print(){
        System.out.println("-------programma Overzicht--------");
        for(TVProgramma programma:programmas){
            System.out.println(programma);
        }
    }
}
