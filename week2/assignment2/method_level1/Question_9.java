import java.util.Scanner;

public class Question_9 {
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    int[] result = new int[2];
    result[0] = number / divisor;
    result[1] = number % divisor;
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of chocolates: ");
    int number = sc.nextInt();

    System.out.print("Enter the number of children: ");
    int divisor = sc.nextInt();

    int[] result = findRemainderAndQuotient(number, divisor);

    System.out.println("Each child will get " + result[0] + " chocolates.");
    System.out.println("Remaining chocolates: " + result[1]);
  }
}
