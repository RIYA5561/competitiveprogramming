package Constructor_Level_1;
//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

public class Book {
	String attributes; String title; String author; Long price;
	public Book(){
		
	}
	public Book( String title, String author, Long price){
		
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
        System.out.println("Title: " + title + 
                           ", Author: " + author + 
                           ", Price: " + price);
    }

    public static void main(String[] args) {
       
        Book b1 = new Book();
        b1.display();

        Book b2 = new Book("Java the thunder","Thomas",499L);
        b2.display();
    }
}
