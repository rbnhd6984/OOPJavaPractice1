package practice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private ArrayList<Goods> purchasedGoods;

    public Basket() {
        this.purchasedGoods = new ArrayList<>();
    }

    public void addGoods(Goods goods) {
        if (goods.getQuantity() > 0) {
            this.purchasedGoods.add(goods);
            goods.setQuantity(goods.getQuantity() - 1);
        }
        else {
            System.out.println("Товар " + goods.getName() + " закончился");
        }
    }

    public void removeGoods(Goods goods) {
        if (this.purchasedGoods.remove(goods)) {
            goods.setQuantity(goods.getQuantity() + 1);
        }
    }

    public Map<String, Integer> getTotalQuantity() {
        Map<String, Integer> goodsCount = new HashMap<>();
        for (Goods goods : this.purchasedGoods) {
            String goodsName = goods.getName();
            goodsCount.put(goodsName, goodsCount.getOrDefault(goodsName, 0) + 1);
        }
        return goodsCount;
    }

    public Map<String, Double> getTotalPrice() {
        Map<String, Double> goodsTotalPrice = new HashMap<>();
        for (Goods goods : this.purchasedGoods) {
            String goodsName = goods.getName();
            double goodsPrice = goods.getPrice();
            goodsTotalPrice.put(goodsName, goodsTotalPrice.getOrDefault(goodsName, 0.0) + goodsPrice);
        }
        return goodsTotalPrice;
    }
}
