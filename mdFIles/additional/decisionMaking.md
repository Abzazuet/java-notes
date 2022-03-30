# Decision Making

- Have one or more conditions to be evaluated or tested by a program, along with a statement or statements that are to be executed if the condition is determined to be true.

## if...

- It consists of a boolean expression followed by one or more statements.

```Java
if(Boolean_expression) {
   // Statements will execute if the Boolean expression is true
}
```

```Java
public class Test {
   public static void main(String args[]) {
      int x = 10;
      if( x < 20 ) {
         System.out.print("This is if statement");
      }
   }
}
```

## if...else

```Java
if(Boolean_expression) {
   // Executes when the Boolean expression is true
}else {
   // Executes when the Boolean expression is false
}
```

```Java
public class Test {

   public static void main(String args[]) {
      int x = 30;

      if( x < 20 ) {
         System.out.print("This is if statement");
      }else {
         System.out.print("This is else statement");
      }
   }
}
```

## if..else if...else

```Java
if(Boolean_expression 1) {
   // Executes when the Boolean expression 1 is true
}else if(Boolean_expression 2) {
   // Executes when the Boolean expression 2 is true
}else if(Boolean_expression 3) {
   // Executes when the Boolean expression 3 is true
}else {
   // Executes when the none of the above condition is true.
}
```

```Java
public class Test {
   public static void main(String args[]) {
      int x = 30;

      if( x == 10 ) {
         System.out.print("Value of X is 10");
      }else if( x == 20 ) {
         System.out.print("Value of X is 20");
      }else if( x == 30 ) {
         System.out.print("Value of X is 30");
      }else {
         System.out.print("This is else statement");
      }
   }
}
```

## Nested if

```Java
if(Boolean_expression 1) {
   // Executes when the Boolean expression 1 is true
   if(Boolean_expression 2) {
      // Executes when the Boolean expression 2 is true
   }
}
```

```Java
public class Test {
   public static void main(String args[]) {
      int x = 30;
      int y = 10;

      if( x == 30 ) {
         if( y == 10 ) {
            System.out.print("X = 30 and Y = 10");
         }
      }
   }
}
```

## Switch Case

- Allows a variable to be tested for equality against a list of values.

- Each value is called a case, and the variable being switched on is checked for each case.

```Java
switch(expression) {
   case value :
      // Statements
      break; // optional

   case value :
      // Statements
      break; // optional

   // You can have any number of case statements.
   default : // Optional
      // Statements
}
```

### Rules

1. The variable in the switch statement can only be int, convertable int, strings and enums.
2. You can have as many case statements as you want. Each case is followed by the value to be compared to and a colon.
3. The value for a case must be the same data type as the variable in the switch and it must be a constant or a literal.
4. When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
5. When a break statement is reached, the switch terminates, and the flow of control jumps to the next line following the switch statement.
6. Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.
7. A switch statement can have an optional default case, which must appear at the end of the switch. The default case can be used for performing a task when none of the cases is true. No break is needed in the default case.

```Java
public class Test {

   public static void main(String args[]) {
      // char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
```
## The ? : operator
- `Exp1 ? Exp2 : Exp3;`
- To determine the value of the whole expression, initially Exp1 is evaluated.

    * If Exp1 is true, then the value of Exp2 will be the value of the whole expression.
    * If Exp1 is false, then Exp3 is evaluated and its value becomes the value of the entire expression.
