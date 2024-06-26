package org.Game;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Random rand = new Random();


            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("the number is " + randomNumber);
        while (true) {
            System.out.println("Enter your guess between (1 - 100): ");

            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Correct you Won!");
                break;

            } else if (playerGuess < randomNumber) {
                System.out.println("Number is lower. Guess again");

            } else {
                System.out.println("number is high.Guess again.");

            }


        }
    }
}