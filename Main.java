import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nM E N U");
            System.out.println("1: Add a Book");
            System.out.println("2: Display Books");
            System.out.println("3: Search a Book");
            System.out.println("4: Update a Book");
            System.out.println("5: Remove a Book");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.next();
                    System.out.print("Enter Title: ");
                    String title = sc.next();
                    System.out.print("Enter Author: ");
                    String author = sc.next();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable = sc.nextBoolean();


                    library.addBook(new Book(title, author, isbn, isAvailable));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.println("Books in Library:");
                    library.displayBooks();
                    break;


                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
