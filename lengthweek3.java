import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len=s.lastIndexOf("");
        System.out.println("the length of the string is: " + len);
    }
}
