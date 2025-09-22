// Interface Discountable
interface Discountable {
    double applyDiscount(double totalPrice);
    String getDiscountDetails();
}

// Abstract Class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: Getters (restricting direct access)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("-------------------------");
    }
}

// VegItem Class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No extra charges
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - (totalPrice * 0.10); // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10% applied.";
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        double discounted = applyDiscount(calculateTotalPrice());
        System.out.println(getDiscountDetails());
        System.out.println("Final Price after Discount: " + discounted);
        System.out.println("-------------------------");
    }
}

// NonVegItem Class
class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 50; // extra cooking charge per order

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + nonVegCharge;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice - (totalPrice * 0.05); // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5% applied.";
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        double discounted = applyDiscount(calculateTotalPrice());
        System.out.println(getDiscountDetails());
        System.out.println("Final Price after Discount: " + discounted);
        System.out.println("-------------------------");
    }
}

// Main Class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Polymorphism: Different FoodItem objects handled together
        FoodItem[] order = new FoodItem[2];

        order[0] = new VegItem("Paneer Butter Masala", 200, 2);
        order[1] = new NonVegItem("Chicken Biryani", 300, 1);

        // Processing Order
        System.out.println("------ Order Details ------");
        for (FoodItem item : order) {
            item.getItemDetails(); // Polymorphic call
        }
    }
}
