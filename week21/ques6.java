public class demo {
    //Create a class Demo where you declare a local variable with the same name as an instance variable. Use this keyword to differentiate.
    int num = 50; // Instance variable
    void display() {
        int num = 30; // Local variable
        System.out.println("Local variable num: " + num);
        System.out.println("Instance variable num: " + this.num);
        }
    public static void main(String[] args) {
        demo obj = new demo();
        obj.display();
    }
}
