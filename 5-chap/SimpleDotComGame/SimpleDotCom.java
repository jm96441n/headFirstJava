/*
ivars:
int [] locationCells
int numOfHits

methods:
String checkYourself(String guess){}

void setLocationCells(int[] loc) {}
*/

public class SimpleDotCom {
  private int[] locationCells;
  private int numOfHits = 0;

  void setLocationCells(int[] locations) {
    locationCells = locations;
  }

  String checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";

    for(int cell : locationCells ) {
      if (cell == guess) {
        result = "hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length) {
      result = "kill";
    }

    System.out.println(result);
    return result;
  }
}
