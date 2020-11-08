package DrinksDispenser;

public class Main {
    public static void main(String[] args) {
        TestDispenser();
    }

    public static void TestDispenser(){
        Coffee coffee = new Coffee("coffee", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        DrinkDispenser drinksDispenser = new DrinkDispenser(10);
        drinksDispenser.loadDrink(coffee);
        drinksDispenser.loadDrink(coffee);
        drinksDispenser.loadDrink(cappuccino);
        drinksDispenser.loadDrink(coffee);
        drinksDispenser.loadDrink(coffee);
        drinksDispenser.loadDrink(cappuccino);
        drinksDispenser.loadDrink(coffee);
        System.out.println(drinksDispenser.getCurrentBalance() == 0);
        System.out.println(drinksDispenser.getChange() == 0);
        drinksDispenser.insertCash(0.4);
        System.out.println(drinksDispenser.chooseDrink("coffee") == null);
        drinksDispenser.insertCash(0.2);
        System.out.println(drinksDispenser.chooseDrink("coffee") != null);
        System.out.println(drinksDispenser.getChange()-0.10 < 1E-6);
        System.out.println(drinksDispenser.getCurrentBalance() == 0);
        System.out.println(drinksDispenser.chooseDrink("coffee") == null);
        drinksDispenser.insertCash(2.0);
        System.out.println(drinksDispenser.chooseDrink("coffee") != null);
        System.out.println(drinksDispenser.chooseDrink("cappuccino") != null);
        System.out.println(drinksDispenser.chooseDrink("coffee") != null);
        System.out.println(drinksDispenser.getCurrentBalance() == 0);
        System.out.println(drinksDispenser.getChange()-0.10 < 1E-6);
    }
}
