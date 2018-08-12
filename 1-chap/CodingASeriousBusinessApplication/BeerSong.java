// my way
// public class BeerSong {

//   public static void multipleBottles(int bottleCount, int bottlesLeft) {
//     System.out.println(bottleCount + " bottles of beer on the wall " + bottleCount + " bottles of beer,");
//     System.out.println("take one down pass it around " + bottlesLeft + " bottles of beer on the wall!");
//   }

//   public static void main(String[] args) {
//     int bottles = 99;
//     while (bottles >= 0) {
//       int bottlesLeft = bottles - 1;
//       if (bottles > 2) {
//         multipleBottles(bottles, bottlesLeft);
//       } else if(bottles == 2) {
//         System.out.println(bottles + " bottles of beer on the wall " + bottles + " bottles of beer,");
//         System.out.println("take one down pass it around" + bottlesLeft + " bottle of beer on the wall!");
//       } else if(bottles == 1) {
//         System.out.println(bottles + " bottles of beer on the wall " + bottles + " bottles of beer,");
//         System.out.println("take one down pass it around no more bottles of beer on the wall!");
//       } else {
//         System.out.println("No bottles of beer on the wall, no more bottles of beer");
//         System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
//       }
//       System.out.print("\n");
//       bottles = bottlesLeft;
//     }
//   }
// }

// books way
public class BeerSong {
  public static void main (String[] args) {
    int beerNum = 99;
    String word = "bottles";

    while (beerNum > 0) {
      if (beerNum == 1) {
        word = "bottle";
      }

      System.out.println(beerNum + " " + word + " of beer on the wall");
      System.out.println(beerNum + " " + word + " of beer on the beer.");
      System.out.println("Take one down.");
      System.out.println("Pass it around.");
      beerNum = beerNum - 1;

      if (beerNum > 0) {
        System.out.println(beerNum + " " + word + " of beer on the wall");
      } else {
        System.out.println("No more bottles of beer on the wall");
      }
    }
  }
}
