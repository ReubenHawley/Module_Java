package bijeenkomst3;

import java.time.LocalDateTime;

public class Bericht {

    public static void main(String[] args) {
        int aantal = 6;
        String[] berichten = new String[6];
        berichten[0] = "Hoi";
        berichten[1] = "Hallo, Hoe gaat het?";
        berichten[2] = "Goed! Met jou ook?";
        berichten[3] = "Prima, maar ik moet wel weer verder";
        berichten[4] = "Oké tot snel!";
        berichten[5] = "Doei!";
        if (aantal == berichten.length) {
            System.out.println("Er zijn " + berichten.length + " berichten");
        }
        for (int i=0;i<berichten.length;i++){
            System.out.println(berichten[i]);
        }
    }
}
