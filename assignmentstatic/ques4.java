package assignmentstatic;

public class ques4 {
    class Animal {}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();

        if (a instanceof Dog) {   //Safe check before casting
            Dog d = (Dog) a;
            d.bark();
        } else {
            System.out.println("Not a Dog, cannot cast safely.");
        }
    }
}


    
}
