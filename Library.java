import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addBook(Book book) {
        books.add(book);
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

        valSearch = sc.nextLine();

        for (Book book : books) {
            if (valSearch.equals(book.getTitle()) ||
                    valSearch.equals(book.getIsbn()) ||
                    valSearch.equals(book.getAuthor())) {
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
                       book.setAuthor(sc.nextLine());
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



    void borrowBook(){
        String title;
        System.out.print("title : ");
        title=sc.nextLine();
        for(Book book : books)
        {
            if(title.equals(book.title)&&book.isAvailable){
                book.isAvailable=false;
                System.out.println("book Borrow successfully");

            }else
            {
                System.out.println("the book already Borrowed");

            }
            break;
        }

    }
    void returnBook( ){
        String title;
        System.out.print("title : ");
        title=sc.nextLine();
        for(Book book:books)
        {
            if(title.equals(book.title)&&!book.isAvailable)
            {
                book.isAvailable=true;
                System.out.println("book returned successfully");

            }else
            {
                System.out.println("the book already returned");

            }
            break;
        }

    }
    void displayFunAvailable() {
        ArrayList<Book>Avbooks=new ArrayList<>();
        ArrayList<Book>Notbooks1=new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println("Available Books  ");
                Avbooks.add(book);
                System.out.println(Avbooks);
            }
        }for (Book book : books) {
            if (!book.isAvailable) {
                System.out.println("Books not Available");
                Notbooks1.add(book);
                System.out.println(Notbooks1);
            }
        }

       //this.books.stream().filter(book -> book.isAvailable).forEach(System.out::println);


    }
}
