package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
		double[] arr = new double[12];
		int i = 0;
		double total = 0;
		double n = 0;
		Scanner sc = new Scanner(System.in);
		while (i < 12) {

			n = sc.nextDouble();
			total += n;
			arr[i++] = n;
		}
		double mean = total / arr.length;
		System.out.println(mean);

	}
}
