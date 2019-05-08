import java.util.Scanner;

public interface airvehicle extends vehicle
{
	void planename();
	void capacity();
	void clas();
	Scanner s = new Scanner(System.in);
}

class plane implements airvehicle
{
	public void passenger()
	{
		System.out.println("Enter the no of passenger : ");
		int a=s.nextInt();
		System.out.println("The no of passenger is : "+a);
	}
	public void engine() 
	{
		System.out.println("Enter the engine type : ");
		String a=s.next();
		System.out.println("The engine type is : "+a);
	}
	public void weight()
	{
		System.out.println("Enter the weight of plane : ");
		int a=s.nextInt();
		System.out.println("The weight of the plane is : "+a+"kg");
	}
	public void wheel()
	{
		System.out.println("Enter the no of wheels : ");
		int a=s.nextInt();
		System.out.println("The no of wheels is : "+a);
	}
	public void planename()
	{
		System.out.println("Enter the plane name : ");
		String a=s.next();
		System.out.println("The plane name is : "+a);
	}
	public void capacity()
	{
		System.out.println("Enter the capacity of the plane : ");
		int a=s.nextInt();
		System.out.println("The capacity of the plane is :"+a+"Passengers");
	}
	public void clas()
	{
		System.out.println("Enter the clas you are going to travel : ");
		String a=s.next();
		System.out.println("The travelling clas is : "+a);
	}
}

class helicopter implements airvehicle
{
	public void passenger()
	{
		System.out.println("Enter the no of passenger : ");
		int a=s.nextInt();
		System.out.println("The no of passenger is : "+a);
	}
	public void engine() 
	{
		System.out.println("Enter the engine type : ");
		String a=s.next();
		System.out.println("The engine type is : "+a);
	}
	public void weight()
	{
		System.out.println("Enter the weight of helicopter : ");
		int a=s.nextInt();
		System.out.println("The weight of the helicopter is : "+a+"kg");
	}
	public void wheel()
	{
		System.out.println("Enter the no of wheels : ");
		int a=s.nextInt();
		System.out.println("The no of wheels is : "+a);
	}
	public void planename()
	{
		System.out.println("Enter the helicopter name : ");
		String a=s.next();
		System.out.println("The helicopter name is : "+a);
	}
	public void capacity()
	{
		System.out.println("Enter the capacity of the helicopter : ");
		int a=s.nextInt();
		System.out.println("The capacity of the helicopter is :"+a+"Passengers");
	}
	public void clas()
	{
		System.out.println("Enter the clas you are going to travel : ");
		String a=s.next();
		System.out.println("The travelling clas is : "+a);
	}
}

class rocket implements airvehicle
{
	public void passenger()
	{
		System.out.println("Enter the no of passenger : ");
		int a=s.nextInt();
		System.out.println("The no of passenger is : "+a);
	}
	public void engine() 
	{
		System.out.println("Enter the engine type : ");
		String a=s.next();
		System.out.println("The engine type is : "+a);
	}
	public void weight()
	{
		System.out.println("Enter the weight of rocket : ");
		int a=s.nextInt();
		System.out.println("The weight of the rocket is : "+a+"kg");
	}
	public void wheel()
	{
		System.out.println("Enter the no of wheels : ");
		int a=s.nextInt();
		System.out.println("The no of wheels is : "+a);
	}
	public void planename()
	{
		System.out.println("Enter the rocket name : ");
		String a=s.next();
		System.out.println("The rocket name is : "+a);
	}
	public void capacity()
	{
		System.out.println("Enter the capacity of the rocket : ");
		int a=s.nextInt();
		System.out.println("The capacity of the rocket is :"+a+"Passengers");
	}
	public void clas()
	{
		System.out.println("Enter the clas you are going to travel : ");
		String a=s.next();
		System.out.println("The travelling clas is : "+a);
	}
}

class test4
{
	public static void main(String args[])
	{
		System.out.println("\n-------------INTERFACE--------------\n");
		
		System.out.println("\n-------------PLANE DETAILS----------\n");
		
		plane p = new plane();
		p.passenger();
		p.engine();
		p.wheel();
		p.weight();
		p.planename();
		p.capacity();
		p.clas();
		
		System.out.println("\n-------------HELICOPTER DETAILS--------------\n");
		
		helicopter h = new helicopter();
		h.passenger();
		h.engine();
		h.wheel();
		h.weight();
		h.planename();
		h.capacity();
		h.clas();
		
		System.out.println("\n-------------ROCKET DETAILS---------------\n");
		
		rocket r = new rocket();
		r.passenger();
		r.engine();
		r.wheel();
		r.weight();
		r.planename();
		r.capacity();
		r.clas();
		
	}
}
		 


