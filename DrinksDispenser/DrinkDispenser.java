package DrinksDispenser;

public class DrinkDispenser {

    private Drink[] drink;
    private int dCount=0;
    private double cash=0;

    public DrinkDispenser(int nDrinks) {
        this.drink = new Drink[nDrinks];
    }

    public void loadDrink(Drink d){
        drink[dCount] = d;
        dCount++;
    }

    public double getCurrentBalance(){
        return cash;
    }

    public double getChange(){
        double change=cash;
        cash=0;
        return change;
    }

    public double insertCash(double money){
        return cash+=money;
    }

    public Drink chooseDrink(String d){
        Drink dTemp;
        for(int i=0; i<drink.length; i++){
            if(drink[i] != null && d.equals(drink[i].getDrinkName()) && drink[i].getPrice()<= cash){
                cash-=drink[i].getPrice();
                dTemp=drink[i];
                drink[i] = null;
                sortDispenser();
                return dTemp;
            }
        }
        return null;
    }

    public void sortDispenser(){
        for(int i=0; i<drink.length-1; i++){
            if(drink[i] == null){
                drink[i] = drink[i+1];
                drink[i+1] = null;
            }
        }
    }
}
