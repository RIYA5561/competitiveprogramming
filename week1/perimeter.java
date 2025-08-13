import java.util.*;
public class basic{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter width of a rectangle: ");
    int w = sc.nextInt();
    System.out.println("enter length of a rectangle: ");
    int l = sc.nextInt();

    System.out.println("enter perimeter of a rectangle: ");
    int p = 2 * (w + l);
    System.out.println("perimeter of rectangle is: " + p);
    }}
