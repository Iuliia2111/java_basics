public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Basket basket = new Basket();
        basket.add("Milk", 40, 4.0);
        basket.add("Bread", 10);
        basket.add("Soup", 55, 2, 0.3);
        basket.add("Rice", 98, 4);
        basket.print("Корзина");
        basket.print1();

        System.out.println();
        System.out.println("Задание 2");
        Arithmetic f =  new Arithmetic(5,3);
        f.addition();
        f.subtraction();
        f.average();
        f.max();
        f.min();


    }
}
