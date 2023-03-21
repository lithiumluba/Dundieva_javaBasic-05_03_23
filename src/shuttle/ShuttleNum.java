package shuttle;

import java.util.Arrays;

public class ShuttleNum {
    public static void main(String[] args) {
        int[] arrayShuttle = new int[100];
        int counter = 0;
        int remainder;
        for (int i = 0; i < arrayShuttle.length; i++) {
            counter++;
            remainder = counter - counter / 10 * 10;
            if (remainder == 4 || remainder == 9) {
                counter++;
            }
            arrayShuttle[i] = counter;
        }
        System.out.println(Arrays.toString(arrayShuttle));
    }
}
