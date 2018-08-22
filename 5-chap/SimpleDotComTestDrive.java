class SimpleDotComTestDrive {
  public static void main(String[] args) {
    SimpleDotCom dotCom = new SimpleDotCom();
    int[] locations = {2,3,4};
    dotCom.locationCells = locations;

    String correctGuess = "3";
    String wrongGuess = "1";

    String correctResponse = dotCom.checkYourself(correctGuess);
    String testResult = "failed";

    if(correctResponse.equals("hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
    testResult = "failed";

    String wrongResponse = dotCom.checkYourself(wrongGuess);

    if (wrongResponse.equals("miss")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}
