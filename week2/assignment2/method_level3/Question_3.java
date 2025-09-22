import java.util.*;

public class Question_3 {
  public static int countDigits(int number) {
    int count = 0;
    int num = number;
    if (num == 0)
      return 1;
    while (num != 0) {
      num /= 10;
      count++;
    }
    return count;
  }

  public static int[] getDigitsArray(int number) {
    int count = countDigits(number);
    int[] digits = new int[count];
    int num = number;
    for (int i = count - 1; i >= 0; i--) {
      digits[i] = num % 10;
      num /= 10;
    }
    return digits;
  }

  public static int sumOfDigits(int number) {
    int[] digits = getDigitsArray(number);
    int sum = 0;
    for (int digit : digits) {
      sum += digit;
    }
    return sum;
  }

  public static int sumOfSquaresOfDigits(int number) {
    int[] digits = getDigitsArray(number);
    int sum = 0;
    for (int digit : digits) {
      sum += Math.pow(digit, 2);
    }
    return sum;
  }

  public static boolean isHarshadNumber(int number) {
    int sumDigits = sumOfDigits(number);
    return number % sumDigits == 0;
  }

  public static int[][] digitFrequency(int number) {
    int[] digits = getDigitsArray(number);
    int[][] freq = new int[10][2];
    for (int i = 0; i < 10; i++) {
      freq[i][0] = i;
      freq[i][1] = 0;
    }
    for (int digit : digits) {
      freq[digit][1]++;
    }
    return freq;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    System.out.println("Number: " + number);
    System.out.println("Count of digits: " + countDigits(number));

    int[] digitsArray = getDigitsArray(number);
    System.out.println("Digits array: " + Arrays.toString(digitsArray));

    System.out.println("Sum of digits: " + sumOfDigits(number));
    System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
    System.out.println("Is Harshad Number? " + isHarshadNumber(number));

    int[][] freq = digitFrequency(number);
    System.out.println("Digit frequencies:");
    for (int i = 0; i < freq.length; i++) {
      if (freq[i][1] > 0) {
        System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " time(s)");
      }
    }
  }

}
