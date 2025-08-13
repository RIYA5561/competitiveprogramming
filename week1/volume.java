import java.util.*;
public class basic{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the cylinder:");
    int radius = sc.nextInt();
    System.out.println("Enter the height of the cylinder:");
    int height = sc.nextInt();
    double volume = Math.PI * radius * radius * height;
    System.out.printf("The volume of the cylinder is: %.2f\n", volume);
    }}
