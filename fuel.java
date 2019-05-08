
public interface fuel 
{
	void diesel();
	
}

class dieselcar implements vehicle,fuel
{
	public void passenger() 
	{
		System.out.println("Enter the no of passenger : ");
		int a=s.nextInt();
		System.out.println("The no of passenger is : "+a);
	}
	public void engine() 
	{
		System.out.println("Enter the engine name : ");
		String a=s.next();
		System.out.println("The engine name is : "+a);
	}
	public void weight()
	{
		System.out.println("Enter the weight of dieselcar : ");
		int a=s.nextInt();
		System.out.println("The weight of the dieselcar is : "+a+"kg");
	}
	public void wheel()
	{
		System.out.println("Enter the no of wheels : ");
		int a=s.nextInt();
		System.out.println("The no of wheels is : "+a);
	}
	public void diesel()
	{
		System.out.println("Enter the type of diesel : ");
		String a=s.next();
		System.out.println("The diesel type is : "+a);
	}
}

class text4
{
	public static void main(String args[])
	{
		System.out.println("\n---------INTERFACE----------\n");
		dieselcar d = new dieselcar();
		d.passenger();
		d.engine();
		d.wheel();
		d.weight();
		d.diesel();
	}
}


