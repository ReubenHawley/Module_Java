package com.reubenhawley;

public class AutoTest {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        System.out.println(skoda);
        skoda.setMerk("Skoda");
        skoda.setType("Fabia");
        skoda.setPk(60);
        System.out.println(skoda);

        Auto tesla = new Auto();
        tesla.setMerk("Tesla");
        tesla.setType("S");
        tesla.setPk(400);

        skoda.voerOp(skoda.berekenOpvoerMogelijkheid()- skoda.getPk());
        skoda.voerOp(skoda.berekenOpvoerMogelijkheid()- skoda.getPk());
        skoda.voerOp(skoda.berekenOpvoerMogelijkheid()- skoda.getPk());
        skoda.voerOp(skoda.berekenOpvoerMogelijkheid()- skoda.getPk());
        System.out.println(skoda);
        /*
        Skoda opvoeren met 40 pk
        resultaat: Skoda Fabia (100 pk, maximaal op te voeren met 80)
        Skoda opvoeren met 80 pk
        resultaat: Skoda Fabia (180 pk, maximaal op te voeren met 160)
        Skoda opvoeren met 160 pk
        resultaat: Skoda Fabia (340 pk, maximaal op te voeren met 320)
        Skoda opvoeren met 320 pk
        resultaat: Skoda Fabia (660 pk, maximaal op te voeren met 640)
        Skoda Fabia (660 pk, maximaal op te voeren met 640)
*/
    }

    public static int Compare(Auto car1, Auto car2) {
        int difference = car1.getPk() - car2.getPk();
        if (difference > 0) {
            System.out.println("de " + car1.getMerk() + " heeft meer vermogen dan de " + car2.getMerk() + " , het verschil is " + difference + " pk");
        } else if (difference == 0) {
            System.out.println("de " + car1.getMerk() + " heeft hetzelfde vermogen als de " + car2.getMerk() + " , het verschil is " + difference + " pk");
        } else {
            difference = difference * -1;
            System.out.println("de " + car1.getMerk() + " heeft minder vermogen dan de " + car2.getMerk() + " , het verschil is " + difference + " pk");
        }
        return difference;
    }
}
