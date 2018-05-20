
public class PointDemo_2 {
	public static void main(String args[ ] )
	{ 
	  int a, b;
	  Point_2 p1 = new Point_2( );
	  p1.setX(22); 
	  p1.setY(44); 
	  a = p1.getX( );
	  System.out.println("The value of a is "+a);
	  b = p1.getY( ); 
	  System.out.println("The value of b is "+b);
	 }
}
class Point_2
{
	private int x;
	private int y;
	public void setX(int x)
	{
			this.x = (x>79?79:(x<0? 0:x) ); //x =22	
	}
	public void setY(int y)
	{
		 	this.y = (y>24?24:(y<0?0:y));  //y =24
	}
	public int getX()
	{
		return x; //22
	}
	public int getY()
	{
		return y;//24
	}
}
/*
 Output:
 The value of a is 0
 The value of b is 0
 */
