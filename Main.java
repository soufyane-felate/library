public class Main {

    public static void main(String[] args) {
        Library library = new Library("Khawf", "oussama", "qb4352", true);
        Library library1 = new Library("Khawf67234", "5623oussama", "1356qb4352", true);
        library.display();
        library.addBooks(library1);
        library.display();
        Library library = new Library();
        library.addBook(new Book("Title1", "Author1", "ISBN1", true));
        library.addBook(new Book("Title2", "Author2", "ISBN2", true));
    }
}


