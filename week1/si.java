import java.util.*;
public class basic{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter principal amount");
    double p = sc.nextDouble();
    System.out.println("enter rate of interest");
    double r = sc.nextDouble();
    System.out.println("enter time in years");
    double t = sc.nextDouble();
    double si = (p * r * t) / 100;
    System.out.println("Simple Interest is: " + si);
    
    }}
