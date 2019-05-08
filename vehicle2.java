import java.util.Scanner;


public interface vehicle2
{
	void passenger();
	void engine();
	void weight();
	void wheel();
    Scanner s = new Scanner(System.in);
}

class car1 implements vehicle2
{
	public void passenger() 
	{
		System.out.println("\n------------RUNTIME POLYMORPHISM--------------\n");
		System.out.println("\n------------CAR1 DETAILS-----------------\n");
		System.out.println("Enter the no of passenger : \n");
		int a=s.nextInt();
		System.out.println("The no of passenger is : \n"+a);
	}
	public void engine() 
	{
		System.out.println("Enter the engine name : \n");
		String a=s.next();
		System.out.println("The engine name is : \n"+a);
	}
	public void weight()
	{
		System.out.println("Enter the weight of car : \n");
		int a=s.nextInt();
		System.out.println("\nThe weight of the car is : "+a+"kg");
	}
	public void wheel()
	{
		System.out.println("Enter the no of wheels : \n");
		int a=s.nextInt();
		System.out.println("\nThe no of wheels is : "+a);
	}
}
 
 class auto1 implements vehicle2
 {
	 public void passenger()
	 {
		 System.out.println("\n------------AUTO1 DETAILS-----------------\n");
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
 
 class cycle1 implements vehicle2
 {
	 public void passenger()
	 {
		 System.out.println("\n------------CYCLE1 DETAILS-----------------\n");
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
 
 class ship1 implements vehicle2
 {
	 public void passenger()
	 {
		 System.out.println("\n------------SHIP1 DETAILS---------------\n");
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
 
 class test5
 {
	 public static void main(String args[])
	 {   
		 vehicle2 vh;
		 car1 c = new car1();
		 auto1 a = new auto1();
		 cycle1 cy = new cycle1();
		 ship1 s = new ship1();
		 
		 vh=c;
		 vh.passenger();
		 vh.engine();
		 vh.weight();
		 vh.wheel();
		 
		 vh=a;
		 vh.passenger();
		 vh.engine();
		 vh.weight();
		 vh.wheel();
		 
		 vh=cy;
		 vh.passenger();
		 vh.engine();
		 vh.weight();
		 vh.wheel();
		 
		 vh=s;
		 vh.passenger();
		 vh.engine();
		 vh.weight();
		 vh.wheel();
	 }
 }
 
