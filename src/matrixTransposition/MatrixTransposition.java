package matrixTransposition;

import java.util.Random;
import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int userInM;
        int userInN;
        Random random = new Random();

        System.out.println("Введіть параметр М");
        userInM = scanIn.nextInt();
        System.out.println("Введіть параметр N");
        userInN = scanIn.nextInt();
        int[][] matrixMN = new int[userInM][userInN];
        int[][] transMatrix = new int[userInN][userInM];

        System.out.println("Матриця МхN виглядає так:");
        for (int i = 0; i < userInM; i++) {
            for (int j = 0; j < userInN; j++) {
                matrixMN[i][j] = random.nextInt(10);
                System.out.print(" " + matrixMN[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспанована матриця виглядає так:");
        for (int i = 0; i < userInN; i++) {
            for (int j = 0; j < userInM; j++) {
                transMatrix[i][j] = matrixMN[j][i];
                System.out.print(" " + transMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
