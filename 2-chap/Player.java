class Player {
  int number = 0; // where the guess lives

  public void guess() {
    number = (int) (Math.random() * 10); // make a guess
    System.out.println("I'm guessing " + number);
  }
}
