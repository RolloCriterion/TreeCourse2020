package DrinksDispenser;

public class Drink {

    private String drinkName;
    private double price;

    public Drink(String drinkName, double price) {
        this.drinkName = drinkName;
        this.price = price;
    }

    public String getDrinkName(){
        return drinkName;
    }

    public double getPrice() {
        return price;
    }
}