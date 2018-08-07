# Chapter 1. Dve in a Quick Dip: Breaking the surface

## The Way Java Works
  1. Create source doc (`.java`) file
  2. Run through compiler
  3. Compiler outputs bytecode
  4. Runs on java virtual machine (JVM)


## Sharpen your Pencil
|   Code                                   | Meaning                                                                                           |
|------------------------------------------|---------------------------------------------------------------------------------------------------|
|`int size = 27;`                          |declare an integer variable named "size" with the value of 27                                      |
|`String name = "Fido";`                   |declare string variable named "name" with a value of "Fido"                                        |
|`Dog myDog = new Dog(name, size);`        |instantiate a new dog object using the variables name and size                                     |
|`x = size - 5;`                           |declare integer variable named "x" with a value that is 5 less than the size variable              |
|`if (x < 15) myDog.bark(8);`              |if the value of x is less than 15 than call bark on myDog with an arg of 8                         |
|`while (x > 3) { myDog.play();}`          |while the x variable is less than 3 call .play() on myDog object                                   |
|`int[] numList = [2,4,6,8];`              |declares an array of integers named numList and assigns it the value of [2,4,6,8]                  |
|`System.out.print("Hello");`              |prints out "Hello" to the terminal                                                                 |
|`System.out.print("Dog: " + name);`       |prints out "Dog: Fido" to the terminal by concatenating the name variable to the string provided   |
|`String num = "8";`                       |declare an string variable named "num" with value "8"                                              |
|`int z = Integer.parseInt(num);`          |decalares an integer variable "z" that is the integer value of "num"                               |
|`try {`                                   |opening bracket for a try block, which will raise exception in catch block if an error occurs in it|
|  `readTheFile(myFile.txt); }`            |method to read a specific file                                                                     |
|`}`                                       |ending brackets for try block                                                                      |
|`catch(FileNotFoundException ex) {`       |opening of catch block in case error occurs in try block                                           |
|   `System.out.print("File not Found.");` |the action taken by the catch block, here prints "File not Found." to terminal                     |
|`}`                                       |closing bracket of catch block                                                                     |

## Code Structure in Java

Source File > Class (in source file) > Methods (in class) > Statements (in a method)

## Anatomy of a Class

- When JVM starts running it looks for the class given at the command line

  - looks for and runs everything in:
     ```
      public static void main (String[]  args) {
        // your code lives here
      }
      ```
- `.java` files compile into `.class` files

## Syntax Fun

- Each statement must end in a semicolon

  `x = x + 1;`

- A single line comment begins with two forward slashes

  `//x = 22;`

- Most white space doesn't matter

  `x      =      3;`

- Variables are declared with a **name** and a **type**

  `int weight; // type: int, name: weight`

- Classes and methods must be defined within a pair of curly braces

  ```
    public void go() {
      // amazing code here
    }
  ```

## Looping and looping and...

- 3 standard looping constructs:
  1. *while*
  2. *do-while*
  3. *for*

## System.out.print vs System.out.println

- System.out.*_println_* will print statements onto newlines
- System.out.*_print_* will print everything onto the same line




