package drinksMachine;

import drinksMachine.Drinks;
import drinksMachine.DrinksMachine;

import java.util.Scanner;

//КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;
public class DrinksMain {
    public static void main(String[] args) {
        int totalDrinks = 0;
        double sum = 0;
        boolean loop = true;
        System.out.println("Вітаю! Маємо у наявності: coffee, tea, lemonad, mohito, mineral_wather, coca_cola. Введіть, будьласка, назву бажаного напою");
        while (loop) {
            Scanner inputDrink = new Scanner(System.in);
            String drinkChoice = inputDrink.nextLine();
            Drinks drinks;
            try {
                drinks = Drinks.valueOf(drinkChoice.toUpperCase());
            } catch (Exception e) {
                drinks = Drinks.NONE;
            }
            switch (drinks) {
                case COFFEE:
                    DrinksMachine.coffee();
                    sum = sum + DrinksMachine.COFFEE;
                    break;
                case TEA:
                    DrinksMachine.tea();
                    sum = sum + DrinksMachine.TEA;
                    break;
                case LEMONAD:
                    DrinksMachine.lemonad();
                    sum = sum + DrinksMachine.LEMONAD;
                    break;
                case MOHITO:
                    DrinksMachine.mohito();
                    sum = sum + DrinksMachine.MOHITO;
                    break;
                case MINERAL_WATHER:
                    DrinksMachine.mineralWather();
                    sum = sum + DrinksMachine.MINERAL_WATHER;
                    break;
                case COCA_COLA:
                    DrinksMachine.cocaCola();
                    sum = sum + DrinksMachine.COCA_COLA;
                    break;
                case NONE:
                    loop = false;
                    System.out.println("Кількість напоїв: " + totalDrinks);
                    System.out.println("Вартість вашого замовлення становить: " + sum + " гривень. Дякуємо, за замовлення!");
                    break;
                default:
                    break;
            }
            totalDrinks++;
        }

    }

}
