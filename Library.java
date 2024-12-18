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
