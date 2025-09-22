// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters & Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price update!");
        }
    }

    // Abstract Method
    public abstract double calculateDiscount();

    // Concrete Method
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discounted Price: " + calculateDiscount());
        System.out.println("--------------------------");
    }
}

// Electronics Class (implements Taxable)
class Electronics extends Product implements Taxable {
    private double discountRate = 0.10; // 10% discount
    private double taxRate = 0.18; // 18% GST

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discountRate);
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18% GST = " + calculateTax();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
    }
}

// Clothing Class (implements Taxable)
class Clothing extends Product implements Taxable {
    private double discountRate = 0.20; // 20% discount
    private double taxRate = 0.05; // 5% VAT

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discountRate);
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5% VAT = " + calculateTax();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
    }
}

// Groceries Class (No tax, just discount)
class Groceries extends Product {
    private double discountRate = 0.05; // 5% discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() - (getPrice() * discountRate);
    }
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Polymorphism: array of Products
        Product[] products = new Product[3];

        products[0] = new Electronics(201, "Laptop", 60000);
        products[1] = new Clothing(202, "T-Shirt", 1000);
        products[2] = new Groceries(203, "Rice (10kg)", 500);

        // Displaying details
        for (Product p : products) {
            p.displayDetails();
        }
    }
}

