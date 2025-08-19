//Write a program to show that local variables must be initialized before use. Comment on what error appears otherwise.
 public class student{    
void localVarExample() {
        int localVar; // Local variable declared but not initialized
         System.out.println("Local variable value: " + localVar); // This will cause a compilation error
       
     }
    public static void main(String[] args) {
        user obj = new user();
        // obj.localVarExample(); // Uncommenting this line will cause a compilation error
        System.out.println("Local variable example is commented out to avoid compilation error.");
    }





    
}
