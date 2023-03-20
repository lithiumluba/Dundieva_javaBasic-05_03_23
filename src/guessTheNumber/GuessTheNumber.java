package guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int computer = rand.nextInt(3);
        Scanner scan_in = new Scanner(System.in);
        int user_guess;
        for (int i = 3; i > 0; i--) {
            System.out.println("Введіть число від 0 до 10");
            user_guess = scan_in.nextInt();
            if (computer == user_guess) {
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
