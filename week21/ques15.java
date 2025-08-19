// Create a class with multiple methods accessing the same instance variable. Show how changes made in one method affect another.
  public class student{  
int instanceVar = 10; // Instance variable
    void methodOne() {
        instanceVar += 5; // Modify instance variable
        System.out.println("Value in methodOne: " + instanceVar);
    }
    void methodTwo() {
        System.out.println("Value in methodTwo: " + instanceVar); // Access modified instance variable
    }
    public static void main(String[] args) {
        user obj = new user();
        obj.methodOne(); // Call methodOne to modify instance variable
        obj.methodTwo(); // Call methodTwo to access modified instance variable
    }}
