package bijeenkomst4.BestandSchrijven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bestandlezer {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File f = new File("bestandsnaam.txt");
            Scanner scanner = new Scanner(f);
            System.out.println("Dit is de inhoud van het bestand: ");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}