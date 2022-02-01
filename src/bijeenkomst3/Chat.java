package bijeenkomst3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Chat {
    private String naam;
    private ArrayList<Bericht> berichten;

    public Chat(String naam) {
        this.naam = naam;
        this.berichten = new ArrayList<>();
    }

    public void voegToe(Bericht bericht) {
        berichten.add(bericht);
    }

    public void printChat() {
        for (Bericht bericht : berichten) {
            System.out.println(bericht);
        }
    }

    public void printBerichtenSinds(LocalDateTime datum) {
        for (Bericht bericht : berichten) {
            LocalDateTime time = bericht.getDatum();
            if (datum.isBefore(time)) {
                System.out.println(bericht);
            }
        }
    }

    public void printBerichtenVan(Gebruiker gebruiker) {
        String naam = gebruiker.getNaam();

        for (Bericht bericht : berichten) {
            String afzender = bericht.getAfzender().getNaam();
            if (Objects.equals(afzender, naam)) {
                System.out.println(bericht);
            }
        }
    }

    public ArrayList<Bericht> ZoekBerichtenVan(Gebruiker gebruiker) {
        ArrayList<Bericht> korteLijst = new ArrayList<>();
        for (Bericht bericht : berichten) {
            if (bericht.getAfzender() == gebruiker) {
                korteLijst.add(bericht);
            }
        }
        return korteLijst;
    }

    public ArrayList<Bericht> ZoekBerichtenVan(ArrayList<Gebruiker> gebruikers) {
        ArrayList<Bericht> korteLijst = new ArrayList<>();
        for (Bericht bericht : berichten) {
            for (Gebruiker gebruiker : gebruikers) {
                if (bericht.getAfzender() == gebruiker) {
                    korteLijst.add(bericht);
                }
            }
        }
        return korteLijst;
    }

    public ArrayList<Bericht> ZoekBerichten(String tekst) {
        ArrayList<Bericht> korteLijst = new ArrayList<Bericht>();
        for (Bericht bericht : berichten) {
            if (bericht.getBericht().contains(tekst)) {
                korteLijst.add(bericht);
            }
        }
        return korteLijst;
    }
}
