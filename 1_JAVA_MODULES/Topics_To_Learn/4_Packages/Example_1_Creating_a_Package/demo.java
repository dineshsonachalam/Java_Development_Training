package p1; // Put this class inside a package
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
    This command forces the compiler to create a package(a folder name p1(package)here)
    Here . operator means current working directory

    To execute the code:

    java p1.c1
    //java package_name.class_name

*/
