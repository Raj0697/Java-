import java.util.Scanner;

public class mean {
	
	public static void main(String[] args) {
		
		int n,i,sum=0,average;
		Scanner si =new Scanner(System.in);
		System.out.println("Mean");
		System.out.println("Enter the size:");
		n=si.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<a.length;i++)
			a[i]=si.nextInt();             
		System.out.println("The mean is:");
		for(i=0;i<a.length;i++)
			sum=sum+a[i];
		average=sum/a.length;
		System.out.println(average);
		
		System.out.println("Median");
		if(a.length%2==0)
		{
			System.out.println("The median is");
		}
		si.close();
	}
}
