class MyThread4 extends Thread 
{ 
public void run() 
{   try 
	{  for(int i = 1; i<200; i=i+2)
	   {System.out.println("MyThread4 "+i+" is ODD");
	   Thread.sleep(100);
	   }
	}
catch (Exception e) 
{    System.out.println ("Exception is caught"); 
} 
} 
} 
class MyThread5 extends Thread 
{ 
public void run() 
{ try {
	for(int i = 0; i<1000; i=i+10)
	System.out.println("MyThread5 "+i+" is Divisible by 10");
	//Thread.sleep(100);
}
catch (Exception e) 
{  System.out.println ("Exception is caught"); 
} 
 } 
} 
//Main Class 
public class Thread3
{public static void main(String[] args) 
{    MyThread4 th1 = new MyThread4(); 
     MyThread5 th2 = new MyThread5(); 
     th1.start(); 
     th2.start();
 } 
} 