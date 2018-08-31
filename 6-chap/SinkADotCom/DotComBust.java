import java.util.*;
class DotComBust {
  private DotCom pets = new DotCom();
  private DotCom askJeeves = new DotCom();
  private DotCom goDaddy = new DotCom();
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;

  // Set up the game
  public void setUpGame() {
    // Give dotComs a name
    pets.setName("Pets.com");
    askJeeves.setName("Ask.com");
    goDaddy.setName("GoDaddy.com");

    // Add dotcoms to list of dotcoms
    dotComList.add(pets);
    dotComList.add(askJeeves);
    dotComList.add(goDaddy);

    // assign locations for each dotcom
    for( DotCom dotCom : dotComList ) {
      ArrayList<String> location = helper.placeDotCom(3);
      dotCom.setLocation(location);
    }

    System.out.println("Are you ready to play! The goal of the game is to contiue making guesses with a pair of numbers to indicate the row and column you want to strike. Keep playing until all dotcoms are sunk!");
  }

  // Game loop
  public void startPlaying() {
    boolean keepPlaying = true;

    while (keepPlaying == true) {
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);

      keepPlaying = !dotComList.isEmpty();
    }
    finishGame();
  }

  // Checks the user guess for a hit
  private void checkUserGuess(String userGuess) {
    // check for hit or kill on DotCom
    numOfGuesses++;
    // check for hit or kill on all dotcoms
    String result = "miss";
    for ( DotCom dotCom : dotComList ) {
      result = dotCom.checkYourself(userGuess);
      if (result == "hit") {
        break;
      } else if (result == "kill") {
        dotComList.remove(dotCom);
        break;
      }
    }
    System.out.println("You got a: " + result);
  }

  // Finishes the game, displays user score
  private void finishGame() {
    System.out.println("GAME OVER");
    if(numOfGuesses < 12) {
      System.out.println("Good job! You're not terrible");
    } else {
      System.out.println("Damn, you're bad at this aren't you");
    }
    System.out.println("It took you " + numOfGuesses + " guesses.");
  }

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }
}
