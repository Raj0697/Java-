import java.util.Scanner;


public class dicountcalculator 
{
	public static void main(String args[])
	{
		double amt,dis=0,net;
		System.out.println("  DISCOUNT CALCULATOR  ");
		Scanner my = new Scanner (System.in);
		System.out.println("Enter the amount : ");
		amt = my.nextInt();
		System.out.println("The Discount is : ");
		if(amt>=501 && amt<=1000)
		{
			dis=0.05*amt;
		}
		else if(amt>=1001 && amt<=5000)
		{
			dis=0.1*amt;
		}
		else if(amt>=5001 && amt<=10000)
		{
			dis=0.12*amt;
		}
		else if(amt>10000)
		{
			dis=0.15*amt;
		}
		else if(amt<500)
		{
			dis=0;
		}
		net=amt-dis;
		System.out.println(dis);
		System.out.println("The net amount is : " + net);
		my.close();
		
	}

}
