class Bank
{ 
	int balance=10000;  
	synchronized void withdraw(int amount)
	{  
		System.out.println("Inside withdraw Method");    
		while (balance<amount)
		{  
			System.out.println("Less balance; If money is deposited, can proceed with withdraw");  
			try { wait(); } catch(Exception e){}  
		}  
		balance-=amount;  
		System.out.println("Money is withdrawn");  
	}  
	
	synchronized void deposit(int amount)
	{  
		System.out.println("Inside deposit Method");  
		balance+=amount;  
		System.out.println("Money deposited");  
		notify(); // wakes up the waiting thread 
	}  
} 

class Thread7 
{  public static void main(String args[])
   {  final Bank c=new Bank();  
      new Thread(){public void run(){c.withdraw(15000);}}.start();
      new Thread(){public void run(){c.deposit(2000);}}.start(); 
      new Thread(){public void run(){c.deposit(3000);}}.start(); 
   }
}  
/* Output: going to withdraw...
   Less balance; waiting for deposit...
   going to deposit...
   deposit completed...
   withdraw completed
*/
