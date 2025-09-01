import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class zone {
    public static void main(String[] args){
        DateTimeFormatter date=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        ZonedDateTime timezone1=ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime timezone2=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime timezone3=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("GMT: " + timezone1.format(date));
        System.out.println("IST: " + timezone2.format(date));
        System.out.println("PST: " + timezone3.format(date));
    }
}
