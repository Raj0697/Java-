import java.util.Scanner;


public interface vehicle
{
	void passenger();
	void engine();
	void weight();
	void wheel();
	
    Scanner s = new Scanner(System.in);
}

 class car implements vehicle
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
		System.out.println("Enter the weight of car : ");
		int a=s.nextInt();
		System.out.println("The weight of the car is : "+a+"kg");
	}
	public void wheel()
	{
		System.out.println("Enter the no of wheels : ");
		int a=s.nextInt();
		System.out.println("The no of wheels is : "+a);
	}
}
 
 class auto implements vehicle
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
			System.out.println("Enter the weight of auto : ");
			int a=s.nextInt();
			System.out.println("The weight of the auto is : "+a+"kg");
		}
	 public void wheel()
		{
			System.out.println("Enter the no of wheels : ");
			int a=s.nextInt();
			System.out.println("The no of wheels is : "+a);
		}
 }
 
 class cycle implements vehicle
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
			System.out.println("Enter the weight of cycle : ");
			int a=s.nextInt();
			System.out.println("The weight of the cycle is : "+a+"kg");
		}
	 public void wheel()
		{
			System.out.println("Enter the no of wheels : ");
			int a=s.nextInt();
			System.out.println("The no of wheels is : "+a);
		}
 }
 
 class ship implements vehicle
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
			System.out.println("Enter the weight of ship : ");
			int a=s.nextInt();
			System.out.println("The weight of the ship is : "+a+"kg");
		}
	 public void wheel()
		{
			System.out.println("Enter the no of wheels : ");
			int a=s.nextInt();
			System.out.println("The no of wheels is : "+a);
		}
 }
 
 class test3
 {
	 public static void main(String args[])
	 {   
		 System.out.println("\n---------INTERFACE----------\n");
		 System.out.println("\n--------------CAR DETAILS-------------\n");
		 car c=new car();
		 c.passenger();
         c.engine();
         c.weight();
         c.wheel();
         
         System.out.println("\n----------------AUTO DETAILS-------------\n");
         auto a=new auto();
         a.passenger();
         a.engine();
         a.weight();
         a.wheel();
         
         System.out.println("\n------------CYCLE DETAILS-------------\n");
         cycle b=new cycle();
         b.passenger();
         b.engine();
         b.weight();
         b.wheel();
         
         System.out.println("\n------------SHIP DETAILS------------");
         ship d=new ship();
         d.passenger();
         d.engine();
         d.weight();
         d.wheel();
		 
	 }
 }
 
