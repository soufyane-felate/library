

class Book
{
  String isbn,title,author ;
  boolean isAvailable;


  public Book( String isbn,String title, String author, boolean isAvailable) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.isAvailable = isAvailable;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getauthor() {
    return author;
  }

  public void setauthor(String author) {
    this.author = author;
  }


  public boolean getIsAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }


  @java.lang.Override
  public java.lang.String toString() {
    return "Book{" +
            "isbn='" + isbn + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", isAvailable=" + isAvailable +
            '}';
  }

 
}
