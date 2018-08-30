# Chapter 6. Get to know the Java API: Using the Java Library

- Java ships with hundreds of pre-built classes
  - no need to reinvent the wheel

## ArrayList
  - Part of the core Java Core Library
  - Array the expands and contracts as you add and remove items

  | Methods               |  Action                                                    |
  |-----------------------|------------------------------------------------------------|
  | add(Object elem)      | Adds the object parameter to the list                      |
  | remove(int index)     | Removes object at the index parameter                      |
  | remove(Object elem)   | Removes this object (if it's in the list)                  |
  | contains(Object elem) | Returns 'true' if there's a match for the object parameter |
  | isEmpty()             | Returns 'true' if the list has no elements                 |
  | indexOf(Object elem)  | Returns either index of the object parameter, or -1        |
  | size()                | Returns the number of elements                             |
  | get(int index)        | Returns the object currently at the index parameter        |


## Boolean Expressions

### 'And' and 'Or' Operators (&&, ||)

- If you want price between 300 _*and*_ 400:
```
if(price >= 300 && price < 400) {
  // do stuff
}
```

- If you want logic that only applies to some items:
```
if (brand.equals("A") || brand.equals("B")) {
  // do stuff here for only brand A or brand B
}
```

### Not equals (!= and !)

- For example, you have logic "of the ten available models, something is _true for all but one_"

```
if (model != 2000) {
  // do non-model 2000 stuff
}
```

- or for comparing objects like strings
```
if (!brand.equals("x")) {
  // do non-brancd X stuff
}
```

### Short Circuit Operators (&&, ||)

- `&&` and `||` are known as short circuit operators
  - if left side decides value right side is not evaluated:
  - `&&` expression:
    - if left side is `false` right side is not evaluated since `false && anything` is false
  - `||` expression:
    - if left side is `true` right side is not evaluated since `true || anything` is true

### Non Short Circuit Operators (&,|)

- When used in boolean expression the `&` and `|` function like their `&&` and `||` counterparts, except they always check both sides

- Typically `&` and `|` are used for bit manipulation


