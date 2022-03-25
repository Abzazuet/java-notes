# Source File Declaration Rules
* These rules are essential when declaring classes, import statements and package statements in a source file.
1. There can only be one public class per source file.
2. A source file can have multiple non-public classes.
3. The public class name should be the name of the source file as well which shoul be appended by .java at the end.
4. If the class is defined inside a package, then the package statement should be the first statement in the source file.
5. If import statements are present, then they must be written between the package statement and the class declaration.
6. Import and package statements will imply to all the classes present in the source file.

    * It is not possible to declare different import and/or package statements to different classes in the source file.

    * Classes have several access levels and there are different type of classes: abstract, classes, final classes, etc. 

    * Java also has some special classes called inner classes and anonymous classes.
## Java Package
* It is a way of categorizing the classes and interfaces.
## Import statements
* In java if a fully qualified name, which includes the package and the class name is given, then the compiler can easily locate the source code or classes.
* Import statement is a way of giving the proper location for the compiler to find that particular class.
* For example, the following line would ask the compiler to load all the classes in directory java_instalation/java/io
`import java.io.*;`.
# PROGRAM IS AT
* Relative path ../Programs/Employee