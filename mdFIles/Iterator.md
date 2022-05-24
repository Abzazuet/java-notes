# Iterator

- It's an object that can be used to loop through collections, like ArrayList and HashSet
- Its called iterator because iterating is the technical term for looping
- `java.util`

## Getting an iterator

- THe iterator() can be used to get an iterator for any collection

```java
// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}
```

## Looping through a collection

- To loop through it, use the `hasNext()` and `next()` method

```java
while(it.hasNext()) {
  System.out.println(it.next());
}
```

## Removing items from a collection

- `remove()` can remove items from a collection while looping

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}
```

- Trying to remove items using a for loop or a for each would not work correctly because the collection is changing size at the same time that the code is trying to loop
