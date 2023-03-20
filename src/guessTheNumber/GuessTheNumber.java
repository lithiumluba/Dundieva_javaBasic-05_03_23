package guessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int computer = rand.nextInt(11);
        Scanner scan_in = new Scanner(System.in);
        int user_guess;

        System.out.println("Введіть число від 0 до 10");
        user_guess = scan_in.nextInt();
        if (computer == user_guess) {
            System.out.println("Ти вгадав! Це число: " + computer);
        } else {
            System.out.println("Не вгадав! Маєш ще дві спроби");
            System.out.println("Введіть число від 0 до 10");
            user_guess = scan_in.nextInt();
            if (computer == user_guess) {
                System.out.println("Ти вгадав! Це число: " + computer);
            } else {
                System.out.println("Не вгадав! Маєш ще одну спробу");
                System.out.println("Введіть число від 0 до 10");
                user_guess = scan_in.nextInt();
                if (computer == user_guess) {
                    System.out.println("Ти вгадав! Це число: " + computer);
                } else {
                    System.out.println("Ти програв! Я загадав число: " + computer);
                }
            }
        }
    }
}
