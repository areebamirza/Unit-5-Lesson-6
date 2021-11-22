public class Book {

  // Fields/Instance Data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;
  

  // Constructor Methods
  public Book(String t, String a, int y, int n, boolean h)
  {
    title = t;
    author = a;
    year = y;
    numPages = n;
    hardCover = h;
  }


  // Accessor Methods
  public String getTitle()
  {
    return title;
  }

  public String getAuthor()
  {
    return author;
  }

  public int getYear()
  {
    return year;
  }

  public int getNumPages()
  {
    return numPages;
  }

  public boolean getHardCover()
  {
    return hardCover;
  }


  // Mutator Methods
  public void setTitle(String t)
  {
    title = t;
  }

  public void setAuthor(String a)
  {
    author = a;
  }

  public void setYear(int y)
  {
    year = y;
  }

  public void setNumPages(int p)
  {
    numPages = p;
  }

  public void setHardCover(boolean c)
  {
    hardCover = c;
  }


  // Other Methods
  public boolean equals(Book b)
  {
    if(this.getTitle().equals(b.getTitle()))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  

  // toString() - what prints for our object
  public String toString()
  {
    String str = "";
    str = "Title: " + title + "\nAuthor: " + author + "\nYear Published: " + year;
    str += "\nNumber of Pages: " + numPages + "\nHard Cover: " + hardCover;
    return str;
  }
  
}

// Private: cannot access directly from outside the class - (Encapsulation)
// Public - can access from outside class