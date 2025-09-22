import java.util.Scanner;

public class import java.util.Scanner;

public class Question_11 {
  public static double[] calculateTrigonometricFunctions(double angles) {
    double angle = Math.toRadians(angles);

    double sine = Math.sin(angle);
    double cosine = Math.cos(angle);
    double tangent = Math.tan(angle);

    return new double[] { sine, cosine, tangent };
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter angle in degrees: ");
    double angle = sc.nextDouble();

    double[] trigValues = calculateTrigonometricFunctions(angle);

    System.out.println("Sin" + " " + angle + " " + trigValues[0]);
    System.out.println("Cosine" + " " + angle + " " + trigValues[1]);
    System.out.println("Tangent" + " " + angle + " " + trigValues[2]);
  }

}{
  public static double[] calculateTrigonometricFunctions(double angles) {
    double angle = Math.toRadians(angles);

    double sine = Math.sin(angle);
    double cosine = Math.cos(angle);
    double tangent = Math.tan(angle);

    return new double[] { sine, cosine, tangent };
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter angle in degrees: ");
    double angle = sc.nextDouble();

    double[] trigValues = calculateTrigonometricFunctions(angle);

    System.out.println("Sin" + " " + angle + " " + trigValues[0]);
    System.out.println("Cosine" + " " + angle + " " + trigValues[1]);
    System.out.println("Tangent" + " " + angle + " " + trigValues[2]);
  }

}
