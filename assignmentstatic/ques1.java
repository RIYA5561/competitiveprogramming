public class ques1 {
    class Employee {
    String name;
    int id;
    static String companyName = "Google"; // shared across all employees

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(id + " " + name + " works at " + companyName);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Riya", 101);
        Employee e2 = new Employee("Aman", 102);

        e1.display();
        e2.display();
    }
}

    
}
