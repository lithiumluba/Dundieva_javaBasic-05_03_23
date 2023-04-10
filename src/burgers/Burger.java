package burgers;

public class Burger {
    private String bun;
    private String meat;
    private String oneMoreMeat;
    private String cheese;
    private String greenery;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String greenery, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        System.out.println("Звичайний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greenery + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Дієтичний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greenery);
    }

    public Burger(String bun, String meat, String oneMoreMeat, String cheese, String greenery, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.oneMoreMeat = oneMoreMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        System.out.println("Бургер з подвійним м'ясом: " + bun + ", " + meat + ", " + oneMoreMeat + ", " + cheese + ", " + greenery + ", " + mayo);
    }
}
