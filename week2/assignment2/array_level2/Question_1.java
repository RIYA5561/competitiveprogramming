package Bridgelabz_Training.Assignment-2. Arrays_Level2;

import java.util.Scanner;

public class Question_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 10;
    double[] salary = new double[n];
    double[] years = new double[n];
    double[] bonus = new double[n];
    double[] newSalary = new double[n];
    double totalOldSalary = 0;
    double totalNewSalary = 0;
    double totalBonus = 0;
    for (int i = 0; i < n; i++) {
      System.out.print("Enter the salary: ");
      double sal = sc.nextDouble();
      System.out.println("Enter the years: ");
      double yrs = sc.nextDouble();
      if (sal <= 0 || yrs < 0) {
        System.out.println("Invalid Input TryAgain");
        i--;
        continue;
      }
      if (yrs > 5) {
        bonus[i] = sal * 0.05;
      } else {
        bonus[i] = sal * 0.02;
      }
      salary[i] = sal;
      years[i] = yrs;
      newSalary[i] = bonus[i] + salary[i];
      totalOldSalary += salary[i];
      totalNewSalary += newSalary[i];
      totalBonus += bonus[i];
    }
    System.out.println("\n--- Employee Salary Details ---");
    for (int i = 0; i < n; i++) {
      System.out.println("Employee " + (i + 1) +
          " | Old Salary: " + salary[i] +
          " | Years: " + years[i] +
          " | Bonus: " + bonus[i] +
          " | New Salary: " + newSalary[i]);
    }
    System.out.println("\n--- Company Totals ---");
    System.out.println("Total Old Salary = " + totalOldSalary);
    System.out.println("Total Bonus Payout = " + totalBonus);
    System.out.println("Total New Salary = " + totalNewSalary);

  }
}
