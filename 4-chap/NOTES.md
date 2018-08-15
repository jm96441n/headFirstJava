# Chapter 4. Methods Use Instance Variables: How Objects Behave

### Class describes what an object knows and what an object does

- Think of it like a blueprint for an object

- Different objects of the same class can have different values for IVars

- Methods are always the same, but can behave differently depending on values of IVars

Ex:
```
class Song {
  String title;
  String artist;

  void play() {
    soundPlayer.playSound(title);
  }
}


class SongTestDrive {
  public static void main(String[] args) {
    // Different song played based on value of title
    Song t2 = new Song();
    t2.setArtist("Travis");
    t2.setTitle("Sing");

    Song t3 = new Song();
    t3.setArtist("Sex Pistols");
    t3.setTitle("My Way");
  }
}
```

```
class Dog {
  int size;
  String name;

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

// Different barks based on size ivar
class DogTestDrive {
  public static void main(String[] args) {
    Dog one = new Dog();
    one.size = 70;

    Dog two = new Dog();
    two.size = 8;

    Dog three = new Dog();
    three.size = 35;

    one.bark();
    two.bark();
    three.bark();
  }
}
```

- Method uses parameters. Caller passes arugments
  - Arguments are actual values supplied to the method
  - Parameters are local variables within a method
  - If a method takes a parameter, you must pass it an argument when calling

## You can get things _back_ from a method

- Methods can return values

- Every method is declared with a return type

- `void` specifies nothing is returned

Ex:

```
int giveSecret() {
  return 42;
}
```

- if you declare a method to return a value, must return value of declared type

## Java is pass-by-value (AKA pass-by-copy)

1. Declare an int variable and assign it `7`. The bit pattern for 7 goes into variable named `x`

```
int x = 7;
```

2. Declare a method with an int parameter named `z`

```
void go(int z) {

}
```

3. Call the `go()` method, passing the variable `x` as the argument, The bits in `x` are copied and the copy lands in `z`

4. Change value of `z` inside the method. The value of `x` does not change (see example on Github [here](https://github.com/jm96441n/headFirstJava/blob/master/4-chap/PassByValue.java))

## Cool things you can do with parameters and return types

**Getters** and **Setters** (AKA *_Accessors_* and *_Mutators_*)

- Getters: return the value of an ivar for an object
- Setters: set the value of an ivar for an object

Ex:
```
class ElectricGuitar {
  String brand;
  int numOfPickups;
  boolean rockStarUsesIt;

  String getBrand() {
    return brand;
  }

  void setBrand(String aBrand) {
    brand = aBrand;
  }

  int getNumOfPickups() {
    return numOfPickups;
  }

  void setNumOfPickups(int num) {
    numOfPickups = num;
  }

  booelan getRockStarUsesIt() {
    return rockStarUsesIt;
  }

  void setRockStarUsesIt(boolean yesOrNo) {
    rockStarUsesIt = yesOrNo;
  }
}
```

## Encapsulation: Do it or risk humiliation and ridicule
