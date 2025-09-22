import java.util.*;

public class Question_2 {
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

  public static int[] getArray(int number) {
    int count = countDigits(number);
    int[] digits = new int[count];
    int num = number;
    for (int i = count - 1; i >= 0; i--) {
      digits[i] = num % 10;
      num /= 10;
    }
    return digits;
  }

  public static boolean isDuckNumber(int number) {
    int[] digits = getArray(number);
    for (int digit : digits) {
      if (digit != 0)
        return true;
    }
    return false;
  }

  public static boolean isArmstrong(int number) {
    int[] digits = getArray(number);
    int power = digits.length;
    int sum = 0;
    for (int digit : digits) {
      sum += Math.pow(digit, power);
    }
    return sum == number;
  }

  public static int[] findLargest(int[] digits) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int digit : digits) {
      if (digit > largest) {
        secondLargest = largest;
        largest = digit;
      } else if (digit > secondLargest && digit != largest) {
        secondLargest = digit;
      }
    }
    return new int[] { largest, secondLargest };
  }

  public static int[] findSmallest(int[] digits) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int digit : digits) {
      if (digit < smallest) {
        secondSmallest = smallest;
        smallest = digit;
      } else if (digit < secondSmallest && digit != smallest) {
        secondSmallest = digit;
      }
    }
    return new int[] { smallest, secondSmallest };
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    System.out.println("Number: " + number);

    int digitCount = countDigits(number);
    System.out.println("Count of digits: " + digitCount);

    int[] digits = getArray(number);
    System.out.println("Digits array: " + Arrays.toString(digits));

    System.out.println("Is Duck Number? " + isDuckNumber(number));
    System.out.println("Is Armstrong Number? " + isArmstrong(number));

    int[] largestTwo = findLargest(digits);
    System.out.println("Largest digit: " + largestTwo[0] + ", Second Largest digit: " + largestTwo[1]);

    int[] smallestTwo = findSmallest(digits);
    System.out.println("Smallest digit: " + smallestTwo[0] + ", Second Smallest digit: " + smallestTwo[1]);
  }
}
