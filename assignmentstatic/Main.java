package assignmentstatic;
// final to make variable immutable
public class ques3{
    final int rollNo;  // cannot be changed once assigned
    String name;

    ques(int rollNo, String name) {
        this.rollNo = rollNo; // must be initialized here
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        ques3 s1 = new ques3(101, "Riya");
        ques3 s2 = new ques3(102, "Aman");

        s1.display();
        s2.display();

        // s1.rollNo = 200;  ERROR: final variable cannot be reassigned
    }
}


    
}
