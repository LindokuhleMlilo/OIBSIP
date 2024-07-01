package org.Game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(101);
        int count = 0;
        System.out.println("The number is " + randomNumber);

        while (true) {
            System.out.println("Enter your guess between (1 - 100): ");

            if (scanner.hasNextInt()) {
                int playerGuess = scanner.nextInt();
                count++;

                if (playerGuess == randomNumber) {
                    System.out.println("Correct! You won!");
                    System.out.println("It took you " + count + " tries to win.");
                    break;
                } else if (count == 5) {
                    System.out.println("You lost. The number was " + randomNumber);
                    break;
                } else if (playerGuess < randomNumber) {
                    System.out.println("The number is higher. Guess again.");
                } else {
                    System.out.println("The number is lower. Guess again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}
