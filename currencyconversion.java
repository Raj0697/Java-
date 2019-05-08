
import java.util.Scanner;
public class currencyconversion
{
	public static void main(String args[])
	{
		System.out.print("Enter the amount in dollars : ");
		Scanner r = new Scanner(System.in);
		int dollars = r.nextInt();
		int rupees = 63 * dollars;
		System.out.println("Amount in dollars : " + dollars);
		System.out.println("Amount in rupees : " + rupees);
		r.close();
	}

}

