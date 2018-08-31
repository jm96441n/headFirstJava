import java.util.*;
class DotCom {
  private String name;
  private ArrayList<String> location;
  private String status = "alive";

  // Getter method for name ivar
  public String getName() {
    return name;
  }

  // Setter method for name ivar
  public void setName(String dotComName) {
    name = dotComName;
  }

  // Getter method for location ivar
  public ArrayList<String> getLocation() {
    return location;
  }

  // Setter method for location ivar
  public void setLocation(ArrayList<String> newLocation) {
    location = newLocation;
  }

  // Getter method for status
  public String getStatus() {
    return status;
  }

  // Setter method for status
  public void setStatus(String newStatus) {
    status = newStatus;
  }

  public String checkYourself(String guess) {
    // check for hit or miss
    String result = "miss";
    if (location.contains(guess)) {
      result = "hit";
      location.remove(guess);
    }

    if (location.isEmpty()) {
      result = "kill";
    }
    return result;
  }
}
