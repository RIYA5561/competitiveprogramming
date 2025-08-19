public class car {
    //1. Create a class Car with instance variables model and year. Create two car objects and display their details.
    private String model;
    private int year;
    public car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public static void main(String[] args)

     {
        // Creating two car objects
        car car1 = new car("Toyota Camry", 2020);
        car car2 = new car("Honda Accord", 2021);
        
        // Displaying their details
        System.out.println("Car 1: Model = " + car1.getModel() + ", Year = " + car1.getYear());
        System.out.println("Car 2: Model = " + car2.getModel() + ", Year = " + car2.getYear());

        

        
    

    }
}
     
