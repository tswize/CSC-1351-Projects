//Teddie Swize
//89-591-0511
//TA: Zeke Abshire
// Submitted around 7:30 PM

package hotelproject;

public class SingleRoom extends Room
{ 
  private String bedType;
  private boolean smoking;
  
  public SingleRoom(int roomNumber, double roomPrice, String bedroomType, boolean roomSmoking)
  { super(roomNumber, roomPrice);
    bedType = bedroomType;
    smoking = roomSmoking;
  }
  
  @Override
  public String getRoomInfo()
  { String info = "Room " + roomNum + "\t$" + price + "\t\t" + bedType + "\t\t";
    if (smoking)
       return info + "Smoking" + "\n";
    else 
       return info + "No Smoking" + "\n";
  }
  
}
