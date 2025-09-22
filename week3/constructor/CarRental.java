
package Constructor_Level_1;
//Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays.
//Add constructors to initialize the rental details and calculate total cost.
public class CarRental {
	
	String customerName; 
	String carModel;
	int rentalDays;
	public CarRental() {
		// TODO Auto-generated constructor stub
	}
	public CarRental(String customerName, 
	String carModel,
	int rentalDays){
		this.carModel =carModel;
		this.customerName = customerName;
		this.rentalDays = rentalDays;
		
	}
    public double cost() {
        double ratePerDay = 1000; 
        return rentalDays * ratePerDay;
    }
    public void displayRental() {
        System.out.println("Customer: " + customerName +
                           ", Car Model: " + carModel +
                           ", Rental Days: " + rentalDays +
                           ", Total Cost: " + cost());
    }
	public static void main(String[] args) {
		CarRental rental1 = new CarRental();
        rental1.displayRental();

       
        CarRental rental2 = new CarRental("Rohan", "Sedan", 5);
        rental2.displayRental();
	}
}
