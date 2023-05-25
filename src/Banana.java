public class Banana extends Fruits implements Food {
    private final String name = "Бананы";
    private final int price =99;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Бананы съедены");
    }
}