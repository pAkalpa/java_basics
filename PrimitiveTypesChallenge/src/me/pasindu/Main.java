package me.pasindu;

public class Main {

    public static void main(String[] args) {

        byte myValidByteNumber = 10;
        short myValidShortNumber = 20;
        int myValidIntegerNumber = 50;
        long myNewLongNumber = 50000L + 10L * (myValidByteNumber + myValidIntegerNumber + myValidShortNumber);
        System.out.println(myNewLongNumber);

        short shortTotal = (short) (1000 + 10 * (myValidByteNumber + myValidIntegerNumber + myValidShortNumber));
        System.out.println(shortTotal);
    }
}
