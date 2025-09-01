import java.util.Scanner;
public class vowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string: ");
        String s=sc.nextLine().toLowerCase();
        int count=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u' ){
                count++;
            }
        }
        System.out.println(count);
    }  
}
