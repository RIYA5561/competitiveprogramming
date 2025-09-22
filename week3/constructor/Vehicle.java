package Constructor_Level_1;
//Create a Vehicle class to manage the details of vehicles:
//Instance Variables: ownerName, vehicleType.
//Class Variable: registrationFee (fixed for all vehicles).
//Methods:
//An instance method displayVehicleDetails() to display owner and vehicle details.
//A class method updateRegistrationFee() to change the registration fee
public class Vehicle {
	String ownerName; 
	String vehicleType;
	static int registrationFee = 500;
	public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
	 public void displayVehicleDetails() {
	        System.out.println("Owner Name: " + ownerName);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Fee: " + registrationFee);
	 }
	 public static void updateRegistrationFee(int newFee) {
	        registrationFee = newFee;
	        System.out.println("Registration fee updated to: " + registrationFee);
	    }
	 public static void main(String[] args) {
	      
	        Vehicle vehicle1 = new Vehicle("Rudra", "Car");
	        Vehicle vehicle2 = new Vehicle("A", "Motorbike");

	        vehicle1.displayVehicleDetails();
	        System.out.println();
	        vehicle2.displayVehicleDetails();
	        System.out.println();

	        
	        Vehicle.updateRegistrationFee(800);
	        System.out.println();

	        vehicle1.displayVehicleDetails();
	        System.out.println();
	        vehicle2.displayVehicleDetails();
	    }

}
