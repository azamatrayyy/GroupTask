public class Cafe {
    private String name;
    public Cafe(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void PLaceOrder(Customer customer, Order order) {
        if(order == null && customer == null) {
            throw new IllegalArgumentException("Order and Customer cannot be null.");
        }
        order.complete();
        System.out.println("Order Completed by" + " " + customer.getName());
    }
}
