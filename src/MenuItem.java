public class MenuItem {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("MenuItem name cannot be empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("MenuItem price cannot be negative.");
        }
        this.name = name.trim();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(name, price);
    }

}