class PassByValue {
  void go(int z) {
    z = z + 4;
    System.out.println("z is now: " + z);
  }

  public static void main(String[] args) {
    int x  = 5;
    System.out.println("Before running method x is: " +  x);

    PassByValue foo = new PassByValue();
    foo.go(x);

    System.out.println("After method x is: " + x);
  }
}
