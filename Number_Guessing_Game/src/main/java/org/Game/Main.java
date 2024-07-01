package org.Game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int rounds = 3;
        int maxAttemptsPerRound = 5;
        int pointsPerGuess = 10;
        int count = 0;
        int totalPoints = 0;

        while (rounds > 0) {
            int randomNumber = rand.nextInt(101); // Generate a new random number for each round
            count = 0;
            System.out.println("Round " + (4 - rounds));

            while (count < maxAttemptsPerRound) {
                System.out.println("Enter your guess between (1 - 100): ");

                if (scanner.hasNextInt()) {
                    int playerGuess = scanner.nextInt();
                    count++;

                    if (playerGuess == randomNumber) {
                        int roundPoints = (maxAttemptsPerRound - count + 1) * pointsPerGuess;
                        totalPoints += roundPoints;

                        System.out.println("Correct! You won this round!");
                        System.out.println("It took you " + count + " tries to win this round.");
                        System.out.println("You earned " + roundPoints + " points this round.");
                        break;
                    } else if (count == maxAttemptsPerRound) {
                        System.out.println("You lost this round. The number was " + randomNumber);
                        break;
                    } else if (playerGuess < randomNumber) {
                        System.out.println("The number is higher. Guess again.");
                    } else {
                        System.out.println("The number is lower. Guess again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                }
            }

            rounds--;
        }

        System.out.println("You've used all your rounds. Game over!");
        System.out.println("Total points: " + totalPoints);

        scanner.close();
    }
}
