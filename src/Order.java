import java.util.ArrayList;
import java.util.List;
public class Order {
    private Customer customer;
    private ArrayList<MenuItem> items;
    private boolean completed;

    public Order(Customer customer){
        this.customer = customer;
        this.items = new ArrayList<>();
        this.completed = false;
    }
    public void addItem(MenuItem item){
        if(item == null){
            throw new IllegalArgumentException("Item cannot be null.");
        }
        items.add(item);
    }
    public double getTotalPrice(){
        if(items.isEmpty()){
            throw new IllegalArgumentException("Order cannot be empty.");
        }
        double totalPrice = 0;
        for(MenuItem item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<MenuItem> getItems(){
        return items;
    }
    public void complete(){
        completed = true;
    }
    public boolean isCompleted() {
        return completed;
    }
}
