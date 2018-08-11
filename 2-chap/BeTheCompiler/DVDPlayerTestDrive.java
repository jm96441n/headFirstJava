// Be the Compiler exercise B
// will not compile
// DVDPlayer class does not have `playDVD` method

class DVDPlayerTestDrive {
  public static void main(String[] args) {
    DVDPlayer d = new DVDPlayer();
    d.canRecord = true;
    d.playDVD();

    if(d.canRecord == true) {
      d.recordDVD();
    }
  }
}
