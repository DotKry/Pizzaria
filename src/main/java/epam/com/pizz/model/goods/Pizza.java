package epam.com.pizz.model.goods;

public class Pizza extends Goods {
    private String namePizza;
    private  int diameter;
    private String ingredients;
    public double pricePizza;
    public int quantityPizza;

    public Pizza() {
    }
    public Pizza(String namePizza, int diameter, String ingredients, double pricePizza, int quantityPizza) {
        this.namePizza = namePizza;
        this.diameter = diameter;
        this.ingredients = ingredients;
        this.pricePizza = pricePizza;
        this.quantityPizza = quantityPizza;
    }

    public String getName() {
        return namePizza;
    }
    public void setName(String name) {
        this.namePizza = name;
    }

    public int getQuantityPizza() {
        return quantityPizza;
    }
    public void setQuantityPizza(int quantityPizza) {
        this.quantityPizza = quantityPizza;
    }

    public double getPricePizza() {
        return pricePizza;
    }
    public void setPricePizza(double pricePizza) {
        this.pricePizza = pricePizza;
    }

    public int getDiameter() {
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
