import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static int counter = 0;
    private static final String staticVal = "BO";

    public static String AutoId()
    {
        counter++;
        return staticVal + String.format("%03d", counter);
    }
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
/*
    public void addBook(Book book) {
        books.add(book);
    }
*/
public void addBook()
{

        System.out.print("Enter Title: ");
        String title = sc.next();
        sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        boolean isAvailable = false;
        while (true) {
            System.out.print("Is Available (true/false): ");
            if (sc.hasNextBoolean()) {
                isAvailable = sc.nextBoolean();
                break;
            } else {
                System.out.println("Invalid input, please enter 'true' or 'false'.");
                sc.next();
            }
        }
        books.add(new Book(AutoId(),title,author,isAvailable));
       System.out.println("Book added successfully!");





}
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }



    public void search() {
        String valSearch;
        ArrayList<Book> stock = new ArrayList<>();
        System.out.print("Enter title, ISBN, or author to search: ");

        valSearch = sc.next();
        sc.nextLine();

        for (Book book : books) {
            if (valSearch.equals(book.getTitle()) ||
                    valSearch.equals(book.getIsbn()) ||
                    valSearch.equals(book.getauthor())) {
                stock.add(book);
            }
        }

        if (stock.isEmpty()) {
            System.out.println(valSearch + " not found.");
        } else {
            for (Book book : stock) {
                System.out.println(book);
            }
        }
    }


   public void updateBook() {
       Scanner sc = new Scanner(System.in);
       String isbn;
       boolean found = false;

       System.out.print("Enter ISBN of book to update: ");
       isbn = sc.nextLine();

       for (Book book : books) {
           if (book.getIsbn().equals(isbn)) {
               found = true;

               System.out.println("1: Update Title\n2: Update Author\n3: Update Availability");
               System.out.print("Enter your choice: ");
               int updateChoice = sc.nextInt();
               sc.nextLine();

               switch (updateChoice) {
                   case 1:
                       System.out.print("Enter new title: ");
                       book.setTitle(sc.nextLine());
                       break;
                   case 2:
                       System.out.print("Enter new author: ");
                      book.setauthor(sc.nextLine());
                       break;
                   case 3:
                       System.out.print("Is the book available? (true/false): ");
                       book.setAvailable(sc.nextBoolean());
                       sc.nextLine();
                       break;
                   default:
                       System.out.println("Invalid choice.");
                       return;
               }
               System.out.println("Book updated successfully.");
               break;
           }
       }

       if (!found) {
           System.out.println("Book not found.");
       }
   }



    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed successfully.");
    }



    void borrowBook() {
        System.out.print("Title: ");
        String title = sc.nextLine();

        boolean bookFound = false;

        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                bookFound = true;

                if (book.getIsAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("This book is not available.");
                }
                return;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found.");
        }
    }

    void returnBook() {
        System.out.print("Title: ");
        String title = sc.nextLine();

        boolean bookFound = false;

        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                bookFound = true;

                if (!book.getIsAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("The book was already returned.");
                }
                return;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found.");
        }
    }



    void displayFunAvailable() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        ArrayList<Book> notAvailableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsAvailable()) {
                availableBooks.add(book);
            } else {
                notAvailableBooks.add(book);
            }
        }
        if (!availableBooks.isEmpty()) {
            System.out.println("Available Books:");
            for (Book book : availableBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("No available books.");
        }
        if (!notAvailableBooks.isEmpty()) {
            System.out.println("\nBooks Not Available:");
            for (Book book : notAvailableBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println("All books are available.");
        }
    }

}