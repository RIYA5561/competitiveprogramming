package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {
		double[] arr = new double[10];
		arr[0] = 0.0;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
			double n = sc.nextDouble();
			if (n <= 0 || i > 10) {
				break;
			}
			arr[i] = n;
			i++;
		}
		double total = 0.0;
		for (int j = 0; j < 10; j++) {
			total += arr[j];
		}
		System.out.println(total);
	}
}
