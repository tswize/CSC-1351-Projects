//Teddie Swize
//89-591-0511
//TA: Zeke Abshire
// Submitted around 7:30 PM

package hotelproject;

public class Suite extends Room
{ private int numRoom;
  private boolean hasKitchen;
  
  public Suite(int roomNumber, double roomPrice, int suiteRoomNum, boolean roomKitchen)
  { super(roomNumber,roomPrice);
    numRoom = suiteRoomNum;
    hasKitchen = roomKitchen;
  }
  
  @Override
  public String getRoomInfo()
  { String info = "Suite " + roomNum + "\t$" + price + "\t\t" + numRoom + " rooms\t\t";
    if(hasKitchen)
       return info + "Kitchen" + "\n";
    else
       return info + "No Kitchen" + "\n";
  }
}
