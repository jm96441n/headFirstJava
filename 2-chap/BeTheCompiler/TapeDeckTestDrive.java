// Be The Compiler exercise A
// will not compile, needs
// TapeDeck t  = new TapeDeck();
// on line 7

class TapeDeckTestDrive {
  public static void main(String[] args) {

    t.canRecord = true;
    t.playTape();

    if (t.canRecord == true) {
      t.recordTape();
    }
  }
}
