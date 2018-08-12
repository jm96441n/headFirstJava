```
Dog[] pets;

pets = new Dog[7];

pets[0] = new Dog();
pets[1] = new Dog();
```

1. What is the current value of pets[2]?
- null
2. What code would make pets[3] refer to one of the two existing Dog objects?
```
pets[3] = pets[0];
// OR
pets[3] = pets[1];
```
