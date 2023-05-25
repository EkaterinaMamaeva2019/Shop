public abstract class Fruits {
    private String name;
    private int price;
    private int number;

    public String getName() {
        return name;
    }

    public Fruits setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Fruits setNumber(int number) {
        this.number = number;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Fruits setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }
}