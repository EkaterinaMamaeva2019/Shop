public class Pear extends Fruits implements Food {
    private final String name = "Груши";
    private final int price =119;

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
        System.out.println("Груши съедены");
    }
}
