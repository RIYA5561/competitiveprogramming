import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class datecomparison {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first date: ");
        String date1=sc.nextLine();
        System.out.println("enter your second date: ");
        String date2=sc.nextLine();
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate finaldate1=LocalDate.parse(date1,myformat);
        LocalDate finaldate2=LocalDate.parse(date2,myformat);
        System.out.println(finaldate1.isBefore(finaldate2));
        System.out.println(finaldate1.isAfter(finaldate2));
        System.out.println(finaldate1.isEqual(finaldate2));
    } 
}
