import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		int amount;
		double simple,compound;
		Scanner bank =new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=bank.nextInt();
		simple=(amount*5*9.5)/100;
		compound=(amount*(1+(9/100))^5);
		System.out.println("The simple interest for 5 years is "+simple);
		System.out.println("The compound interest is for 5 years is "+compound);
		System.out.println("Total amount for simple interest is "+(simple+amount));
		System.out.println("Total amount for compound interest is "+(compound+amount));
		if(simple>compound)
			System.out.println("scheme A is better ");
		else
			System.out.println("scheme B is better ");
		 bank.close();
	}   

}
