/*
ivars:
int [] locationCells
int numOfHits

methods:
String checkYourself(String guess){}

void setLocationCells(int[] loc) {}
*/

import java.util.ArrayList;

public class SimpleDotCom {
  private ArrayList<String> locationCells;

  void setLocationCells(ArrayList<String> locations) {
    locationCells = locations;
  }

  String checkYourself(String stringGuess) {
    int index = locationCells.indexOf(stringGuess);
    String result = "miss";

    if (index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty) {
        result = "kill";
      } else {
        result = "hit";
      }
    }
    return results;
  }
}
