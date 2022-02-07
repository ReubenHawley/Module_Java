package bijeenkomst4.fflekkersnacken;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Bestelling> bestellingen = new ArrayList();

    public static void main(String[] args) throws InterruptedException {

        /**
         * TEST LIJST CONTROLEREN
         */
        ArrayList<Bestelling> bestellingen = new ArrayList();
        String test_locatie = "a";
        String test_tijd = "1";
        String test_klas = "a";

        Bestelling b1 = new Bestelling(test_locatie, test_tijd, test_klas);
        Bestelling b2 = new Bestelling(test_locatie, test_tijd, test_klas);
        Bestelling b3 = new Bestelling(test_locatie, test_tijd, test_klas);
        Bestelling b4 = new Bestelling(test_locatie, test_tijd, "b");
        bestellingen.add(b1);
        bestellingen.add(b2);
        bestellingen.add(b3);
        bestellingen.add(b4);

        ArrayList<Bestelling> arr = Bestelling.bestellingenControleren(bestellingen);
        System.out.println(arr.size());

        boolean run = true;
        while (run) {
            System.out.println("Wat wil je doen?");
            System.out.println("1) Bestellen");
            System.out.println("2) Stoppen");
            System.out.println("3) Besteloverzicht printen");
            int i = input.nextInt(); // getting an integer
            if (i == 1) {
                String klas = getKlasVoorBestelling();
                String locatie = getLocatieVoorBestelling();
                String tijd = getTijdVoorBestelling();
                Bestelling bestelling = new Bestelling(locatie, tijd, klas);
                addBestelling(bestelling);

                addBestelling(bestelling);
                boolean bestellen = true;
                while (bestellen) {
                    BestellingItem bestellingItem = getBestellingItemVoorBestelling();
                    bestelling.addBestellingItem(bestellingItem);
                    String[] instructieVerderGaan = {
                            "Wil je nog meer producten toevoegen aan je bestelling?",
                            "1) Ja",
                            "2) Nee"
                    };

                    String wilDoorgaan = print(instructieVerderGaan);
                    if (wilDoorgaan.equals("Nee")) {
                        bestellen = false;
                    }
                }
            } else if (i == 2) {
                run = false;

            } else if (i == 2) {
                afsluiten();
            } else if (i == 3) {
                printBestellingen();
            } else {
                System.out.println("Ongeldige keuze.");
            }
        }

    }

    public static void addBestelling(Bestelling bestelling) {
        boolean isToegevoegd = false;
        for (Bestelling bestellingInLijst : bestellingen) {
            if (bestellingInLijst.equals(bestelling)) {
                bestellingInLijst.bestellingRecords.addAll(bestelling.bestellingRecords);
                bestelling = null;
                isToegevoegd = true;
                break;
            }
        }

        if (!isToegevoegd) {
            bestellingen.add(bestelling);
        }
    }

    public static String getKlasVoorBestelling() {
        String[] instructie = {
                "Voor welke klas is de bestelling?",
                "1) ICTM1a",
                "2) ICTM1b",
                "3) ICTM1c"
        };
        String klas = print(instructie);
        return klas;
    }

    private static String getLocatieVoorBestelling() {
        String[] instructie = {
                "Waar moet de bestelling bezorgd worden?",
                "1) T5.01",
                "2) T5.02",
                "3) T5.03"
        };
        String locatie = print(instructie);
        return locatie;
    }

    private static String getTijdVoorBestelling() {
        String[] instructie = {
                "Tijdens welk collegeuur moet de bestelling bezorgd worden?",
                "1) 1",
                "2) 2",
                "3) 3",
                "4) 4",
                "5) 5",
                "6) 6",};

        String tijd = print(instructie);
        return tijd;
    }

    private static BestellingItem getBestellingItemVoorBestelling() {

        String[] instructie = {
                "Welk product wil je toevoegen aan de bestelling?",
                "1) Cola",
                "2) Koffie",
                "3) Malt bier",
                "4) Brownie",
                "5) Mars",
                "6) Fruitshake",};
        String product = print(instructie);

        String[] instructieAantal = {
                "Hoeveel van " + product + " wil je bestellen? ",
                "1) 1",
                "2) 2",
                "3) 3",
                "4) 4",
                "5) 5",
                "6) 10",
                "7) 20",
                "8) 30"
        };
        int aantalProducten = Integer.parseInt(print(instructieAantal));

        return new BestellingItem(product, aantalProducten);
    }

    private static String print(String[] regels) throws ArrayIndexOutOfBoundsException {
        for (String regel : regels) {
            System.out.println(regel);
        }

        int i = input.nextInt();

        if (i < 1 || i > regels.length - 1)
            throw new ArrayIndexOutOfBoundsException(String.format("Ongeldige keuze. Keuze moet liggen tussen 1 en %d", regels.length - 1));
        else {
            String waarde = regels[i].substring(regels[i].indexOf(' ') + 1);
            return waarde;
        }
    }

    private static void printBestellingen() {
        System.out.println("Bestellingen-overzicht: ");
        for (Bestelling bestelling : bestellingen) {
            System.out.println(bestelling.toString());
        }
    }

    private static void afsluiten() throws InterruptedException {
        System.out.println("De applicatie wordt afgesloten. Bedankt voor uw bestelling!");
        System.out.println("De applicatie sluit over 2 seconden...");
        System.out.println("Bye Bye");
        Thread.sleep(2000);
        System.exit(0);
    }

}
