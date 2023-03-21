package counterStrike;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);
        String teamA;
        String teamB;
        int[] teamAFrags = new int[5];
        int[] teamBFrags = new int[5];
        System.out.println("Введіть назву першої команди");
        teamA = inputVal.nextLine();
        for (int i = 0; i < teamAFrags.length; i++) {
            System.out.println("Введить кількість фрагів гравця " + (i + 1));
            teamAFrags[i] = inputVal.nextInt();
            inputVal.nextLine();
        }
        System.out.println("Введіть назву другої команди");
        teamB = inputVal.nextLine();
        for (int i = 0; i < teamBFrags.length; i++) {
            System.out.println("Введить кількість фрагів гравця " + (i + 1));
            teamBFrags[i] = inputVal.nextInt();
            inputVal.nextLine();
        }
        int teamASum = 0;
        int teamAMid;
        int teamBSum = 0;
        int teamBMid;
        for (int frag : teamAFrags) {
            teamASum += frag;
        }
        teamAMid = teamASum / teamAFrags.length;

        for (int frag : teamBFrags) {
            teamBSum += frag;
        }
        teamBMid = teamBSum / teamBFrags.length;
        if (teamASum > teamBSum) {
            System.out.println("Виграла команда " + teamA + " яка набрала " + teamASum + " балів. Середній бал команди " + teamAMid);
        } else if (teamASum < teamBSum) {
            System.out.println("Виграла команда " + teamB + " яка набрала " + teamBSum + " балів. Середній бал команди " + teamBMid);
        } else {
            System.out.println("Нічія. Середній бал команди " + teamA + ": " + teamAMid + ". Середній бал команди " + teamB + ": " + teamBMid);
        }

    }
}
