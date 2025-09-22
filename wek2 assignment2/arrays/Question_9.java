package Bridgelabz_Training.Assignment-2. Arrays;

import java.util.Scanner;

public class Question_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int columns = sc.nextInt();
    int[][] arr = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    int[] array = new int[rows * columns];
    int idx = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        array[idx++] = arr[i][j];
      }
    }
    System.out.println("1D Array elements:");
    for (int k = 0; k < array.length; k++) {
      System.out.print(array[k] + " ");
    }
  }
}
