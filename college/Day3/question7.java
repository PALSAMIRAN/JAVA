package college.Day3;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int numCopies;

    // Parameterized constructor for new book title purchase
    public Book(String title, String author, int numCopies) {
        this.title = title;
        this.author = author;
        this.numCopies = numCopies;
    }

    // Copy constructor for existing book title purchase
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.numCopies = other.numCopies;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    // Function to purchase more copies of the book
    public void purchaseMoreCopies(int additionalCopies) {
        numCopies += additionalCopies;
    }
}

class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    // Function to purchase a new book title
    public void purchaseNewBook(String title, String author, int numCopies) {
        // Check if the book title already exists in the collection
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("Error: Book title already exists in the collection.");
                return;
            }
        }

        // Add the new book to the collection
        Book newBook = new Book(title, author, numCopies);
        books.add(newBook);
    }

    // Function to purchase an existing book title
    public void purchaseExistingBook(String title, int numCopies) {
        // Check if the book title exists in the collection
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.purchaseMoreCopies(numCopies);
                return;
            }
        }

        System.out.println("Error: Book title not found in the collection.");
    }

    // Function to display all books and their details in the collection
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Number of Copies: " + book.getNumCopies());
            System.out.println();
        }
    }
}

public class question7 {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        // Purchase a new book title
        bookManager.purchaseNewBook("Chander Pahar", "Bibhutibhusan Bandhopadhaya", 5);

        // Purchase an existing book title
        bookManager.purchaseExistingBook("To Kill a Mockingbird", 3);

        // Display all books in the collection
        bookManager.displayBooks();
    }
}
