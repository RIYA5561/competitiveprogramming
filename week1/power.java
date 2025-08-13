import java.util.*;
public class basic{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a base number:");

    int b = sc.nextInt();
    System.out.println("Enter an exponent number:");
    int e=sc.nextInt();
    double power =Math.pow(b,e);
    System.out.println("The result of " + b + " raised to the power of " + e + " is: " + power);
    }}

    

