import java.util.Scanner;

public class Question_4 {
  private static final double KM2MILES = 0.621371;
  private static final double MILES2KM = 1.60934;
  private static final double METERS2FEET = 3.28084;
  private static final double FEET2METERS = 0.3048;

  public static double convertKmToMiles(double km) {
    return km * KM2MILES;
  }

  public static double convertMilesToKm(double miles) {
    return miles * MILES2KM;
  }

  public static double convertMetersToFeet(double meters) {
    return meters * METERS2FEET;
  }

  public static double convertFeetToMeters(double feet) {
    return feet * FEET2METERS;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value in km: ");
    double km = sc.nextDouble();
    System.out.println("Enter the value in miles: ");
    double miles = sc.nextDouble();
    System.out.println("Enter the value in meters: ");
    double meters = sc.nextDouble();
    System.out.println("Enter the value in feet: ");

    double feet = sc.nextDouble();

    System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
    System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
    System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
    System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
  }

}
