package Constructor_Level_1;
//Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

public class Circle {
	Long radius;
	Circle(){
		this.radius = 1L;
	}
	Circle(Long radius){
		this.radius = radius;
	}
	void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();     
        Circle c2 = new Circle(10L);  

        c1.display();
        c2.display();
    }
}
