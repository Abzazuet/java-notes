# Number

- Number is the abstract class, and all the wrapper classes (int, long, byte, ...) are subclasses of Numner.
- The number class is part of the java.lang package.

## Boxing

- Converting primitive data types into object.
- While using a wrapper class you just need to pass the value of the primitive data type to the constructor of the wrapper class.

## Unboxing

- The Wrapper object will be converted back to a primitive data type.

## Methods

1. xxxValue(): converts the value of _this_ Number object to the xxx data type and returns it.

```Java
public class Test {

   public static void main(String args[]) {
      Integer x = 5;

      // Returns byte primitive data type
      System.out.println( x.byteValue() );

      // Returns double primitive data type
      System.out.println(x.doubleValue());

      // Returns long primitive data type
      System.out.println( x.longValue() );
   }
}
```

2. compareTo(): compares _this_ Number object to the argument.

   - Two different types cannot be compared, both the argument and the Number object invoking the method should be of the same type.

   ```Java
   public class Test {

    public static void main(String args[]) {
        Integer x = 5;

        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));
    }
   }
   ```

   - Returns 0: the values are equal.
   - Return 1: the integer is greater than the argument.
   - Return -1: the integer is less than the argument.

3. equals(): determines whether _this_ number object is equal to the argument.

```Java
public class Test {

   public static void main(String args[]) {
      Integer x = 5;
      Integer y = 10;
      Integer z =5;
      Short a = 5;

      System.out.println(x.equals(y));
      System.out.println(x.equals(z));
      System.out.println(x.equals(a));
   }
}
```

- True: if the argument is not null and is an object of the same type and with the same numeric value.

4. valueOf(): it returns the relevant Number Object holding the value of the argument passed.

```Java
public class Test {

   public static void main(String args[]) {
      Integer x =Integer.valueOf(9);
      Double c = Double.valueOf(5);
      Float a = Float.valueOf("80");
      Integer b = Integer.valueOf("444",16);

      System.out.println(x);
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
   }
}
```

- valueOf(String s, int radix): returns an Integer Object holding the integer value of the specified string representation, parsed with the value of radix.

5. toString(): used to get a String object representing the value of the Number Object.

```Java
public class Test {

   public static void main(String args[]) {
      Integer x = 5;

      System.out.println(x.toString());
      System.out.println(Integer.toString(12));
   }
}
```

6. parseInt(): used to get the primitive data type of a certain string.

```Java
public class Test {

   public static void main(String args[]) {
      int x =Integer.parseInt("9");
      double c = Double.parseDouble("5");
      int b = Integer.parseInt("444",16);

      System.out.println(x);
      System.out.println(c);
      System.out.println(b);
   }
}
```

7. abs(): returns the absolute value of the argument.

```Java
public class Test {

   public static void main(String args[]) {
      Integer a = -8;
      double d = -100;
      float f = -90;

      System.out.println(Math.abs(a));
      System.out.println(Math.abs(d));
      System.out.println(Math.abs(f));
   }
}
```

8. ceil(): it gives the smallest integer that is greater than or equal to the argument.

```Java
public class Test {
   public static void main(String args[]) {
      double d = -100.675;
      float f = -90;
      System.out.println(Math.ceil(d));
      System.out.println(Math.ceil(f));
   }
}
```

9. floor(): it gives the largest integer that is less than or equal to the argument.

```Java
public class Test {
   public static void main(String args[]) {
      double d = -100.675;
      float f = -90;
      System.out.println(Math.floor(d));
      System.out.println(Math.floor(f));
   }
}
```

10. rint(): return the integer closest in value to the argument.

```Java
public class Test {

   public static void main(String args[]) {
      double d = 100.675;
      double e = 100.500;
      double f = 100.200;

      System.out.println(Math.rint(d));
      System.out.println(Math.rint(e));
      System.out.println(Math.rint(f));
   }
}
```

11. round(): Returns the closest long or int, as indicated by the method's return type to the argument.
12. min(): Returns the smaller of the two arguments.
13. max(): Returns the larger of the two arguments.
14. exp(): Returns the base of the natural logarithms, e, to the power of the argument.

```Java
public class Test {

   public static void main(String args[]) {
      double x = 11.635;
      double y = 2.76;

      System.out.printf("The value of e is %.4f%n", Math.E);
      System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(x));
   }
}
```

15. log(): Returns the natural logarithm of the argument.
16. pow(): Returns the value of the first argument raised to the power of the second argument.
17. sqrt(): Returns the square root of the argument.
18. sin(): Returns the sine of the specified double value.
19. cos(): Returns the cosine of the specified double value.
20. tan(): Returns the tangent of the specified double value.
21. asin(): Returns the arcsine of the specified double value.
22. acos(): Returns the arccosine of the specified double value.
23. atan(): Returns the arctangent of the specified double value.
24. atan2(): Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
25. toDegrees(): Converts the argument to degrees.
26. toRadians(): Converts the argument to radians.
27. random(): Returns a random number.

```Java
public class Test {

   public static void main(String args[]) {
      System.out.println( Math.random() );
      System.out.println( Math.random() );
   }
}
```
