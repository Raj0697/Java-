import java.util.Scanner;

class cylinder
{
	private int radius;
	private int height;
	private int volume;
	static Scanner s = new Scanner(System.in);
	cylinder()
	{
		this.radius=5;
		this.height=10;
	}
	
	cylinder(int radius,int height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	double calculate()
	{
		return(3.142*this.radius*this.radius*this.height);
	}
	
	void display()
	{
		System.out.println("\nRadius of the cylinder is : \n"+radius);
		System.out.println("\nHeight of the cylinder is : \n"+height);
		System.out.println("\nVolume of the cylinder is : \n"+calculate());
	}
	
	public static void main(String args[])
	{
		cylinder c=new cylinder();
		c.display();
		System.out.println("\nEnter the radius : \n");
	    int r=s.nextInt();
	    System.out.println("\nEnter the height : \n");
	    int h=s.nextInt();
	    cylinder d=new cylinder(r,h);
	    d.display();	
	}
}

