package me.pasindu;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue + "\nFloat Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue + "\nDouble Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue + "\nMyFloatValue = " + myFloatValue + "\nMyDoubleValue = " + myDoubleValue);

        double pounds = 0.45359237;
        double numberOfPounds = 200d;
        double kilograms = numberOfPounds * pounds;
        System.out.println("No of Kilograms = " + kilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
