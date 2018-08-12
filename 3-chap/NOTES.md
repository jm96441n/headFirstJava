# Chapter 3. Primitives and References: Know Your Variables

- Two types of variables:
1. Primitive
2. Reference


## Declaring a variable

- Java cares about type

  - Variable must always match type defined when variable is declared

- _Primitive_ vs. _Object Reference_

  - Primitives hold fundamental values

    - Ex: Integers, booelans, floating point numbers, etc.

  - Object references hold references to objects

## Primitive Types

### boolean and char
| Type    | Bit Depth      | Value Range       |
|---------|----------------|-------------------|
| boolean | (JVM Specific) | _true_ or _false_ |
| char    | 16 bits        | 0 to 65535        |

### numeric (all are signed)

### _integer_
| Type  | Bit Depth  | Value Range               |
|-------|------------|---------------------------|
| byte  | 8 bits     | -128 to 127               |
| short | 16 bits    | -32768 to 32767           |
| int   | 32 bits    | -2147483648 to 2147483647 |
| 64    | bits       | -huge to huge             |

### _floating point_
| Type   | Bit Depth  | Value Range |
|--------|------------|-------------|
| float  | 32 bits    | varies      |
| double | 64 bits    | varies      |


### Primitive declarations with assignments

```
int x;

byte b = 234;

boolean isFun = true;

double d = 3456.98;

char c = 'f';

int z = x;

boolea isPunkRock;

isPunkRock = false;

boolean powerOn;

powerOn = fun;

long big = 3456789;

float f = 32.5f;

```
*_note:_* The `f` on the end of the float, Java will think anything with a floating point is a double unless you use the `f`


## You really don't want to spill that....
*Be sure the value can fit into the variable*

- You can't put a larger value into a smaller variable

- Example: you can't put int-size stuff into a byte-sized container
```
int x = 24;
byte b = x;
// won't work!!
```

- Why won't this work?

  - x == 24, which should fit into a byte
  - compiler cares about possible sizes of the type
  - possibility that `int` can be larger than `byte` can hold

- **You can assign a value to a variable in one of several ways including:**
  - type a _literal_ value after the equals sign
    - `int x = 12;`
    - `booelan isGood = true;`
  - assign value of one variable to another
    - `char x = y;`
  - use an expression combining the two
    - `int x = y + 43;`


## Back away from that keyword!

_What can you use as names?_

- Rules for naming classes/variables
  - It must start with a letter, underscore(_), or dollar sign ($). You cannot start a name with a number
  - After the first character you can use numbers, just not at beginning
  - Cannot be one of Java's reserved words
    - Eg: `public`, `static`, `main`, `String`, `boolean`, etc.

## Make it Stick

_The Eight Primitive Types are:_
1. boolean
2. char
3. byte
4. short
5. int
6. long
7. float
8. double

## Controlling your Dog object

_Declaring non-primitive variables_

- There is actually no such thing as an object variable
- Only an object reference variable (ORV)
- ORV holds bits that represent a way to access an object
- Doesn't hold the object itself, holds something like a pointer/address
  - Java doesn't know what is inside a reference variable.
  - Knows it represents one and only one object
  - JVM knows how to use the reference to get the object


## Life on the garbage-collection heap

Declare two Book reference variables

Create two new Book objects

Assign the Book objects to the reference variables

The two book objects are now living on the heap

References: 2

Objects: 2
```
Book b = new Book();

Book c = new Book();
```


Declare new Book reference variable

Don't create new Book object, assign value of variable `c` to variable `d`

_Both **c** and **d** refer to the same object_

References: 3

Objects: 2
```
Book d = c;
```

Assign the value of variable `b` to variable `c`

Now both `b` and `c` refer to the same object

Objects: 2

References: 3
```
b = c;
```

## Life and death on the heap

Declare two Book reference variables

Create two new Book objects

Assign the Book objects to the reference variables

Two book objects now live on the heap

Active References: 2

Reachable Objects: 2
```
Book b = new Book();

Book c = new Book();
```


Assign the value of variable `c` to variable `b`

**Both _b_ and _c_ refer to the same object. Object 1 is abandoned and eligible for Garbage Collection (GC)**

The first object that `b` referenced has no more references, it's unreachable

Active References: 2

Reachable Objects: 1

Abandoned Objects: 1
```
b = c;
```

Assign the value `null` to variable `c`.

Makes `c` a _null reference_ (meaning it does not refer to anything)

Still a reference variable and another Book object can be assigned to it

**Object 2 still has an active reference (b). As long as it does it is not eligible for GC**

Active References: 1

_null_ References: 1

Reachable Objects: 1

Abandoned Objects: 1
```
c = null;
```

## An array is like a tray of cups
1. Declare an int array variable
```
int[] nums;
```
2. Create a new int array with a length of 7, assign it to previously declared `int[]` variable `nums`
```
nums = new int[7];
```
3. Give each element in the array an int value.
```
// 7 int variables
nums[0] = 6;
nums[1] = 10;
nums[2] = 44;
nums[3] = 32;
nums[4] = 20;
nums[5] = 19;
nums[6] = 1;
nums[7] = 42;
```

## Java cares about type

- Once you've declared an array, you can't put anything in it except things of the declared array type

- Cannot put a Cat into a Dog array

- Cannot put a `double` into an `int` array

- Can put a `byte` into an `int` array
  - `byte` will always fit into an `int` sized variable
  - known as _Implicit Widening_

## Control your Dog (with a reference variable)
```
// Dog class
class Dog {
  String name;

  void bark() {
    // do stuff here
  }

  void eat() {
    // do stuff ehre
  }

  void chaseCat() {
    // do stuff here
  }
}
```

```
Dog fido = new Dog();
fido.name = "Fido";
```
Created a Dog object and used dot operator on reference variable `fido` to access the name variable

We can use the `fido` reference to get the dog to `bark()` or `eat()` or `chaseCat()`

```
fido.bark();
fido.chaseCat();
fido.eat();
```

### What happens if the Dog is in a Dog array

When the Dog is in an array, we don't have a variable name

Instead use array notation and use dot notation on object at particular index

```
Dog[] myDogs = new Dog[3];

myDogs[0] = new Dog();

myDogs[0].name = 'fido';

myDogs[0].bark();
```


