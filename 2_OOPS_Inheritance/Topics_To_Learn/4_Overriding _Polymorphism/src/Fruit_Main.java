/*
 1.Create  a base class Fruit which has name ,taste and size as its attributes.
  A method called eat() is created which describes the name of the fruit and its taste.  Inherit
  the same in 2 other class Apple and Orange and override the eat() method to represent each fruit taste.
 */
public class Fruit_Main 
{
	public static void main(String args[])
	{
		int size = 2;
		Fruit obj = new Fruit();
		obj.eat();
		Fruit obj_2 = new Apple();
		obj_2.eat();
		Fruit obj_3 = new Orange();
		obj_3.eat();
	}
}
class Fruit
{
	private String name;
	private String taste;
	private int size;
	void eat()
	{
		name = "Fruit";
		taste = "none";
		System.out.println("Name:"+name);
		System.out.println("Taste:"+taste);
		System.out.println();
	}
}
class Apple extends Fruit
{
	private String name;
	private String taste;
	private int size;
	void eat()
	{
		name = "Apple";
		taste = "sweet";
		System.out.println("Name:"+name);
		System.out.println("Taste:"+taste);
		System.out.println();
		
	}
	
}
class Orange extends Fruit
{
	private String name;
	private String taste;
	private int size;
	void eat()
	{
		name = "Orange";
		taste = "bitter";
		System.out.println("Name:"+name);
		System.out.println("Taste:"+taste);
	}
}
/*
 
Output:

Name:Fruit
Taste:none

Name:Apple
Taste:sweet

Name:Orange
Taste:bitter

 
 */
 