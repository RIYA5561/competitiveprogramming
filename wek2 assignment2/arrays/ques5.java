package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.*;

public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int[] multiplicationResult = new int[4];
		for (int i = 6; i <= 9; i++) {
			multiplicationResult[i - 6] = n * i;
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(n + " * " + (i + 6) + " = " + multiplicationResult[i]);
		}

	}

}
