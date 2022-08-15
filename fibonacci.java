import java.awt.event.InputEvent;
import java.util.Scanner;


public class fibonacci
{
	public static void main(String[] args) 
	{
		System.out.println("*** Fibonacci series ***");
		System.out.println("Enter the no of terms");
	    InputStreamReader reader = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(reader);
		int num=Integer.parseInt(br.readline());
		int a=-1,b=1,c;
		for(int i=1;i<=num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
