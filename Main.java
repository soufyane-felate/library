import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        String choice;

        do {
            System.out.println("\nM E N U");
            System.out.println("1: Add a Book");
            System.out.println("2: Display Books");
            System.out.println("3: Search a Book");
            System.out.println("4: Update a Book");
            System.out.println("5: Remove a Book");
            System.out.println("6: borrow book");
            System.out.println("7: return book");
            System.out.println("8: display All Available books ");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            switch (choice) {

                case "1":
                    library.addBook();
                    break;



                case "2":
                    System.out.println("Books in Library:");
                    library.displayBooks();
                    break;

                case "3":
                    library.search();
                    break;

                case "4":


                    library.updateBook();
                    break;

                case "5":
                    System.out.print("Enter ISBN of book to remove: ");
                   String isbn = sc.next();
                    library.removeBook(isbn);
                    break;
                case "6":
                    library.borrowBook();
                    break;
                case "7":
                    library.returnBook();
                    break;
                case "8":
                    library.displayFunAvailable();
                    break;


                case "0":
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("0"));
    }
}