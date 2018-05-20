/*
   1. Create a class named ‘Animal’ which includes methods like eat() and sleep().
      Create a child class of Animal named ‘Bird’ and override the parent class methods. 
      Add a new method named fly().
      Create an instance of Animal class and invoke the eat and sleep methods using this object.
      Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
 */
class Animal
{
	void eat()
	{
		System.out.println("eat in Animal class");
	}
	void sleep()
	{
		System.out.println("sleep in Animal class");
	}
}
class Bird extends Animal
{
	// changes
	void fly()
	{
		System.out.println("fly in Bird class");
	}
	void eat()
	{
		System.out.println("eat in Bird class");
	}
	void sleep()
	{
		System.out.println("sleep in Bird class");
	}
	public static void main(String args[])
	{
		Animal obj = new Animal();
		obj.eat();
		obj.sleep();
		Bird obj_2 = new Bird();
		obj_2.eat();
		obj_2.sleep();
		obj_2.fly();
	}

}

/*
 Output:
	eat in Animal class
	sleep in Animal class
	eat in Bird class
	sleep in Bird class
	fly in Bird class
  
 */
