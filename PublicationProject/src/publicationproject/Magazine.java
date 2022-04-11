package publicationproject;

public class Magazine extends Publication
{ private String publisher; 

  public Magazine(String magPublisher, String pubTitle, Genre pubGenre, int pubEdition, int pubYear) 
  { super(pubTitle, pubGenre, pubEdition, pubYear);
    publisher = magPublisher;
    }
  
  @Override 
  public void printInfo()
  { super.printInfo();
    System.out.println(genre + " magazine by " + publisher);
    super.printFooter();
  }
  
    
}
