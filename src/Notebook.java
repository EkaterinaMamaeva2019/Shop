public class Notebook extends Fruits implements Equipment, Computer {
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Ноутбук";
    private final int price = 100000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("Ноутбук включен");
    }

    @Override
    public void system() {
        System.out.println("Учтановлена система windows");
    }
}