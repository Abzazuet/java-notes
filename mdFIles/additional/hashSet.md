# HashSet

- Collection of items where every item is unique
- found in the `java.util`

## Create

```java
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();
```

## Add

- `add()`

```java
// Import the HashSet class
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

## Check if an item exists

- `.contains("element")`

## Removing

- `.remove("element")`

## Clear

- `.clear()`

## Size

- `.size()`
