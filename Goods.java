package practice1;

public class Goods {
    private String name;
    private double price;
    private double rating;
    private int quantity;

    public Goods(String name, double price, double rating, int quantity) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
