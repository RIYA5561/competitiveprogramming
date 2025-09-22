package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number <= 0) {
			System.out.println("Not a natural number");
			return;
		}
		int size = number / 2 + 1;
		int oddIndex = 0;
		int evenIndex = 0;
		int[] odd = new int[size];
		int[] even = new int[size];
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				even[evenIndex] = i;
				evenIndex++;
			} else {
				odd[oddIndex] = i;
				oddIndex++;
			}
		}
		for (int i = 0; i < oddIndex; i++) {
			System.out.println("Odd Values Are " + odd[i]);
		}
		for (int i = 0; i < evenIndex; i++) {
			System.out.println("Even Values Are " + even[i]);
		}

	}
}
