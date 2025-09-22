package InheritanceProblem.Single_Inheritance;

class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    String authorName, bio;
    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + authorName + " | Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2024, "John Doe", "Tech Author");
        a.displayInfo();
    }
}
