# HashMap

- It sotres items in a key/value pair.
- These elements can be accessed by an index of another type.
- One object is used as a key (index) to another object (value).
- This type is included in the `java.util`
- Very useful to save keys that map to an array

## Create a hashmap

```java
import java.util.HashMap; // import the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();
```

## Adding elements to it

- `put()` method

```java
// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```

## Access an item

- `get()` method

```java
capitalCities.get("England");
```

## Remove an item

- `.remove()` method

```java
capitalCities.remove("England");
```

## Remove everything

- `clear()`

```java
capitalCities.clear();
```

## Found out the size

- `size()`

```java
capitalCities.size();
```

## Loop through it

- `.keySet()` returns the keys
- `.values()` returns the values

```java
// Print keys
for (String i : capitalCities.keySet()) {
  System.out.println(i);
}
```
