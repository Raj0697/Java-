
public class calculator
{
	int x,y;
	calculator(){x=y=10;}
	calculator(int x,int y)
	{
		this.x=x;this.y=y;
	}
	void add(){System.out.println(x+y);}
	void sub(){System.out.println(x-y);}
	void mul(){System.out.println(x*y);}
	void div() throws ArithmeticException
	{
		if(y==0)
			throw new ArithmeticException("Divide by zero");
		else
			System.out.println(x/y);
	}
	void display(){}
	void accept(){}
}
class test
{
	public static void main(String args[])
	{
		calculator c1=new calculator();
		calculator c2=new calculator(5,0);
		c1.add();
		c1.sub();
		c1.mul();
		try
		{
			c1.div();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			c1.add();c1.sub();c1.mul();
		}
	    try
	    {
	    	c2.div();
	    }
        catch(ArithmeticException e)
        {
        	System.out.println(e.getMessage());
        }
	    finally
	    {
	    	c2.add();c2.sub();c2.mul();
	    }
    }
}
	    
	 