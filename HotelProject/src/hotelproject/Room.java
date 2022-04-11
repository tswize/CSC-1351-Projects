package hotelproject;

public class Room implements Comparable<Room>
{ 
  protected int roomNum;
  protected double price;
  
  public Room(int roomNumber, double roomPrice)
  { roomNum = roomNumber;
    price = roomPrice;
  }
  
  //set price of room
  public void setPrice(double RoomPrice)
  { price = RoomPrice;      
  }
  
  public double getPrice()
  { return price;  
  }
  
  //returns empty string
  public String getRoomInfo()
  { return " ";
  }
  
  //compare rooms lowest price to highest
  @Override
  public int compareTo(Room other)
  { return Double.compare(price, other.price);
  }
    
}
