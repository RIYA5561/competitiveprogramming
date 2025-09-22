package Bridgelabz_Training.Assignment-2. Arrays;

import static java.lang.System.out;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		while (i < 5) {
			arr[i++] = sc.nextInt();

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > 0) {
				if (arr[j] % 2 == 0) {
					out.println("Postive Even Number");

				} else {
					out.println("Postive Odd Number");
				}
			} else if (arr[j] < 0) {
				out.println("Negative Number");
			} else {
				out.println("Number is Zero");
			}

		}
		if (arr[0] == arr[arr.length - 1]) {
			out.println("Eqauls");
		} else if (arr[0] < arr[arr.length - 1]) {
			out.println("Last Index is greater");
		} else {
			out.println("First Index is greater");
		}

	}
}
