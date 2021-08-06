import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        demoArrayList1();
        demoArray();
    }

    public static void demoArray() {
        Drink[] menus = new Drink[10];
        menus[0] = new Drink("orange", "Juice", 40);
        menus[1] = new Drink("Apple", "Juice", 45);
        menus[10] = new Drink("Green tea", "Tea", 40);
        for (int i = 0; i < 10; i++) {
            System.out.println(menus[i]);
        }
    }

    public static void demoArrayList1() {
        ArrayList<Drink> menus = new ArrayList<Drink>();
        menus.add(new Drink("orange", "Juice", 40));
        menus.add(new Drink("Apple", "Juice", 45));
        menus.add(new Drink("lemon", "Juice", 50));
        menus.add(new Drink("Coke", "Soda", 25));
        menus.add(new Drink("Sprite", "Soda", 25));
        menus.add(new Drink("Fanta", "Soda", 25));
        menus.add(new Drink("Latte", "Coffee", 70));
        menus.add(new Drink("Mocha", "Coffee", 80));
        menus.add(new Drink("Cappuccino", "Coffee", 90));
        menus.add(new Drink("Espresso", "Coffee", 65));
        menus.add(new Drink("Green tea", "Tea", 40));

        System.out.println(menus.get(3));
//        for (Drink menu : menus) {
//            System.out.println(menu.toString());
//        }
    }
}
