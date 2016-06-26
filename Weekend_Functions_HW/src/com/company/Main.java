package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    // Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        public int sumDouble(int a, int b) {
            int sum = a+b;
            if (a==b) {
                sum = sum *2;
            }
            return sum;
        }

//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        else {
            return false;
        }
    }
//
 //   Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
    public int close10(int a, int b) {
        int valuea = Math.abs(10-a);
        int valueb = Math.abs(10-b);
        if (valuea > valueb) {
            return a;
        }
        else if (valueb > valuea) {
            return b;
        }
        else {
            return 0;
        }
    }
}
