public class Apple extends Fruits implements Food {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем классу функциональности, не изменяя его код
    private final String name = "Яблоки";
    private final int price =69;

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
        System.out.println("Яблоки съедены");
    }
}