# Chapter 7. Inheritance and Polymorphism: Better Living in Objectville

- *Plan your programs with the future in mind*

## Understanding Inheritance

- When you design with ingeirtance, you put comming code in a class and tell more specific classes that the common class is the super class

- *subclass extends the super class*

- methods can be overriden by the subclass

- ivars are not overidden because they don't have to be (don't describe behavior)

### An inheritance example

```
public class Doctor {
  boolean worksAtHospital;

  void treatPatient() {
    // performs checkup
  }
}
```
```
public class FamilyDoctor extends Doctor {
  boolean makesHouseCalls;

  void giveAdvice() {
    // give homespun advice
  }
}
```
```
public class Surgeon extends Doctor {
  void treatPatient() {
    // perform surgery
  }

  void makeIncision() {
    // make incision 
  }
}
```

## Let's design the inheritande tree for an Animal simulation program

- Asked to design a simulation program that let's the user throw a bunch of animals into an environment to see what happens

- Given list of _some_ of the animals that will be in it, but not all of them

- Each animal will be represented by an object

- _*We want other programmers to be able to add new kinds of animals to the program at any time*_

- First we have to figure out the common abstract characteristics all animals have
  
  1. Look for objects that have common behavior and attributes

### Using inheritance to avoid duplicating code in subclasses

- We have five ivars

  - *_picture_* - the filename representing the JPEG of this animal
  - *_food_* - the type of food this animal eats. Right now there can only be two values: _meat_ or _grass_
  - *_hunger_* - an int representing the hunger level of the animal. It changes depending on when (and how much) the animal eats
  - *_boundaries_* - values representing the height and width of the 'space' that the animals will roam around 
  - *_location_* - the X and Y coordinates for where the animal is in space

- We have four methods:
  - *_makeNoise()_* - behavior for when the animal is supposed to make noise
  - *_eat()_* - behavior for when the animal encounters its preferred food source, _meat_ or _grass_
  - *_sleep()_* - behavior for when the animal is considered asleep
  - *_roam()_* - behavior for when the animal is not eating or sleeping (probably just wandering around waiting to bump into a food source or boundary)

1. Design a class that represents the common state and behavior

  - *These objects are all animals, so we'll make a common superclass called Animal.*
  
  - *We'll put in methods and ivars that all animals might need*

### Do all animals eat the same way

- Assume that ivars will work for all animals

### Which methods should we override

- Does a lion make the sanme *noise* as a dog?

- Does a cat *eat* like a hippo?

- Eating and making noise should be Animal-type-specific

1. Decide if a subclass needs behaviors (method implementations) that are specific to that particular subclass type

### Looking for more inheritance opportunities

1. Look for more oppotunities to use abstraction, by finding two or more subclasses that might need common behavior

  - *We look at our classes and see that Wolf and Dog might some behavior in common, and the same goes for Lion, Tiger, and Cat*

2. Finish the class hierarchy
  
  - Since animals already have organizational hierarchy (kingdom, phylum, genus, etc..) we can use that for class design

  - We'll use the biological "families" to organize the animals (Feline class, etc.)

``` 
                          Animal
                   /        |        \
                  /         |         \
                 /          |          \
                /           |           \
               /            |            \
              /             |             \ 
             /              |              \
            /               |               \
           /                |                \
          /                 |                 \    
         /                  |                  \
        /                   |                   \
       /                    |                    \
      /                     |                     \    
    Feline                Canine                Hippo    
     / | \                /   \      
    /  |  \              /     \
   /   |   \            /       \
  /    |    \          /         \
 /     |     \        /           \
Cat  Lion  Tiger     Dog         Wolf
```

### Which method is called

| Animal      |
|-------------|
| makeNoise() |
| eat()       |
| sleep()     |
| roam()      |

     ^
     |

| Canine      |
|-------------|
| roam()      |
  
     ^
     |

| Wolf        |
|-------------|
| makeNoise() |
| eat()       |

```
Wolf w = new Wolf();

w.makeNoise(); // Calls version in Wolf

w.roam();  // Calls version in Canine

w.eat(); // Calls version in Wolf

w.sleep(); // Calls version in Animal
```

## Who gets the Porsche, who gets the porcelain?

- Four access levels (from most restrictive to least):
  1. private
  2. default
  3. protected
  4. public

- *Access level controls _who sees what_*

- public vs private

  - *public* members are inherited
  - *private* members are _not_ inherited

## Polymorphism

- When you declare a reference variable any object that passes the `IS-A?` test cna be assigned to that reference

- Ex:
```
Animal[] animals = new Animal[5];
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();

for (int i = 0; i < animals.length; i++) {
  animals[i].eat();

  animals[i].roam();
}
```

- You can also hae polymorphic arguments and return types

- Ex:

```
class Vet {
  public void giveShot(Animal a) {
    a.makeNoise();
  }
}
```

``` 
class PetOwner {
  public void start() {
    Vet v = new Vet();
    Dog d = new Dog();
    Hippo h = new Hippo();
    v.giveShot(d);
    v.giveShot(h);
  }
}
```

## Keeping the Contract: Rules for Overriding

- *The methods _are_ the conteract*

1. Arguments must be the same and return types must be compatible

2. The method can'tbe less accessible

## Overloading a method

- Having multiple versions of the same method with different argument lists

- Overloaded methods can have more flexibility than polymorphic methods

1. Return types can be different

2. You can't only change the return type --> must change argument list as well

3. You can vary the access levels in any direction


