
/*
CCreate a class called Author is designed as follows:

It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’).
• One constructor to initialize the name, email and gender with the given values.

And, a class called Book is designed as follows:

It contains:
• Four private instance variables: name (String), author (of the class Author you have just created), 
price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(),
getQtyInStock(), setQtyInStock(). Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier). 
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

*/

/*
 		constructor don't have a return type that is the only different between constructor and method. 
*/
class Author 
{
	private String name;
	private String email;
	char  gender; // 'm' or 'f'
	/*
	 One constructor to initialize the name, email and gender with the given values. 
	 */
	/*Parametrized constructor*/
	public Author(String name,String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
		/*this keyword is a reference variable refers to the current object*/
	}
	public char getGender()
	{
		return gender;
	}
	public String getEmail()
	{
		return email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Book
{
	/*Private instance variables*/
	private String name;
	private String author; //author of the class Author you have just created)
	private double price;
	private int qtyInStock;
	Book(String name,String author)
	{
		this.name = name;
		this.author = author;
//		this.price  = price;
//		this.qtyInStock = qtyInStock;
	}
	//Getters
	public String getName()
	{
		return name; //book name
	}
	public String getAuthor()
	{
		return author; //author name
	}
	public double getPrice()
	{
		return price; //book price
	}
	public int getQtyInStock()
	{
		return qtyInStock; // qtyInStock
	}
	//Setters
	public void setPrice(double price)
	{
		this.price = price; // price
	}
	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock; //qtyInStock
	}
	public static void main(String args[])
	{
		
		Author obj = new Author("Napolean Hill", "napolean@gmail.com", 'm');
		Book obj_2 = new Book("Think and grow rich",obj.getName());
		obj_2.setPrice(10);
		obj_2.setQtyInStock(6);
	
		//1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
		System.out.println("Book Name:"+obj_2.getName());
		System.out.println("Price:"+obj_2.getPrice()+"$");
		System.out.println("Quantity in Stock:"+ obj_2.getQtyInStock());
		System.out.println("---------------------------------------------");
		
		//2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.
		System.out.println("Author:"+obj.getName());
		System.out.println("Email:"+obj.getEmail());
		System.out.println("Gender:"+obj.getGender());
	}
	
	
	
}
/*
 	Output:
 	Book Name:Think and grow rich
	Price:10.0$
	Quantity in Stock:6
	---------------------------------------------
	Author:Napolean Hill
	Email:napolean@gmail.com
	Gender:m

 */
