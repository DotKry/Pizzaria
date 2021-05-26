package epam.com.pizz.model.goods;

public abstract class Goods {
    private NutritionFacts nutritionFacts;
    private Pizza pizza;
    private Drinks drinks;

    public Goods() {
    }
    public Goods(NutritionFacts nutritionFacts, Pizza pizza, Drinks drinks) {
        this.nutritionFacts = nutritionFacts;
        this.pizza = pizza;
        this.drinks = drinks;
    }

    public Pizza getPizza() {
        return pizza;
    }
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Drinks getDrinks() {
        return drinks;
    }
    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public NutritionFacts getNutritionFacts() {
        return nutritionFacts;
    }
    public void setNutritionFacts(NutritionFacts nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public double TotalPrice() {
        return pizza.pricePizza * pizza.quantityPizza + drinks.priceDrinks * drinks.quantityDrinks;
    }
}
