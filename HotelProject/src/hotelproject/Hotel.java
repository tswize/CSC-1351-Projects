//Teddie Swize
//89-591-0511
//TA: Zeke Abshire
// Submitted around 7:30 PM

package hotelproject;

import java.util.ArrayList;
import java.util.Collections;


public class Hotel implements Comparable<Hotel>{
  
  //declaring variables 
  private String name;
  private int stars;
  private double googleRating;
  private double averageRoomPrice;
  public ArrayList<Room> rooms = new ArrayList<>();
  
  // constructor
  public Hotel(String hotelName, int hotelStars)
  { name = hotelName;
    stars = hotelStars;
  }
  
  // google rating setter  
  public void setGoogleRating(double hotelGoogleRating)
  { googleRating = hotelGoogleRating;   
  }
  
  // room price setter 
  public void setRoomPrice(double hotelAverageRoomPrice)
  { averageRoomPrice = hotelAverageRoomPrice;
  }
  
  public String getInfo()
  { return String.format("%-17s%-8d$%-1.2f%8.2f", name, stars, getAverageRoomPrice(), googleRating);
  }
  
  public double getAverageRoomPrice()
  { //calculate average room price for the room in the hotel
    //for each Room object in array list rooms
      //sum up the prices of each object
      //divide price sum by length of rooms or number of room objects 
    double sum = 0;
    for (Room r: rooms)
        sum += r.getPrice();
    return sum/rooms.size();
  }
 
  @Override
  public int compareTo(Hotel other)
  { if (Double.compare(getAverageRoomPrice(), other.getAverageRoomPrice()) != 0)
       return Double.compare(getAverageRoomPrice(), other.getAverageRoomPrice());
    else if (Integer.compare(stars, other.stars) != 0)
       return -1 * Integer.compare(stars, other.stars);
    else 
       return -1 * Double.compare(googleRating, other.googleRating);
  }
  
  public void add(Room r)
  { rooms.add(r);   
  }
  // hotel.add(rooms.add(Suite)) --> array rooms.add(Suite)
  // rooms = [Suite.........]
  
  
  public void listRooms()
  { Collections.sort(rooms);
    for(Room r: rooms)
      System.out.print(r.getRoomInfo());
  }
}
