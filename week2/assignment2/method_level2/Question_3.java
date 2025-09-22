import java.util.Scanner;

public class Question_3 {
  public static double calculateRounds(double side1, double side2, double side3, double totalDistance) {
    double perimeter = side1 + side2 + side3;
    return totalDistance / perimeter;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter side 1 : ");
    double side1 = sc.nextDouble();

    System.out.print("Enter side 2 : ");
    double side2 = sc.nextDouble();

    System.out.print("Enter side 3 : ");
    double side3 = sc.nextDouble();

    double total = 5000;

    double rounds = calculateRounds(side1, side2, side3, total);

    System.out.print("The athlete must complete " + rounds + " rounds to run 5 km.%n");
  }

}
