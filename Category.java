package practice1;

public class Category {
    private String name;
    private Goods[] goods;

    public Category(String name, Goods[] goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public Goods[] getGoods() {
        return goods;
    }
}
