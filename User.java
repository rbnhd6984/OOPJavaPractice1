package practice1;

class User extends Person {
    private String login;
    private String password;
    private Basket basket;

    public User(String name, int age, String login, String password, Basket basket) {
        super(name, age);
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }
}
