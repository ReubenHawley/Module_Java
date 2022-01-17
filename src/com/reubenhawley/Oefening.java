package com.reubenhawley;

public class Oefening {

    public void drieAWhile(int size) {
        int count = 0;
        int innerCount = 0;
        while (count < size) {
            // count the inner loop and update inner loop
            if (innerCount < size - 1) {
                System.out.print("*");
                innerCount++;
            }
            // count the last value of the inner loop and update the outer loop after printing and reset inner loop to 0
            else {
                System.out.println("*");
                count++;
                innerCount = 0;
            }
        }
    }

    public void drieCWhile(int length, int breadth) {
        int count = 0;
        int innerCount = 0;
        while (count < length) {
            // count the inner loop and update inner loop
            if (innerCount < breadth - 1) {
                System.out.print("*");
                innerCount++;
            }
            // count the last value of the inner loop and update the outer loop after printing and reset inner loop to 0
            else {
                System.out.println("*");
                count++;
                innerCount = 0;
            }
        }
    }

    public void drieDWhile(int length) {
        int count = 0;
        int innerCount = 0;
        while (count < length) {
            if (count == 0) {
                System.out.println("*");
            } else {
                while (innerCount < count) {
                    System.out.print("*");
                    innerCount++;
                }
                System.out.println("*");
                innerCount = 0;
            }
            count++;
        }
    }

    public void drieGWhile(int length) {
        length--;
        int innerCount = length;
        while (length != 0) {
            while (innerCount != 0) {
                System.out.print("*");
                innerCount--;
            }
            System.out.println("*");
            length--;
            innerCount = length;

        }
        System.out.println("*");
    }

    public void drieHWhile(int length) {
        if ((length % 2) != 0) {
            int count = 0;
            int innerCount = 0;
            while (count < length) {
                if (count == 0) {
                    System.out.println("*");
                } else {
                    while (innerCount < count) {
                        System.out.print("*");
                        innerCount++;
                    }
                    System.out.println("*");
                    innerCount = 0;
                }
                count++;
            }
            length--;
            length--;
            innerCount = length;
            while (length != 0) {
                while (innerCount != 0) {
                    System.out.print("*");
                    innerCount--;
                }
                System.out.println("*");
                length--;
                innerCount = length;

            }
            System.out.println("*");
        }
    }

    public void drieAFor(int length) {
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public void drieCFor(int length, int breadth) {
        for (int i = 0; i < breadth-1; i++) {
            for (int j = 0; j < length-1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

