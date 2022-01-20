package bijeenkomst3;

public class Oefening {
    public static void EenB() {
        String[] letters = {"A", "B", "C"};
        for (int i=0; i < letters.length; i++) {
            System.out.println((i+1)+": "+letters[i]);
        }
    }
    public static void EenC() {
        String[] letters = {"A", "B", "C"};
        int count = 1;
        for (String letter:letters) {
            System.out.println( count+": "+letter);
            count++;
        }
    }

    public static void main(String[] args) {
        Oefening.EenB();
        Oefening.EenC();
    }
}
