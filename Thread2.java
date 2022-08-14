class MyThread2 extends Thread 
{ 
public void run() 
{   	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getId());
	for(int i = 1; i<20; i=i+2)
	   System.out.println("MyThread2 "+i+" is ODD");    
} 
} 
class MyThread3 extends Thread 
{ 
public void run() 
{   	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getId());
	for(int i = 0; i<100; i=i+10)
	System.out.println("MyThread3 "+i+" is Divisible by 10");
   } 
} 
public class Thread2
{public static void main(String[] args) 
{    MyThread2 th1 = new MyThread2(); 
     MyThread3 th2 = new MyThread3();
     System.out.println("Sending run messages to threads");
     th1.run(); 
     th2.run();
     System.out.println("\n\nSending start messages to threads");
     th1.start();
     th2.start();
   } 
} 