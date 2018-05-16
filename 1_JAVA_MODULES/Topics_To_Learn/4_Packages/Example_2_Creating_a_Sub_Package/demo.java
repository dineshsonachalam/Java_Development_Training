package p1.p2; // Creating a sub package p2
class c1
{
  public void m1()
  {
      System.out.println("m1 of c1!");
  }
  public static void main(String[] args)
  {

        c1 obj = new c1();
        obj.m1();

  }
}
/*
      javac -d . demo.java
      This command forces the compiler to create a package
      . operator -> It means the current working directory

      To execute the code:
      java p1.p2.c1
      java parent_package.sub_package.class_name    
*/
