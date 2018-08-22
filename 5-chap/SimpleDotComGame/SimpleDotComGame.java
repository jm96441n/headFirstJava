/*
methods:
main
*/

public class SimpleDotComGame {
  public static void main(String[] args) {
    GameHelper helper = new GameHelper();
    SimpleDotCom dotCom = new SimpleDotCom();
    int firstCell = (int) (Math.random() * 5);
    int numberOfGuesses = 0;
    int[] locations = {firstCell, firstCell + 1, firstCell + 2};

    dotCom.setLocationCells(locations);

    boolean isAlive = true;

    while(isAlive == true) {
      String prompt = "Enter a number:";
      String userGuess = helper.getUserInput(prompt);

      String response = dotCom.checkYourself(userGuess);
      numberOfGuesses++;

      if (response == "kill") {
        isAlive = false;
      }
    }

    System.out.println("You've won, and it only took " + numberOfGuesses + " tries. Not bad I guess");
  }
}
