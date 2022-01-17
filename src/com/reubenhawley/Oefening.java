package com.reubenhawley;

public class Oefening {
    public void vijfA() {
        String tekst = "a";

        tekst += tekst;
        System.out.println(tekst);
        tekst += tekst;
        System.out.println(tekst);
        tekst += tekst;
        System.out.println(tekst);

        /*
        Expected output:
aa 2
aaaa 4
aaaaaaaa 8
*/
    }

    public void vijfB() {
        String tekst = "a";

        tekst += tekst;
        System.out.println(tekst + " " + tekst.length());
        tekst += tekst;
        System.out.println(tekst + " " + tekst.length());
        tekst += tekst;
        System.out.println(tekst + " " + tekst.length());

        /*
        Expected output:
aa
aaaa
aaaaaaaa
*/
    }

    public void vijfC() {
        String tekst = "a";

        tekst += tekst;
        System.out.println(tekst.toUpperCase() + " " + tekst.length());
        tekst += tekst;
        System.out.println(tekst + " " + tekst.length());
        tekst += tekst;
        System.out.println(tekst.toUpperCase() + " " + tekst.length());

        /*
        Expected output:
AA 2
aaaa 4
AAAAAAAA 8

*/
    }

    public void Zes(){
        int aantal = 1;
        System.out.println("ik zie " + aantal + " vogel");
        if (aantal > 1) {
            System.out.println("ik zie " + aantal + " vogels");

        }
    }
}
