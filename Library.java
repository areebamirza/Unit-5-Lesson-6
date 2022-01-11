public class Library
{

  //Instance Data

  private String name;
  private String address;
  private Book[] books;
  private static int numBooks = 0;


  //Constructors

  public Library()
  {
    this("unknown", "unknown", 10);
  }

  public Library(String n, String a, int x)
  {
    this.name = n;
    this.address = a;
    this.books = new Book[x];
  }


  //Accessors

  


  //Mutators

  public void addBooks(Book b)
  {
    books[numBooks] = b;
    numBooks++;
    if(numBooks == books.length - 1)
    {
      increaseSize();
    }
  }

  public void increaseSize()
  {
    Book[] temp = new Book[book.length * 2];
    for(int i = 0; i < books.length; i++)
    {
      temp[i] = books[i];
    }
    books = temp;
  }


  //Others

  public String toString()
  {
    String it = "";
    for(Book i : books)
    {
      it += i + "\n\n";
    }
    return it;
  }
  
}