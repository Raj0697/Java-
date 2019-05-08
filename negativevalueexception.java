import java.util.*;


class NegativeValueException extends Exception
{
	public String toString()
	{
		return("negativevalueexception");
	}
	 public static void main(String args[])
	 {
	    	account a=new account();
	    	a.accept();
	    	a.deposit();
	    	try
	    	{
	    		a.withdraw();
	    	}
	    	catch(NegativeValueException e)
	    	{
	    		System.out.println(e);
	    	}
	    }

}
class account
{
	Scanner my = new Scanner(System.in);
	String name;
	int balance;
	int deposit;
	int withdraw;
	void accept()
	{
		
		System.out.println("Enter the name: ");
		name = my.next();
	}

    void deposit()
    {
    
    	System.out.println("Enter the amount to deposit: ");
    	deposit = my.nextInt();
    	balance+= deposit;
    	display();
    }
    
    void withdraw()throws NegativeValueException
    {
    	
    	System.out.println("Enter the amount to withdraw: ");
    	withdraw = my.nextInt();
    	if(balance-withdraw<0)
    		throw new NegativeValueException();
    	else
    	{
    		balance-=withdraw;
    		display();
    	}
    }
    void display()
    {
    	System.out.println("current balance : "+balance);
    }
  
}
    

    