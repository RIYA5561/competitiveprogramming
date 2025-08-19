// Create a final variable inside a class. Try changing its value later. What error do you get?
public class demo{
    final int finalVar = 100;

    void showFinalVar() {
        System.out.println("Final variable value: " + finalVar);
        // Uncommenting the next line will cause a compilation error
        // finalVar = 200; // Error: cannot assign a value to final variable
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.showFinalVar();
    }
}
