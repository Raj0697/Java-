
//Java code for thread creation by implementing the Runnable interface 
class MyThreadR implements Runnable 
{ 
public void run() 
{ try
   {// Displaying the thread that is running 
    System.out.println("Thread "+Thread.currentThread().getId()+" is running");
   } 
   catch (Exception e) 
   {// Throwing an exception 
       System.out.println ("Exception is caught"); 
   } 
} 
} 
//Main Class 
public class Thread5
{public static void main(String[] args) 
{   int n = 5; // Number of threads 
   for (int i=0; i<n; i++) 
   {   MyThreadR mtr = new MyThreadR();
       Thread t1 = new Thread(mtr);
       t1.start(); 
   } 
} 
} 
