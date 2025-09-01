import java.util.*;
public class countwords {
     public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String s = sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        int count=st.countTokens();
        System.out.println("the number of words in the given string are: " + count);
    }
}
