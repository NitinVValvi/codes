package prac;
class Point{
	int x ;
	int y ;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		return;
	}
	
}
public class Coordinate extends Point
{
	public Coordinate(int x, int y) {
		super(x, y);
		
		
	}

	public void m1(int a ,int b)
	{
		a = this.x + a;
		b = this.y + b;
		System.out.println("("+a+","+b+")");
	}
	public static void main(String[] args) {
		Coordinate c = new Coordinate(10,20);
		c.m1(30, 10);
	}
}