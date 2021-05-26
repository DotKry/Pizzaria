package epam.com.pizz.model.cart;


import epam.com.pizz.model.goods.Drinks;
import epam.com.pizz.model.goods.Goods;
import epam.com.pizz.model.goods.Pizza;
import java.util.List;

public class Cart {
    private List<Goods> goodsList;

    public Cart() {
    }
    public Cart(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }
    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public void addGoods(Goods goods){
        this.goodsList.add(goods);
    }

    public boolean isLessThanThreePizzas(){
        int pizzasCounter = 0;

        for (Goods goods : goodsList) {
            if (goods instanceof Pizza){
                pizzasCounter++;
            }
        }

        return pizzasCounter < 3;
    }

    public boolean isLessThanThreeDrinks(){
        int drinksCounter = 0;

        for (Goods goods : goodsList) {
            if (goods instanceof Drinks){
                drinksCounter++;
            }
        }

        return drinksCounter < 3;
    }

    public double getTotalPrice() {
        int totalPrice = 0;
        for (Goods goods : goodsList) {
            totalPrice += goods.TotalPrice();
        }
        return totalPrice;
    }
}
