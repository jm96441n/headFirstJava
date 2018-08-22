class Mix5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inner = 4; inner > 1; inner--) {
        x = x + 0;
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}

/*
1)
x = x + 3;

output:
54 6
__________
2)
x = x + 6;

output:
60 10

__________
3)
x = x + 2;

output:
45 6

__________
4)
x++;

output:
36 6

__________
5)
x--;

output:
18 6

__________
6)
x = x + 0;

output:
6 14
*/
