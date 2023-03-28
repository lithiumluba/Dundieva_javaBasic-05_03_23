package rugby;

import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 40;
        int min = 18 - 1;
        int quantityOfPlayers = 25;
        int[] teamA = new int[quantityOfPlayers];
        int[] teamB = new int[quantityOfPlayers];
        int sumTeamA = 0;
        int teamAMid;
        int sumTeamB = 0;
        int teamBMid;

        for (int i = 0; i < quantityOfPlayers; i++) {
            teamA[i] = random.nextInt(max - min) + min + 1;
            teamB[i] = random.nextInt(max - min) + min + 1;
        }
        for (int i = 0; i < quantityOfPlayers; i++) {
            sumTeamA += teamA[i];
            sumTeamB += teamB[i];
        }
        teamAMid = sumTeamA / teamA.length;
        teamBMid = sumTeamB / teamB.length;

        System.out.println("Перша команда, гравці за віком " + Arrays.toString(teamA));
        System.out.println("Середній вік гравців первої складає: " + teamAMid);
        System.out.println("Друга команда, гравці за віком " + Arrays.toString(teamB));
        System.out.println("Середній вік гравців другої складає: " + teamBMid);

    }
}
