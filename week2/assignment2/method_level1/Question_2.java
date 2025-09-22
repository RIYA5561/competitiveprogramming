import java.util.Scanner;

public class Question_2 {

  public static int calculateHandshakes(int nStudents) {
    return (nStudents * (nStudents - 1)) / 2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int nStudents = sc.nextInt();

    int Handshakes = calculateHandshakes(nStudents);

    System.out.println("The maximum number of handshakes among " + nStudents +
        " students is: " + Handshakes);
  }
}
