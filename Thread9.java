//example of java synchronized method  
class Operations
{  
 synchronized void printSync(int n)
 {//synchronized method. When one thread is using it another cannot use it  
   for(int i=1;i<=5;i++)
   {  
     System.out.println("Printing Multiplications    "+n*i);  
     try{Thread.sleep(400);}catch(Exception e){System.out.println(e);}  
   }    
 }
 
 void printNonSync(int n)
 {	for(int i = n; i<=n*n; i = i+2)
	 { 
	   System.out.println("Printing numbers "+i);
	   try {Thread.sleep(100);} catch(Exception e) {System.out.println(e);}
	 }
}
} 

class MyThread10 extends Thread
{  
	Operations t; // Resource to be used for this thread 
	
	MyThread10(Operations t){this.t=t;}  
	
	public void run()
	{
		t.printSync(4); 
		t.printNonSync(3);
		t.printSync(2);
	}    
}  

class MyThread11 extends Thread
{  
	Operations t;  // Resource to be used for this thread
	
	MyThread11(Operations t) { this.t=t; }  
	
	public void run()
	{
		t.printSync(7); 
		t.printNonSync(6);
		t.printSync(5);
	}  
}

public class Thread9
{  
	public static void main(String args[])
	{ 
		Operations opr = new Operations(); // This object is used for both the threads
		
		MyThread10 th1 = new MyThread10(opr); 
		
		MyThread11 th2 = new MyThread11(opr);  
		
		th1.start();  
		th2.start();
	}
}

/* One Possible Output: 
Printing Multiplications    4
Printing Multiplications    8
Printing Multiplications    12
Printing Multiplications    16
Printing Multiplications    20
Printing Multiplications    7
Printing numbers 3
Printing numbers 5
Printing numbers 7
Printing numbers 9
Printing Multiplications    14
Printing Multiplications    21
Printing Multiplications    28
Printing Multiplications    35
Printing Multiplications    2
Printing numbers 6
Printing numbers 8
Printing numbers 10
Printing numbers 12
Printing Multiplications    4
Printing numbers 14
Printing numbers 16
Printing numbers 18
Printing numbers 20
Printing Multiplications    6
Printing numbers 22
Printing numbers 24
Printing numbers 26
Printing numbers 28
Printing Multiplications    8
Printing numbers 30
Printing numbers 32
Printing numbers 34
Printing Multiplications    10
Printing numbers 36
Printing Multiplications    5
Printing Multiplications    10
Printing Multiplications    15
Printing Multiplications    20
Printing Multiplications    25
 */