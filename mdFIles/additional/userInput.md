# Java User Input (Scanner)

- THe scanner class is used to get user input, and it is found in the `java.util` package.
- TO use this class, create an object of the class and use any of the available methods found in scanner.

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```

- If you enter the wrong input you will get an exception.
