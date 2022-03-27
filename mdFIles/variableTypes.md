# Variable Types 
* A variable provides us with named storage that our programs can manipulate.
* Each variable in Java has a specific type, which determines the size and layout of the variable's memory.
* It also defines the set of operations that can be applied to that variable.
**You must declare every variable before it's used.**

* Examples 
```Java
int a, b, c;         // Declares three ints, a, b, and c.
int a = 10, b = 10;  // Example of initialization
byte B = 22;         // initializes a byte type variable B.
double pi = 3.14159; // declares and assigns a value of PI.
char a = 'a';        // the char variable a iis initialized with value 'a'
```
## Local Variables
* These are declared in methods, constructors or blocks.
* They are created when a method, constructor or block is entered and the variable will be destroyed at the end of it.
* Access modifiers cannot be used for local variables.
* They are only visible within that method, constructor or block.
* They are implemented at stack level internally.
* They have no default value, so they should be declared and assign an inital value before they are used.
``` Java
public class Test {
   public void pupAge() {
      int age = 0; // Local Variable
      age = age + 7;
      System.out.println("Puppy age is : " + age);
   }

   public static void main(String args[]) {
      Test test = new Test();
      test.pupAge();
   }
}
```
## Instance Variables
* Declared inside a class, but outside method, constructor or any block.
* When a space is allocated for an object in the heap, a slot for each instance variable value is created.
* They are created with the use of the keyword ***new*** and destroyed when the object is destroyed.
* They hold values that must be referenced by more than one method at essentials parts of an object state.
* They can be declared in class level before or after use.
* Access modifiers can be given for instance variables.
* They are visible for all Me, Con or Bl in the class.
* It is recommended to make this variables private (access level).
* They have default values.
* They can be accessed by calling the variable name inside the class.
```Java
public class Employee {

   // this instance variable is visible for any child class.
   public String name;

   // salary  variable is visible in Employee class only.
   private double salary;

   // The name variable is assigned in the constructor.
   public Employee (String empName) {
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
      Employee empOne = new Employee("Ransika");
      empOne.setSalary(1000);
      empOne.printEmp();
   }
}
```
## Class/Static Variables
* They are declared with the static keyword in a class, but outside a MeConBlo.
* There would only be one copy of each class variable per class, regardless of how many objects are created from it.
* Rarely used other than being declared as constants. Declared as public/private, final and static. They don't change their initial value.
* Stored in static memory.
* Created when the program starts and destroyed when the program stops.
* They have default values.
* They can be accessed ClassName.VariableName.
* When declaring class variables as public static final, then variable names are all in upper case.
* If they are not public and final, the naming syntax is the same as instance and local variables.
```Java
public class Employee {

   // salary  variable is a private static variable
   private static double salary;

   // DEPARTMENT is a constant
   public static final String DEPARTMENT = "Development ";

   public static void main(String args[]) {
      salary = 1000;
      System.out.println(DEPARTMENT + "average salary:" + salary);
   }
}
```
