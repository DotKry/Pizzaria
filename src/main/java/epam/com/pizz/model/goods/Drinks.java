package epam.com.pizz.model.goods;

public class Drinks extends Goods {
    private double volume;
    private String nameDrinks;
    public int quantityDrinks;
    public double priceDrinks;

    public Drinks() {
    }
    public Drinks(double volume, String nameDrinks, int quantityDrinks, double priceDrinks) {
        this.volume = volume;
        this.nameDrinks = nameDrinks;
        this.quantityDrinks = quantityDrinks;
        this.priceDrinks = priceDrinks;
    }

    public double getPriceDrinks() {
        return priceDrinks;
    }
    public void setPriceDrinks(double priceDrinks) {
        this.priceDrinks = priceDrinks;
    }

    public int getQuantityDrinks() {
        return quantityDrinks;
    }
    public void setQuantityDrinks(int quantityDrinks) {
        this.quantityDrinks = quantityDrinks;
    }

    public String getName() {
        return nameDrinks;
    }
    public void setName(String name) {
        this.nameDrinks = name;
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
