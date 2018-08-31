public class Mixed2 {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A a2 = new C();

    // Sample code goes here
  }
}

/*

Code:
b.m1();
c.m2();
a.m3();

Output:
B's m1, A's m2, A's m3

Code:
c.m1();
c.m2();
c.m3();

Output:
B's m1, A's m2, C's m3 13

Code: 
a.m1();
b.m2();
c.m3();

Output
A's m1, A's m2, C's m3, 12

Code
a2.m1();
a2.m2();
a2.m3();

Output:
B's m1, A's m2, C's m3, 13
*/
