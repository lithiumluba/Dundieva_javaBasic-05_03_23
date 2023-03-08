package parallelepiped;

public class Parallelepiped {
    public static void main(String[] args) {
        int height = 8;
        int length = 12;
        int width = 10;
        int volume = height*length*width;
        int sumOfSides = 4*(height+length+width);
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сумарна довжина всіх сторін = " + sumOfSides);
    }
}
