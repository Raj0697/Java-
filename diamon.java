import java.util.Scanner;


public class diamon {

	public static void main(String[] args) {
		int n,i,j = 0,k;
		System.out.println("enter the value:");
		Scanner my=new Scanner(System.in);
		n=my.nextInt();
		for(i=1,k=1;i<n;i++,k=k+2)
		{
			for(j=n;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(j=1;j<=k;j=j++)
			{
			System.out.print("*");
			}
		System.out.print("\n");
		}
		n=j-3;
		for(i=1,k=1;i<=n;i++,k=k+2)
		{
			for(j=1;j<=i+2;j++)
			{
			System.out.print(" ");
			}
			for(j=n;j>=k;j--)
			{
			System.out.print("*");
			}
		System.out.print("\n");
		my.close();
		}  
		}
		 
	}
