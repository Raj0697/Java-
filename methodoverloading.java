import java.util.Scanner;

public class methodoverloading 
{
	static int add(int a,int b) 
	{
		return(a+b);
	}
	static double add(double a,double b)
	{
		return(a+b);
	}
	static int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	public static void main(String args[])
	{
		int a,b,c,e;
		double p,q,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		a=s.nextInt();
		System.out.println("Enter b value");
		b=s.nextInt();
		c=(int)add(a,b);
		System.out.println("ADDITION="+c);
		System.out.println("Enter p value");
		p=s.nextDouble();
		System.out.println("Enter q value");
		q=s.nextDouble();
		r=(double)add(p,q);
		System.out.println("ADDITION="+r);
		System.out.println("Enter the a value");
		a=s.nextInt();
		System.out.println("Enter the b value");
		b=s.nextInt();
		System.out.println("Enter the c value");
		c=s.nextInt();
		e=(int)add(a,b,c);
		System.out.println("ADDITION="+e);
		s.close();
	}

}
