
public class calculator1 
{
	int x,y;
	calculator1(){x=y=10;}
	calculator1(int x,int y)
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
	
	static class test
	{
		public static void main(String args[])
		{
			calculator1 c1=new calculator1();
			calculator1 c2=new calculator1(5,0);
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
}
