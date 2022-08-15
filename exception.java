
public class exception 
{
	public static void main(String args[]) throws ArithmeticException
	{
		int a,b,c;
		a=10;b=0;
		try
		{
			if(b==0)throw new ArithmeticException("divide by zero");
			else c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("e");
			System.out.println(((Object) e).set message());
			throw e;
		}
        System.out.println("End of program");
	}
}

                                                                                                                                                                                                                    