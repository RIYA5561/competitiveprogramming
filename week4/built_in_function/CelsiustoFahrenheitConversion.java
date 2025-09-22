
import java.util.Scanner;

public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Celcius = sc.nextInt();
        double Fahrenheit = (Celcius * 9/5) + 32;
        System.out.print(Fahrenheit);
        }
    }
