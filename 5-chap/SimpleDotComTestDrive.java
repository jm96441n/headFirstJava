class SimpleDotComTestDrive {
  public static void main(String[] args) {
    SimpleDotCom dotCom = new SimpleDotCom();
    dotCom.locationCells = {2,3,4};

    String correctGuess = "3";
    String wrongGuess = "1";

    System.out.print("This should be a hit: ");
    dotCom.checkYourself(correctGuess);

    System.out.print("This should be a miss: ");
    dotCom.checkYourself(wrongGuess);
  }
}
