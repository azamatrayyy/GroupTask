import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Central Cafe");
        Customer customer = new Customer("1","Azamat");
        MenuItem coffee = new MenuItem("Coffee", 1200);
        MenuItem sandwich = new MenuItem("Sandwich", 1800);
        MenuItem cake = new MenuItem("Cake", 1500);
        Order order = customer.createOrder();
        order.addItem(coffee);
        order.addItem(sandwich);
        order.addItem(cake);

        cafe.PLaceOrder(customer, order);

        System.out.println("\nOrder items:");
        for (MenuItem item : order.getItems()) {
            System.out.println("- " + item.getName() + ": " + item.getPrice());
        }

        System.out.println("Total price: " + order.getTotalPrice());
    }
}