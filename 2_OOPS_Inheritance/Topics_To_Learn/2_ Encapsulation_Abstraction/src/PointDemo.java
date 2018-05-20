
public class PointDemo {
	public static void main(String args[ ] )
	{ int a, b;
	 Point p1 = new Point( );
	 p1.setX(22); 
	 p1.setY(44); 
	 a = p1.getX( );
	 System.out.println("The value of a is "+a);
	 b = p1.getY( ); 
	 System.out.println("The value of b is "+b);
	 }

}

class Point
{
	private int x;
	private int y;
	public void setX(int x)
	{
			x = (x>79?79:(x<0? 0:x) ); //x =22	
	}
	public void setY(int y)
	{
		 	y = (y>24?24:(y<0?0:y));  //y =24
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