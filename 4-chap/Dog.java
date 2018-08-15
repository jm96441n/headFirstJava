class Dog {
  int size;
  String name;

  void setSize(int dogSize) {
    size = dogSize;
  }

  void setName(String dogName) {
    name = dogName;
  }

  void bark() {
    if (size > 60) {
      System.out.println("Woof! Woof!");
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }
  }
}
