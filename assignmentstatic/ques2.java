package assignmentstatic;
//use static to avoid ambiguity
public class ques2 {
    class Student {
    String name;
    int rollNo;
    static String collegeName; // Shared by all objects

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    static void setCollege(String cName) {
        collegeName = cName; // initialized once, avoids ambiguity
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + collegeName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student.setCollege("IIT Delhi"); // initialized once ✅

        Student s1 = new Student("Riya", 1);
        Student s2 = new Student("Aman", 2);

        s1.display();
        s2.display();
    }
}

    
}
