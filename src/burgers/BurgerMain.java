package burgers;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger burger1 = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger burger2 = new Burger("булочка", "м'ясо", "ще м'яса", "сир", "зелень", "майонез");
    }
}
