# Constructor
* It initializes an object when it's created.
* It hass the same name as its class and is syntactically similar to a method.
* It has no explicit return type.
* The constructor is used to give initial values to the instance variables defined by the class, or to perform any other start-up procedures required to create fully formed object.
```JavaScript
class ClassName {
   ClassName() {
   }
}
```
## No argument Constructors
* Using these constructors the instance variables of a method will be initialized with fixed values for all objects.
```JavaScript
Public class MyClass {
   Int num;
   MyClass() {
      num = 100;
   }
}
//Initialize object
public class ConsDemo {
   public static void main(String args[]) {
      MyClass t1 = new MyClass();
      MyClass t2 = new MyClass();
      System.out.println(t1.num + " " + t2.num);
   }
}
```
## Parameterized constructors
* Parameters are added to a constructor in the same way that theu are addedd to a method, just declare them inside the parentheses after the constructor's name.
```JavaScript
// A simple constructor.
class MyClass {
   int x;
   // Following is the constructor
   MyClass(int i ) {
      x = i;
   }
}
```
```JavaScript
public class ConsDemo {
   public static void main(String args[]) {
      MyClass t1 = new MyClass( 10 );
      MyClass t2 = new MyClass( 20 );
      System.out.println(t1.x + " " + t2.x);
   }
}
```
