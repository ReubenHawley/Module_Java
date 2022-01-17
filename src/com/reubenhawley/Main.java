package com.reubenhawley;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Drie oefening = new Drie();
        Vier oefening2 = new Vier();
        Oefening oefening5 = new Oefening();
        System.out.println("Exercise 3A");
        oefening.AWhile(8);

        System.out.println("Exercise 3C");
        oefening.CWhile(8, 20);
        System.out.println("Exercise 3D");
        oefening.DWhile(8);
        System.out.println("Exercise 3G");
        oefening.GWhile(4);
        System.out.println("Exercise 3H");
        oefening.HWhile(6);
        System.out.println("Exercise 3A: FOR");
        oefening.AFor(6);
        System.out.println("Exercise 3C: FOR");
        oefening.CFor(6,3);
        System.out.println("Exercise 3D: FOR");
        oefening.DFor(6);
        System.out.println("Exercise 3G: FOR");
        oefening.GFor(6);
        System.out.println("Exercise 3H: FOR");
        oefening.HFor(7);
        System.out.println("Exercise 4B:");
        oefening2.B("Reuben");
        System.out.println("Exercise 4C:");
        oefening2.C("Arjan","Loes");
        System.out.println("Exercise 5A:");
        oefening5.vijfA();
        System.out.println("Exercise 5B:");
        oefening5.vijfB();
        System.out.println("Exercise 5C:");
        oefening5.vijfC();
        System.out.println("Exercise 6:");
        oefening5.Zes();
    }
}
