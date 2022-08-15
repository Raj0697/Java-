
public class diamond 
{
	public static void main(String args[])
	{
		for(int r=0;r<=10;r++)
		{
			for(int a=0;a<10-r;a++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=r;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=9;r>=0;r--)
		{
			for(int a=0;a<10-r;a++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=r;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
