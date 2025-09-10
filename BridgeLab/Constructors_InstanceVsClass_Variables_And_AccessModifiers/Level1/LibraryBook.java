package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is not available!");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Data Structures", "Mark", 299.99);
        lb.display();
        lb.borrowBook();
        lb.display();
    }
}

