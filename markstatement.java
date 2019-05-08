import java.util.Scanner;

public interface markstatement 
{
	void subjects();

	Scanner s=new Scanner(System.in);
}

class softskill
{
	int marks[]=new int[3];
	int totalsoftskillmarks=0;
}

class softskillmarkstatement implements markstatement extends softskill
{
	int i;
	int subject[]=new int[3];
	int marks[]=new int[3];
	int totalsoftskillmarks=0;
	
	public void subjects()
	{
		System.out.println("Enter the subject name  : ");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the subject name"+(i+1));
			subject[i]=s.nextInt();
		}
		System.out.println("The subject "+(i+1)+ " is "+subject[i]);
	}
	
	public void marks()
	{
		System.out.println("Enter the marks : ");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the marks"+(i+1));
			marks[i]=s.nextInt();
		}
		System.out.println("The mark "+(i+1)+ " is "+marks[i]);
	}
	
	public void totalsoftskillmarks()
	{
		System.out.println("Enter totalmarks: ");
		for(int i=0;i<3;i++)
		{
			totalsoftskillmarks=totalsoftskillmarks+marks[i];
		}
		System.out.println(totalsoftskillmarks);
	}
}

class PGsoftskillmarkstatement extends softskillmarkstatement
{
	
}


