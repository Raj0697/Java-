import java.util.Scanner;

public class diamond 
{
	public static void main(String[] args) 
	{
		
		int i,j,row,count,n=1,k;
		Scanner si=new Scanner(System.in);
		System.out.println("Enter the row:");
		row=si.nextInt();
		count=row;
		for(k=0;k<row;k++)
		{
			for(i=0;i<=count;i++)
				System.out.println(" ");
			count--;
			for(j=0;j<n;j++)
				System.out.println("*");				
			n=n+2;
			System.out.println();
		}
		count=(row-1)*2-1;
		n=3;
		for(k=1;k<row;k++)
		{
			for(i=1;i<=n;i++)
				System.out.println("");
			for(j=1;j<=count;j++)
				System.out.println("*");
			count=count-2;
			n++;
			System.out.println();
			si.close();
		}
		
	}
	
}
