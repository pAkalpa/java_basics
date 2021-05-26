package me.pasindu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while (counter < 11) {
            System.out.print("Enter number #" + counter + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        System.out.println("Sum of 10 numbers = " + sum);
        scanner.close();
    }
}
