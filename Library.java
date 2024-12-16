import java.util.ArrayList;

public class Library extends Book{
    
    public Library(String title, String authour, String isbn, boolean isAvailable) {
        super(title, authour, isbn, isAvailable);
    }
    ArrayList<Book>books=new ArrayList<>();
    void addBooks(Book book)
    {
        books.add(book);
    }
  

    public Book search(String title, String isbn, String author) {
        for (Book book : books) {
            if ((title != null && title.equals(book.getTitle())) ||
                (isbn != null && isbn.equals(book.getIsbn())) ||
                (author!=null && author.equals(book.author))) {
                return book;
            }
        }
        return null;
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> isbn.equals(book.getIsbn()));
    }

    public void updateBook(String isbn, String newTitle,String newAuthor,boolean Availablility )
    {
        for(Book book : books)
        {
            if(book.getIsbn().equals(isbn))
            {
               book.setTitle(newTitle);
               book.setauthor(newAuthor);
               book.setAvailable(Availablility);
            }
        }
    }

   
}