// will compile, won't run due to z being put out of range of the length of the array.
// Fix this by making the conditional on line 17 to "z < 3"
// and by moving line 19 to line 29

class Hobbits {


  String name;


  public static void main(String[] args) {


    Hobbits [] h = new Hobbits[3];
    int z = 0;


    while (z < 4) {
      z = z + 1;
      h[z] = new Hobbits();
      h[z].name = "bilbo";
      if (z == 1) {
        h[z].name = "frodo";
      }
      if (z == 2) {
        h[z].name = "sam";
      }
      System.out.print(h[z].name + " is a ");
      System.out.println("good Hobbit name");
    }
  }
}
