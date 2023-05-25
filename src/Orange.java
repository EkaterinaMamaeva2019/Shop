public class Orange extends Fruits implements Food {
    private final String name = "Апельсины";
    private final int price =89;

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
        System.out.println("Апельсины съедены");
    }
}