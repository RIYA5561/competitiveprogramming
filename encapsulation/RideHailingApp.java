// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Class Vehicle
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulation: Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // GPS Methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Car Class
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // simple rate
    }
}

// Bike Class
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * getRatePerKm()) * 0.8; // 20% cheaper
    }
}

// Auto Class
class Auto extends Vehicle {
    private double baseFare = 30; // minimum charge

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * getRatePerKm());
    }
}

// Main Class
public class RideHailingApp {
    // Method using Polymorphism
    public static void processRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + v.calculateFare(distance));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR101", "Ramesh", 15, "Downtown");
        Vehicle bike = new Bike("BIKE202", "Suresh", 10, "Station Road");
        Vehicle auto = new Auto("AUTO303", "Mahesh", 12, "City Mall");

        // Polymorphic calls
        processRide(car, 10);
        processRide(bike, 10);
        processRide(auto, 10);
    }
}
