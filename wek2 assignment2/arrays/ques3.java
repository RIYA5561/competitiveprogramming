package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;
import static java.lang.System.out;

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[11];
		for (int i = 1; i < 11; i++) {
			arr[i] = i * n;
		}
		int j = 0;
		while (j < 11) {
			out.println(n + " * " + j + " = " + arr[j]);
			j++;
		}
	}
}
