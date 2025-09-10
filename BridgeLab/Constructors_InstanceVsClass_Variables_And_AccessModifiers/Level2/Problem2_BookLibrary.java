package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level2;


// Problem2_BookLibrary.java
class Book {
    public String ISBN;        // Public
    protected String title;    // Protected
    private String author;     // Private

    Book(String isbn, String t, String a) {
        ISBN = isbn;
        title = t;
        author = a;
    }

    // Public methods to set/get author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// Subclass to demonstrate access to public & protected members
class EBook extends Book {
    String format;

    EBook(String isbn, String t, String a, String f) {
        super(isbn, t, a);
        format = f;
    }

    public void showDetails() {
        // Access ISBN (public) and title (protected)
        System.out.println("EBook: " + title + " (ISBN: " + ISBN + ") in " + format + " format");
    }
}
public class Problem2_BookLibrary {
    public static void main(String[] args) {
        EBook eb = new EBook("123-456-789", "Java Basics", "James Gosling", "PDF");
        eb.display();
        eb.showDetails();

        eb.setAuthor("Gosling James"); // Modifying private author using public method
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
