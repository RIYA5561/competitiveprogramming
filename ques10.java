package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

public class Question_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n < 0) {
      System.out.println("Please enter a positive integer");
      return;
    }
    String[] res = new String[n + 1];
    for (int i = 0; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0 && i != 0) {
        res[i] = "FizzBuzz";
      } else if (i % 3 == 0 && i != 0) {
        res[i] = "Fizz";
      } else if (i % 5 == 0 && i != 0) {
        res[i] = "Buzz";
      } else {
        res[i] = String.valueOf(i);
      }
    }
    for (int i = 0; i <= n; i++) {
      System.out.println("Position " + i + " = " + res[i]);
    }

  }
}
