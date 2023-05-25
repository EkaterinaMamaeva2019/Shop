import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Product полностью играют роль предка
        Fruits[] fruits = {new Orange(), new Apple(), new Pear(), new Banana()};
        //принцип DRY - повторяющийся вывод списка продуктов на экран выносим в отдельный метод
        printFruits(fruits);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество через пробел или введите `end` ");
            String input = scanner.nextLine();
            if (input.equals("end"))
                break;
            String[] parts = input.split(" ");
            int fruitsNumber = Integer.parseInt(parts[0]) - 1;
            fruits[fruitsNumber].setNumber(Integer.parseInt(parts[1]));
        }
        printFruits(fruits);
        printBasket(fruits);
    }
    private static void printFruits(Fruits[] fruits) {
        System.out.println("Ознакомьтесь со списком товаров: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
    }

    private static void printBasket(Fruits[] fruits) {
        int costFruits = 0;
        System.out.println("Ваша корзина: ");
        for (Fruits fruit : fruits) {
            if (fruit.getNumber() != 0) {
                costFruits += fruit.getNumber() * fruit.getPrice();
                System.out.println(fruit + " 'количество'= " + fruit.getNumber() + " шт."
                        + " 'цена'= " + fruit.getPrice() + " " +
                        " 'стоимость'= " + fruit.getNumber() * fruit.getPrice() + " рублей");
            }
        }
        System.out.println("Итого: " + costFruits + " " + "рублей");
    }
}