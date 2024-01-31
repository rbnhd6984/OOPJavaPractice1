package practice1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Goods goods1 = new Goods("Батон", 100.0, 5, 20);
        Goods goods2 = new Goods("Булочка", 30, 5, 60);
        Goods goods3 = new Goods("Цыплёнок", 200.0, 4, 30);
        Goods goods4 = new Goods("Фарш", 250.0, 4.7, 30);
        Goods goods5 = new Goods("Творог", 150.0, 4.5, 40);
        Goods goods6 = new Goods("Молоко", 59.99, 4.8, 100);

        Category category1 = new Category("Выпечка", new Goods[]{goods1, goods2});
        Category category2 = new Category("Мясо", new Goods[]{goods3, goods4});
        Category category3 = new Category("Молочные", new Goods[]{goods5, goods6});

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();

        User user1 = new User("Имя1", 30, "login1", "password1", basket1);
        User user2 = new User("Имя2", 25, "login2", "password2", basket2);

        user1.setName("Mujig");
        user2.setName("Igor");

        System.out.println("Каталог продуктов:");
        printCategory(category1);
        printCategory(category2);
        printCategory(category3);

        user1.getBasket().addGoods(goods1);
        user1.getBasket().addGoods(goods1);
        user1.getBasket().addGoods(goods1);
        user1.getBasket().addGoods(goods3);
        user2.getBasket().addGoods(goods2);
        user1.getBasket().removeGoods(goods1);

        System.out.println();

        System.out.println("Покупки пользователей:");
        printUserPurchases(user1);
        printUserPurchases(user2);
        System.out.println();

        System.out.println("Товар в наличии:");
        printQuanityGoods(category1);
        printQuanityGoods(category2);
        printQuanityGoods(category3);

    }

    public static void printCategory(Category category) {
        System.out.println("Категория: " + category.getName());
        for (Goods goods : category.getGoods()) {
            System.out.println(
                    "  Товар: " + goods.getName() +
                    ", Цена: " + goods.getPrice() +
                    ", Рейтинг: " + goods.getRating() +
                    ", Остаток: " + goods.getQuantity());
        }
    }

    public static void printQuanityGoods(Category category) {
        System.out.println("Категория: " + category.getName());
        for (Goods goods : category.getGoods()) {
            System.out.println(
                    "  Товар: " + goods.getName() +
                    ", Остаток: " + goods.getQuantity());
        }
    }

    public static void printUserPurchases(User user) {
        System.out.println("Пользователь: " + user.getName());
        Map<String, Integer> goodsCount = user.getBasket().getTotalQuantity();
        Map<String, Double> goodsTotalPrice = user.getBasket().getTotalPrice();
        for (String goodsName : goodsCount.keySet()) {
            System.out.println(
                    "  Товар: " + goodsName +
                    ", Цена: " + (goodsTotalPrice.get(goodsName) / goodsCount.get(goodsName)) +
                    ", Количество: " + goodsCount.get(goodsName) +
                    ", Итог: " + goodsTotalPrice.get(goodsName));
        }
    }
}
