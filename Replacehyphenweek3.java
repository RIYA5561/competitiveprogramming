import java.util.Scanner;

public class Replacehypen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String replace = s1.replace(' ','-');
        System.out.print(replace);
    }  
}
