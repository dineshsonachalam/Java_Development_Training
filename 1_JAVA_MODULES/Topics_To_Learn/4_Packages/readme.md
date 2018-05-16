## Packages

It is a group of similar type of classes, interface, sub-packages.

Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces.

A packages is container of group of related classes where some of the classes are accessible are exposed and others are kept for internal purpose.

We can reuse existing classes from the packages as many time as we need it in our program.

It is in 2 forms they are:

- Build in package (eg: java,lang,awt,javax,swing,net,io,util,sql)
- User defined package

**Advantage:**

- It is used to categorize classes and interface. So can be easily maintained.
- It provides access protection.
- It removes naming collision.
- Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee
- Making searching/locating and usage of classes, interfaces, enumerations and annotations easier
- Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.
- Packages can be considered as data encapsulation (or data-hiding).

## Using Packages with Eclipse Example 1:

1. First create a new java project. For Example: Example_4_Testing_Packages_With_NetBeans

2. Then click on src folder -> new -> package. For example: Let us name the package as 'oops'.

3. Then oops -> new -> create class . For example: tutorial.java

4. Lets create another package . src folder -> new -> package. For example: Package_2

5. Create Package_2->new->create class. For example: python_tutorial

   ```java
   package oops;
   import Package2.*; //importing every class in Package2
   // import Package2.python_tutorial; // importing python_tutorial class from Package_2

   ```

   ​