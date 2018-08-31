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
