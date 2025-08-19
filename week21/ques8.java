public class student{
static int staticVar;
    static {
        staticVar = 50; // Static block to initialize static variable
    }
    public static void main(String[] args) {
        System.out.println("Static variable value: " + staticVar);
    }}
