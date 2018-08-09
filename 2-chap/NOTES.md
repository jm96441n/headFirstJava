# Chapter 2. Classes and Objects: A Trip to Objectville


### When you design a class, think about the objects that will be created from that class type:
- things the object knows
- things the object does

Things an object knows about itself == instance variables

Things an object can do == methods

**Instance Variables**: represent an object's state, unique values for each object of that type

**Methods**: represent what an object can do, can operate based on data or operate to change data

## The Dot Operator (.)

- The dot operator `.` gives you access to an object's state and behavior
```
// make a new object

Dog d = new Dog();

// tell it to bark by using the
// dot operator on the
// variable d to call bark()

d.bark();

// set its size using the
// dot operator

d.size = 40;
```

- 2 classes necessary to create and use an object

  1) Class for the type of object
  2) Test class to test the new object

- the _tester_ class will have the main method

  - main method here is to create and access object from new class

  - tests methods and variables of new class


### Example
Dog.java
```
class Dog {
  int size;
  String breed;
  String name;

  void bark() {
    System.out.println("Ruff! Ruff!);
  }
}
```

DogTestDrive.java
```
class DogTestDrive {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.size = 40;
    d.bark();
  }
}
```

## Making and Testing Movie Objects

Movie.java
```
class Movie {
  String title;
  String genre;
  int rating;

  void playIt() {
    System.out.println("Playing the movie");
  }
}
```

MovieTestDrive.java
```
public class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Gone with the Stock";
    one.genre = "Tragic";
    one.rating = -2;

    Movie two = new Movie;
    two.title = "Lost in Cubicle Space";
    two.genre = "Comedy";
    two.rating = 5;
    two.playIt();

    Movie three = new Movie();
    three.title = "Byte Club";
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;
  }
}
```

### Sharpen Your Pencil

Using classes from last exercise, fill in values for each object created


| Object 1  |                     |
|-----------|---------------------|
|title      | Gone with the Stock |
|genre      | Tragic              |
|rating     | -2                  |

| Object 2  |                       |
|-----------|-----------------------|
|title      | Lost in Cubicle Space |
|genre      | Comedy                |
|rating     | 5                     |

| Object 3  |                                 |
|-----------|---------------------------------|
|title      | Byte Club                       |
|genre      | Tragic but ultimately uplifting |
|rating     | 127                             |

### Quick! Get out of main!

Two uses of main:

1. Test your real class
2. To launch/start your Java application

### The Guessing Game

**Summary:**

  1. 1 Game object
  2. 3 player objects
  3. game generates a random number 0-9
  4. thre player objects try to guess it

See accompanying files for implementation

