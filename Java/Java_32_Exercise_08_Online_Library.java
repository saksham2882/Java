class library {
    String[] books;
    int no_of_books = 0;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("* " + book + " ---> has been added!");
    }

    void showAvailableBooks() {
        System.out.println("\nAvailable Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("---> " + book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class Java_32_Exercise_08_Online_Library {
    public static void main(String[] args) {

        // You have to implement a library using Java Class Library
        // Methods: addBook , issueBook , returnBook , showAvailableBooks
        // Properties: Array to store the available books
        // Array to store the issued books

        library centralLibrary = new library();
        centralLibrary.addBook("Think and Glow Rich");
        centralLibrary.addBook("Poor become Poor and Rich become Rich Why!");
        centralLibrary.addBook("Do or Die");
        centralLibrary.addBook("We are Together in one Line");

        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Do or Die");

        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Do or Die");
        centralLibrary.showAvailableBooks();
    }
}
