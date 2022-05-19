# Object-Oriented Concepts

- Polymorphism
- Inheritace: using the keyword extends to inherit from a class
- Encapsulation: declaring variables as private.
- Abstraction:
- Classes: the blueprint
- Objects: an instance of a class
- Method
- Message passing

## Class

```JAVA
public class Dog {
   String breed;
   int age;
   String color;

   void barking() {
   }

   void hungry() {
   }

   void sleeping() {
   }
}
```

- A template/blueprint that describes the behavior/state that the object of its type support.
- A class may contain any of the following variable types:

### Local variables

- Variables defined inside methods, constructors or blocks.
- The variable will be declared, initialized within the method and the variable will be destroyed when the method has completed.

### Instance varables

- Variables within a class but outside any method.
- This variables are initialized when the class is instantiated.
- Instance variables can be accessed from inside any method, contructor or blocks of that particular class.

### Class variables

- Variables declared within a class, outside any method.
- They use the static keyword.

### Inner classes

- The purpose of nesting classes is to group classes that belong together, which makes your code more readable and maintainable.
- TO access an inncer class, create an object of the outer class, and then create an object for the inner class.
- They can access attributes and methods of the outer class.

```JAVA
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

```

#### Private inner classes

- Do this when you do not want outside objects to access the inner class, declare the class as private.

#### Static inner classes

- You can access it without creating an object of the outer class.

```java
OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y);

```

## Constructors

```JAVA
public class Puppy {
   public Puppy() {
   }

   public Puppy(String name) {
      // This constructor has one parameter, nMy main goal is create software's ame.
   }
}
```

- Every class has one, even if we don't declare it, Java compiler builds one for that class.
- Each time a new object is created, at least one constructor will be invoked.
- The main rule of constructors is that they have the same name as the class.
- A class can have more than one constructor.
- Java also has singleton classes, this means you can only create one instance of a class.

## Object

- An instance of a class.
- They have states and behaviors.
- An object state is stored in fields.
- An object behavior is shown via methods.
- Methods operate on the internal state of an object and the object-to-object communication is done via methods.

### Creating an object

```JAVA
public class Puppy {
   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
   }
   public static void main(String []args) {
      // Following statement would create an object myPuppy
      Puppy myPuppy = new Puppy( "tommy" );
   }
}
```

- The _new_ keyword is used to create a new Object.

1. Declaration: A variable declaration with a variable name with an object type.
2. Instantiation: The _new_ keyword is used to create an object.
3. Initialization: The _new_ keyword is followed by a call to a constructor. This call initializes the new object.

### Accessing Instance Variables and Methods

```JAVA
/* First create an object */
ObjectReference = new Constructor();

/* Now call a variable as follows */
ObjectReference.variableName;

/* Now you can call a class method as follows */
ObjectReference.MethodName();
```

- Instance variables and methods are accessed via creating objects.

```JAVA
public class Puppy {
   int puppyAge;
   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }
   public void setAge( int age ) {
      puppyAge = age;
   }
   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }
   public static void main(String []args) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );
      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );
      /* Call another class method to get puppy's age */
      myPuppy.getAge( );
      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}
```

## Encapstulation

- Making sure certain data is hidden from users.

### Encapsulating

- Dclare fields as private
- Provide public get and set methods to access and update the value of a private variable

## Inheritance

- `class SubClass extends SuperClass`
- If you use the `final` keyword, the class would not be able to be inherited.
- a class can only inherit from one class

## Polymorphism

- It occurs when we have many classes that are related to each other by inheritance.
- For example we can create a class ANimal with certaing properties and inherited it to different class such as dog, cat, and change their fields.
- This provides reusing attributes and methods of the superclass

## Abstraction

- Process of hiding certain details and showing only essential information to the user.
- It can be achieved with either abstract classes or interfaces
- They are used to achieve security, hiding certain details and only show the important details of an object

### Abstract class

- Restricted class that cannot be used to create objects, to access it, it must be inherited.

### Abstract method

- It can only be used in an abstract class and it does not ave a body. The body is provided by the subclass.

```java
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

## Interfaces

- Another way to achieve abstraction
- It is a completely abstract class that is used to group related methods with empty bodies
- To access the interface it must be implemented by another word with the `implements` keyword.
- The body of the interface method is provided by the implement class

```java
// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
```

- They cannot be used to create objects
- On the implementation you must override all of its methods
- Methods are abstract and public
- Attributes are public, static and final
- It cannot contain a constructor
- A class can implement numerous interfaces, just separate them with a comma

```java
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}
```
