//Teddie Swize
//89-591-0511
//TA: Zeke Abshire
// Submitted around 6:00 PM

package publicationproject;


public class Book extends Publication 
{ private String author;
  
  public Book(String bookAuthor, String pubTitle, Genre pubGenre, int pubEdition, int pubYear) 
  { super(pubTitle, pubGenre, pubEdition, pubYear);
    author = bookAuthor;
  }
  
  @Override 
  public void printInfo()
  { super.printInfo();
    System.out.println(genre + " book by " + author);
    super.printFooter();   
  }
}
