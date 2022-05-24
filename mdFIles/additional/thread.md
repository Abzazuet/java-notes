# Thread

- Allows a program to operate more efficiently by doing multiple things at the same time
- Threads can be used to perform a complicated task in the background without interrumpting the main program

## Create

- THere are 2 ways to create a thread

### Extend

- It can be created by extending the Thread class and overriding its run() method

```java
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

#### Running threads

- If the class extends the Thread class, the thread can be run by creating an instance of a class and call its start() method

```java
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

### Implement

- It can also be created by implementing the Runnable interface

```java
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

#### Running

- The thread can be run by passing an instance of a class to a Thread object's constructor and then calling the thread's start() method

```java
public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```
## Main difference between the 2 methods
- The major difference is that when a class extends the Thread class you cannot extend any other class, but by implementing the runnable interface, it is possible to extend from another class as well
## Concurrency problems
- Threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable.
### Avoiding them
- It is best to share as few attributes between threads as possible.
- If attributes need to be shared, one possible solution is to use the `isAlive()` method of the thread and check whether the thread has finished running before using any attributes that the thread can change.
