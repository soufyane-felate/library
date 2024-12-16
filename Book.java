

class Book
{
  String title;
String author,isbn ;
  boolean isAvailable;


  public Book(String title, String author, String isbn, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = isAvailable;
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
    author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    isAvailable = isAvailable;
  }


  @java.lang.Override
  public java.lang.String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", isbn='" + isbn + '\'' +
            ", isAvailable=" + isAvailable +
            '}';
  }
  void display()


  {
    System.out.println(    "title : "+title+"\n"+
    "author : "+author+"\n"+
     "isbn : "+isbn+"\n"+
      "isAvailable : "+isAvailable);             
  }
 void bortowBook()
 {
    isAvailable=false;
}
 void returnBook()
 {
    isAvailable=true;
 }
}
