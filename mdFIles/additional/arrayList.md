# ArrayList
- Resizable array
- found in `java.util` package.
- The main difference between an arraylist and an array is that the size of the array cannot be modified. The length of an arrayList can dynamically change.
## Creating ArrayList
```JAVA
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```
## Add items
- use the `.add()` method
```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```
## Access an item
- use the `.get()` method
``` java
cars.get(0);
```
## Change an item
- use the `.set(index, value)` method
```java
cars.set(0, "Opel");
```
## Remove an item
- use the `.remove(index)` method
```java
cars.remove(0);
```
## Delete all elements
- use the `.clear()` method
```java
cars.clear();
```
## Get number of elements
- use the `.size()` method
```java
cars.size();
```

## Sort an arraylist
- import java.util.Collections;  // Import the Collections class
- `Collections.sort(object)` -> mutates the object into a sorted one
