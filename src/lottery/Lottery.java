package lottery;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int size = 7;
        int[] lotOrgan = new int[size];
        int[] userTicket = new int[size];
        int coincidence = 0;
        Random random = new Random();

        for (int i = 0; i < lotOrgan.length; i++) {
            lotOrgan[i]= random.nextInt(10);
        }
        for (int i = 0; i < userTicket.length; i++) {
            userTicket[i]= random.nextInt(10);
        }

        for (int i = 0; i <lotOrgan.length-1; i++) {
            for (int j = lotOrgan.length-1;j>i; j--) {
                if (lotOrgan[j-1]>lotOrgan[j]) {
                    int tmp=lotOrgan[j-1];
                    lotOrgan[j-1]=lotOrgan[j];
                    lotOrgan[j]=tmp;
                }
            }
        }
        for (int i = 0; i <userTicket.length-1; i++) {
            for (int j = userTicket.length-1;j>i; j--) {
                if (userTicket[j-1]>userTicket[j]) {
                    int tmp=userTicket[j-1];
                    userTicket[j-1]=userTicket[j];
                    userTicket[j]=tmp;
                }
            }
        }
        for (int i = 0; i <size ; i++) {
            if (lotOrgan[i]==userTicket[i]){
                coincidence++;
            }
        }
        System.out.println("Числа загадані фірмою-організатором: " + Arrays.toString(lotOrgan));
        System.out.println("Числа які вказав гравець: " + Arrays.toString(userTicket));
        System.out.println("Кількість збігів: "+ coincidence);
    }
}
