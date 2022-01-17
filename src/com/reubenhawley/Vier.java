package com.reubenhawley;

import org.jetbrains.annotations.NotNull;

public class Vier {

    public void B(@NotNull String word){
        System.out.println(word +" "+ word.length()  + " letters");
        // e.g output: Esmee 5 letters
    }
    public void C(@NotNull String word1, @NotNull String word2){
        if (word1.length() > word2.length()){
            System.out.println(word1 +" is een langere naam dan "+word2);
        }else if (word1.length() < word2.length()){
            System.out.println(word1 +" is een kortere naam dan "+word2);
        }else {
            System.out.println(word1 +" is hetzelfde lengte naam als "+word2);
        }
        //e.g output: Arjan is een langere naam dan Loes
    }


}
