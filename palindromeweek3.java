import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       String s= sc.nextLine().toLowerCase();
       int i =0 , j=s.length()-1;
       boolean ispalindrome=true;
       while(i<j){
          if(s.charAt(i)!=s.charAt(j)){
               ispalindrome=false;
          }
          i++;
          j--;
       }
       if(ispalindrome==true){
            System.out.println("palindrome");
       }else{
        System.out.println("not palindrome");
       }
    }
}
