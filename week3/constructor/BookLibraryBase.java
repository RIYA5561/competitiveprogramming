package Constructor_Level_1;
//Design a Book class with:
//ISBN (public).
//title (protected).
//author (private).
//Write methods to:
//Set and get the author name.
//Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
class BookLibraryBase {
    public String ISBN;
    protected String title;
    private String author;

    public BookLibraryBase(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends BookLibraryBase {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("EBook Author: " + getAuthor());
        System.out.println("File Size: " + fileSize);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        BookLibraryBase book1 = new BookLibraryBase("9118-654", "Java the thunder", "Thomas");
        book1.displayBookDetails();

        System.out.println();

        EBook ebook1 = new EBook("9118-654", "Java the thunder", "Thomas", 5);
        ebook1.displayEBookDetails();

        System.out.println();

        ebook1.setAuthor("J. Bloch");
        ebook1.displayEBookDetails();
    }

}
