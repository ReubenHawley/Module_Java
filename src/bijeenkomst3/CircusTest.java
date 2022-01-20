package bijeenkomst3;

public class CircusTest {

    public static void main(String[] args) {
        Artiest artiest1 = new Artiest("Martha Morgana");
        System.out.println(artiest1);
        Act act1 = new Act("Trapeze", artiest1);
        System.out.println(act1);

    }
}
