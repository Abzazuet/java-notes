# Object-Oriented Concepts
* Polymorphism
* Inheritace
* Encapsulation 
* Abstraction
* Classes
* Objects
* Instance
* Method
* Message passing
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
* A template/blueprint that describes the behavior/state that the object of its type support.
* A class may contain any of the following variable types: 
### Local variables
* Variables defined inside methods, constructors or blocks.
* The variable will be declared, initialized within the method and the variable will be destroyed when the method has completed.
### Instance varables
* Variables within a class but outside any method.
* This variables are initialized when the class is instantiated.
* Instance variables can be accessed from inside any method, contructor or blocks of that particular class.
### Class variables
* Variables declared within a class, outside any method.
* They use the static keyword.
## Constructors
```JAVA
public class Puppy {
   public Puppy() {
   }

   public Puppy(String name) {
      // This constructor has one parameter, name.
   }
}
```
* Every class has one, even if we don't declare it, Java compiler builds one for that class.
* Each time a new object is created, at least one constructor will be invoked.
* The main rule of constructors is that they have the same name as the class.
* A class can have more than one constructor.
* Java also has singleton classes, this means you can only create one instance of a class.
## Object
* An instance of a class.
* They have states and behaviors.
* An object state is stored in fields. 
* An object behavior is shown via methods.
* Methods operate on the internal state of an object and the object-to-object communication is done via methods.
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
* The *new* keyword is used to create a new Object.
1. Declaration: A variable declaration with a variable name with an object type.
2. Instantiation: The *new* keyword is used to create an object.
3. Initialization: The *new* keyword is followed by a call to a constructor. This call initializes the new object.
### Accessing Instance Variables and Methods
```JAVA
/* First create an object */
ObjectReference = new Constructor();

/* Now call a variable as follows */
ObjectReference.variableName;

/* Now you can call a class method as follows */
ObjectReference.MethodName();
```
* Instance variables and methods are accessed via creating objects.
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
