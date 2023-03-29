package guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int computer = rand.nextInt(11);
        Scanner scanIn = new Scanner(System.in);
        int userGuess;
        for (int i = 3; i > 0; i--) {
            System.out.println("Введіть число від 0 до 10");
            userGuess = scanIn.nextInt();
            if (computer == userGuess) {
                System.out.println("Ти вгадав! Це число: " + computer);
                break;
            } else {
                System.out.println("Не вгадав! Доступних спроб: " + (i - 1));
                if (i == 1) {
                    System.out.println("Ти програв! Я загадав число:" + computer);

                }

            }

        }

    }
}
