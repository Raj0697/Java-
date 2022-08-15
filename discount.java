import java.util.Scanner;


public class discount {

	public static void main(String[] args) {

	System.out.println("percentage of cash discount:");
	double amt,dis;
	Scanner my=new Scanner (System.in);
	System.out.println("Enter the MRP amount:");
	amt=my.nextInt();
	System.out.println(amt);
	System.out.println("The calculation are:");
	if(amt<1000)
	{
		dis=amt*0.05;
	}
	else if(1001<=amt && amt<2000)
	{
		dis=amt*0.075;
	}
	else if(amt>2000)
	{
		dis=amt*0.1;
	}
	System.out.println("The discount is \t"+dis);
	System.out.println("The after discount is"+(amt-dis));
	my.close();
	
	}

}
