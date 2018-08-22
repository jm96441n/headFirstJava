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

# The "Simple Dot Com Game" a gentler introduction

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


