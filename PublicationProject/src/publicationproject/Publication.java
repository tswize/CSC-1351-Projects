package publicationproject;

enum Genre{SCIENCE, ROMANCE, COMIC, CLASSIC, ATHLETIC, BEAUTY, FASHION, ENTERTAINMENT, THRILLER}
public class Publication implements Comparable<Publication>
{ protected String title;
  public Genre genre; //not quite sure what this error means 
  protected int edition, year;

  public Publication(String pubTitle, Genre pubGenre, int pubEdition, int pubYear) 
  {   title = pubTitle;
      genre = pubGenre;
      edition = pubEdition;
      year = pubYear;
  }
   
  public void printInfo()
  { System.out.println(title + " Edition (" + edition + ") published in " + year);
  }
  
  public void printFooter()
  { System.out.println("All rights reserved.\n--------------------");
  }
  
  
  @Override
  public int compareTo(Publication other)
  { if (genre.name().compareTo(other.genre.name()) != 0) //genre.name() casts it from an enum to a string
       return genre.name().compareTo(other.genre.name());
    else 
       return title.compareTo(other.title);
  }
}

