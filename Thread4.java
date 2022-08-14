class MyThread6 extends Thread 
{ 
public void run() 
{   try 
	{  for(int i = 1; i<200; i=i+2)
	   {System.out.println("MyThread6 "+i+" is ODD");
	   Thread.sleep(100);
	   }
	}
catch (Exception e) 
{// Throwing an exception 
  System.out.println ("Exception is caught"); 
} 
} 
} 
class MyThread7 extends Thread 
{ 
public void run() 
{ try {
	for(int i = 0; i<1000; i=i+10)
	{ System.out.println("MyThread7 "+i+" is Divisible by 10");
	  Thread.sleep(100);
	}
}
catch (Exception e) 
{  System.out.println ("Exception is caught"); 
} 
} 
} 
//Main Class 
public class Thread4
{public static void main(String[] args) 
{    MyThread6 th1 = new MyThread6(); 
     MyThread7 th2 = new MyThread7();
     System.out.println(th1.getPriority());
     System.out.println(th2.getPriority());
     System.out.println(th1.getName());
     System.out.println(th2.getName());

     th1.setPriority(1);
     th2.setPriority(10);
     th1.setName("name1");
     th2.setName("name2");
     
     System.out.println(th1.getPriority());
     System.out.println(th2.getPriority());
     System.out.println(th1.getName());
     System.out.println(th2.getName());
	 
     th1.start(); 
     th2.start();
} 
} 