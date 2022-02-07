package bijeenkomst4.BestandSchrijven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BestandSchrijver {
    public static void main(String[] args) {

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("C:/bestandsnaam.txt"));
            String[] namen = new String[]{"Michiel", "Amy", "Joost"};
            try {
                for (int i = 0; i < 4; i++)
                    writer.println(namen[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("BestandSchrijver kan niet gemaakt worden:[" + e.getMessage() + ']');
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
