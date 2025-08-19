// 5. Write a program where you modify a static variable using one object, and access it from another object. Show how it reflects the change.
public class student{
    static int staticVar = 10;

    public void modifyStaticVar(int value) {
        staticVar = value;
    }

    public static void main(String[] args) {
        student obj1 = new student();
        student obj2 = new student();

        System.out.println("Initial static variable: " + student.staticVar);

        obj1.modifyStaticVar(20);
        System.out.println("Modified static variable from obj1: " + student.staticVar);

        System.out.println("Accessing static variable from obj2: " + obj2.staticVar);
    }
    
}
