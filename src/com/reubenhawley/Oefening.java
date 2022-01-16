package com.reubenhawley;

public class Oefening {

    public void drieAWhile(int size){
        int count = 0;
        int innerCount = 0;
        while (count < size){
            // count the inner loop and update inner loop
            if (innerCount < size -1){
                System.out.print("*");
            innerCount ++;
            }
            // count the last value of the inner loop and update the outer loop after printing and reset inner loop to 0
            else{
                System.out.println("*");
            count++;
            innerCount = 0;
            }
        }
    }
    public void drieCWhile(int length, int breadth){
        int count = 0;
        int innerCount = 0;
        while (count < length){
            // count the inner loop and update inner loop
            if (innerCount < breadth -1){
                System.out.print("*");
                innerCount ++;
            }
            // count the last value of the inner loop and update the outer loop after printing and reset inner loop to 0
            else{
                System.out.println("*");
                count++;
                innerCount = 0;
            }
        }
    }
    public void drieDWhile(int length){
        int count = 0;
        int innerCount = 0;
        while (count<length){
            System.out.print("*");

            if (innerCount<count){
                System.out.println("*");
                innerCount ++;
            }
            count ++;
        }
    }
}
