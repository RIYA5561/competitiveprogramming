public class demo{
String instanceVar = "Instance Variable"; // Instance variable
    static String staticVar = "Static Variable"; // Static variable

    void display() {
        String localVar = "Local Variable"; // Local variable
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        account acc = new account();
        acc.display();
    }
}
