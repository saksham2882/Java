import java.util.ArrayList;

class Book{
    public String name , author;
    public Book(String name , String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString(){
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the Library");
        this.books.add(book);
    }
    public void issueBook(Book book , String issued_to){
        System.out.println("The book has been issued from the Library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

public class Java_61_Exercise_12_LMS {
    public static void main(String[] args) {

        /*
        Create a Library Management System which is Capable of Issuing books to the Students.
        Books Should have info like:
        1. Book Name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books , return issued books , issue books.
        Assume that all the users are registered with their names in the central Database.
        */

        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("Algorithms_1" , "A");
        bk.add(b1);
        Book b2 = new Book("Algorithms_2" , "B");
        bk.add(b2);
        Book b3 = new Book("Algorithms_3" , "C");
        bk.add(b3);
        Book b4 = new Book("Algorithms_4" , "D");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("Algorithms_5" , "myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3 , "Saksham");
        System.out.println(l.books);
    }
}
