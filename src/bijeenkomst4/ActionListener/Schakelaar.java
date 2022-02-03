package bijeenkomst4.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schakelaar implements ActionListener {
    public boolean knopAan;

    public Schakelaar() {
        this.knopAan = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        knopAan = !knopAan;
        if (knopAan) {
            System.out.println("Het ligt is aan");
        }else{
            System.out.println("Het ligt is uit");
        }
    }
}
