# Java date and time

- Jva does not have a built-in Date class, but we can import the `java.time` package to work with the date and time API.
- This package includes many date and time classes.
- To display the current date, import the
  `java.time.LocalDate` class and use its `now()` method.

```java
import java.time.LocalDate; // import the LocalDate class

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
```
## Formatting date and time

- You can use the DateTimeFormatter class with the `ofPattern()` method in the same package to format or parse date-time objects 
```java
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
```
