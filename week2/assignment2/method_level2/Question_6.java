import java.util.Scanner;

public class Question_6 {
  private static final double POUNDS2KILOGRAMS = 0.453592;
  private static final double KILOGRAMS2POUNDS = 2.20462;
  private static final double GALLONS2LITERS = 3.78541;
  private static final double LITERS2GALLONS = 0.264172;

  public static double convertFahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static double convertCelsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static double convertPoundsToKilograms(double pounds) {
    return pounds * POUNDS2KILOGRAMS;
  }

  public static double convertKilogramsToPounds(double kilograms) {
    return kilograms * KILOGRAMS2POUNDS;
  }

  public static double convertGallonsToLiters(double gallons) {
    return gallons * GALLONS2LITERS;
  }

  public static double convertLitersToGallons(double liters) {
    return liters * LITERS2GALLONS;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value in fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    System.out.println("Enter the value in celsius: ");
    double celsius = sc.nextDouble();
    System.out.println("Enter the value in pounds: ");
    double pounds = sc.nextDouble();
    System.out.println("Enter the value in kilograms: ");
    double kilograms = sc.nextDouble();
    System.out.println("Enter the value in gallons: ");
    double gallons = sc.nextDouble();
    System.out.println("Enter the value in liters: ");
    double liters = sc.nextDouble();

    System.out.println(fahrenheit + " F = " + convertFahrenheitToCelsius(fahrenheit) + " C");
    System.out.println(celsius + " C = " + convertCelsiusToFahrenheit(celsius) + " F");
    System.out.println(pounds + " lbs = " + convertPoundsToKilograms(pounds) + " kg");
    System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " lbs");
    System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
    System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
  }

}
