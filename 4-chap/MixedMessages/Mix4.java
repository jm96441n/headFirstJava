public class Mix4 {
  int counter = 0;
  public static void main(String[] args) {
    int count = 0;
    Mix4 [] m4a = new Mix4[20];
    int x = 0;
    while( ________ ) {
      m4a[x] = new Mix4();
      m4a[x].counter = count + 1;
      count = count + 1;
      count = count + m4a[x].maybeNew(x);
      x = x + 1;
    }
    System.out.println(count + " " + m4a[1].counter);
  }

  public int maybeNew(int index) {
    if ( __________ ) {
      Mix4 m4 = new Mix4();
      m4.counter = m4.counter + 1;
      return 1;
    }
    return 0;
  }
}


/*
1)
x < 9
index < 5

returns:
14 1
__________
2)
x < 20
index < 5


returns:
25 1

_________
3)
x < 7
index < 7

returns:
14 1

___________
4)
x < 19
index < 1

returns:
20 1
*/
