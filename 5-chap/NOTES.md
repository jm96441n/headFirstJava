# Chapter 5. Writing a Program: Extra Strength Methods

- Build Battleship!
- Will occur over the course of two chapters

## Let's build a Battleship-style game: "Sink a Dot Com"

- No ships placed by player
- Goal is to sink all the computers ships in as few moves as possible

*Goal:* Sink all of the computer's Dot Coms in the fewest guesses. You're rated based on performance

*Setup:* When the game program is launched the computer places three Dot Com on a _virtual 7 x 7 grid_. Then the computer asks you for your first guess

*How you play:* We haven't learned to build a GUI yet, so this is command line. Computer will prompt you to enter a guess, in repsonse to guess you'll see either "Hit", "Miss", or "You sunk Pets.com". When you sink all dot coms, computer prints out your rating


## First a high level design

- General flow of the gme
  1. User starts game
    - Game creates 3 Dot Coms
    - Game places 3 Dot Coms onto virtual grid
  2. Gameplay begins, repeat following until game end:
    - Prompt user for a guess
    - Check user guess against Dot Coms to look for hit, miss or kill
    - If a hit delete cell
    - if a kill delete a dot com
  3. Game finishes, give user rating based on number of guesses

## The "Simple Dot Com Game" a gentler introduction

- Going to need at least two classes
  - Game class
  - Dot Com class
- Before building full game, we'll build a stripped down version
- 1 Dot Com, hidden in a single row
- game class has no ivars
- all game code in `main()` method

  1. *Game starts*, create ONE DotCom and give it location on three cells
  2. *Game play begins*, prompt user for a guess, check to see if it hit any of the DotCom's cells. If a hit, increment numOfHits variable
  3. *Game finishes* when all three cells have been hit (numOfHits variable is 3), tell user how many guesses it took

## More About For Loops

### Regular (non-enhanced) For Loops

```
for(int i = 0; i < 100; i++) { // do stuff }
```

- How the compiler sees it:
  - create a variable _i_ and set it to 0
  - repeat while _i_ is less than 100
  - at the end of each loop iteration, add 1 to _i_

- *Part One: _initialization_*
  - Use this part to declare and intitialize a variable to use within loop body
  - Most often use this as a counter

- *Part two: _boolean test_*
  - This is where the conditional test goes
  - must resolve to boolean value
  - you can have a test (like `x >= 4`) or method that returns boolean

- *Part three: _iteration expression_*
  - use this part to place one or more things you want to happen with each trip through the loop
  - this occurs at the _end_ of each loop


## The enhanced for loop
- Makes it easier to iterate through collections

```
//  el in array    array
for(String name : nameArray) { // do stuff }
```

- "For each element in nameArray, assign the element to the 'name' variable and run the body of the loop"

## Converting a String to an int

```
int guess = Integer.parseInt(stringGuess);
```

- Integer class
  - one of it's jobs is converting `String` (that represent a number) to `int`

## Casting primitives
Ex: `long` can be cast to `short` (but you might lose something in the process)

```
long = 42;
int x = y; // won't compile because long is larger than int
```

- `long` is larger than an `int`
- compiler can't be sure how large `long` is
- to force the compiler to jam `long` into `int` use the *cast* operator

```
long y = 42;        // so far so good
int x = (int) y;    // x = 42 cool!
```

- adding the cast tells compiler to take value of `y` and make it int sized and set `x` equal to what's left
- if `y` is larger than max value of `x`, what's left will be weird (but calculable) number

```
long = 40002;
// 40002 exceeds 16-bit limit of a short
short x = (short) y; // x now equals -25534
```

- floating point numbers will just drop numbers after decimal

```
float f = 3.14f;
int x = (int) f;    // x = 3
```

