import java.util.Scanner;
                    
public class mean   
{                   
	public static void main(String args[])
	{               
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an integer array");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the value one by one");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		int mean=sum/a.length;
		System.out.println("mean");
		System.out.println("median");
		if(a.length%2==1)
		{
			System.out.println("a[n/2]");
		}
		else
		{
			float median=(float)(a[n/2-1]+a[n/2])/2;
		}
		System.out.println("median");
		s.close();
	}
}
