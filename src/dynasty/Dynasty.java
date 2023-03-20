package dynasty;

public class Dynasty {
    public static void main(String[] args) {
        int li = 860;
        int liWar = 13;
        int liArc = 24;
        int liRid = 46;
        int liDynasty = li * (liWar+liArc+liRid);
        System.out.println("Значення загальної атаки династії Лі = " + liDynasty);

        double min = 1.5 * li ;
        int minWar = 9;
        int minArc = 35;
        int minRid = 12;
        double minDynasty = min * (minWar+minArc+minRid);
        System.out.println("Значення загальної атаки династії Мінь = " + minDynasty);
    }
}
