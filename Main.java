import java.io.*;
import java.util.*;
import static java.lang.System.*;

class Main {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
    System.out.println(b);
    
    Book a = new Book("The Secret Garden", "Frances Hodgson Burnett", 1911, 375, false);
    System.out.println("\n" + a);

    System.out.println("\nNumber of pages in \"The Secret Garden\": " + a.getNumPages());
    System.out.println("Is \"I Am Malala\" hardcover: " + b.getHardCover());

    System.out.println("\nEnter new number of pages for \"I Am Malala\":");
    int np = scan.nextInt();
    b.setNumPages(np);

    System.out.println("\n" + b);

    System.out.println("\nChange the author for \"The Secret Garden\":");
    String auth = scan2.nextLine();
    a.setAuthor(auth);

    System.out.println("\n" + a);

    Book b2 = new Book("I am Malala", "Malala", 2012, 280, false);

    System.out.println("\nAre the books equal? " + b.equals(b));
    System.out.println("\nAre the books equal? " + b.equals(a));
    System.out.println("\nAre the books equal? " + b.equals(b2));

    Book def1 = new Book();
    Book def2 = new Book();

    System.out.println("\nThis is Default Book 1:\n" + def1);
    System.out.println("\nThis is Default Book 2:\n" + def2);
    System.out.println("\nAre the default books equal? " + def1.equals(def2) + "\n\n\n");


    //Create Library
    Library lib = new Library();
    System.out.println(lib);

    //add books to our library
    lib.addBooks(b);
    lib.addBooks(b2);
    lib.addBooks(a);
    lib.addBooks(def1);
    lib.addBooks(def2);
    lib.addBooks(b);
    lib.addBooks(b2);
    lib.addBooks(a);
    lib.addBooks(def1);
    lib.addBooks(def2);

    System.out.println("Increasing size of array\n\n");
    lib.increaseSize();
    System.out.println(lib);

    lib.addBooks(def2);
    System.out.println(lib);

  }

}