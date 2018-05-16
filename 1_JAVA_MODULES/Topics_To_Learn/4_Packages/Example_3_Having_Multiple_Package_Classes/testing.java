import package_one.class_one; //package_name.class_name
import package_two.class_two; //package_name.class_name
public class testing
{
    public static void main(String[] args)
    {
        class_one obj1 = new class_one();
        obj1.m1();
        class_two obj2 = new class_two();
        obj2.m2();
    }
}
/*
    javac testing.java
    // It will create testing.class
    java testing
    // java classname will execute the code

    output:
    I am in class_one
    I am in class_two
*/
