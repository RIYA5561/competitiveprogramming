public class student {
     //Create a class Student with name (String) and marks (int). Use a constructor to initialize values.Create two objects and print their data.
    String name;
    int marks;
    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        
    }
    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
    public static void main(String[] args) {
        student student1 = new student("Alice", 85);
        student student2 = new student("Bob", 90);
        
        student1.display();
        student2.display();
        
    }
}
