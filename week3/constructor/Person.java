package Constructor_Level_1;
//Create a Person class with a copy constructor that clones another person's attributes.
public class Person {
	String name;
    int age;

  
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        
        Person p1 = new Person("Ram", 25);
        p1.display();

       
        Person p2 = new Person(p1);
        p2.display();
    }
}
