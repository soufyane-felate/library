import java.util.ArrayList;
import java.util.Scanner;

public class Library {
     ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBook(String title, String isbn, String author) {
        for (Book book : books) {
            if ((title != null && title.equals(book.getTitle())) ||
                (isbn != null && isbn.equals(book.getIsbn())) ||
                (author != null && author.equals(book.getAuthor()))) {
                return book;
            }
        }
        return null;
    }

    public void updateBook(String isbn, int choice) {
        Scanner sc = new Scanner(System.in);
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter new title: ");
                        book.setTitle(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new author: ");
                        book.setAuthor(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Is the book available? (true/false): ");
                        book.setAvailable(sc.nextBoolean());
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed successfully.");
    }
}
