package me.pasindu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
//        boolean first =true;

        while (true) {
            System.out.print("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int value = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    minValue = value;
//                    maxValue = value;
//                }

                if (value > maxValue) {
                    maxValue = value;
                }

                if (value < minValue) {
                    minValue = value;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("min = " + minValue + ", max = " + maxValue);
        scanner.close();
    }
}
