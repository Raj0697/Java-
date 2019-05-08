import java.util.Scanner;


class book
{
	String bookname;
	String authorname;
	String publication;
	int publicationyear;
	int price;
	
	Scanner s=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter the book name : ");
		bookname=s.next();
		System.out.println("Enter the author name : ");
		authorname=s.next();
		System.out.println("Enter the publication name : ");
		publication=s.next();
		System.out.println("Enter the publication year : ");
		publicationyear=s.nextInt();
		System.out.println("Enter the price : ");
		price=s.nextInt();
		
	}
	
	void display()
	{
		System.out.println("The book name is " +bookname);
		System.out.println("The author name is " +authorname);
		System.out.println("The publication name is " +publication);
		System.out.println("The publication year is " +publicationyear);
		System.out.println("The price is " +price);
	}
}

class library_book extends book
{
	int bookcode;
	String availability;
	int totalbooks;
	
	void accept()
	{
		super.accept();
		System.out.println("Enter the book code : ");
		bookcode=s.nextInt();
		System.out.println("Enter the availability of the book : ");
		availability=s.next();
		System.out.println("Enter the total books : ");
		totalbooks=s.nextInt();
	}
	
	void display()
	{
		super.display();
		System.out.println("The book code is : "+bookcode);
		System.out.println("The availability of the book is : "+availability);
		System.out.println("The total books is :"+totalbooks);
	}

    String issuebook()
    {
    	String a;
    	System.out.println("Enter the issue date : ");
    	a=s.next();
    	totalbooks -=1;
    	return a;
    }
    
    
    
    String returnbook()
    {
    	String b;
    	System.out.println("Enter the return date : ");
    	b=s.next();
    	totalbooks +=1; 
    	return b;
    }
    
    String checkavailability()
    {
    	System.out.println("Current availability of the book : "+totalbooks);
    	return availability;
    }
}

class test
{
	public static void main(String args[])
	{
		book bk;
		book b = new book();
		library_book lb = new library_book();
		
		bk = b;
		bk.accept();
		bk.display();
		
		bk=lb;
		lb.accept();
		lb.display();
		lb.issuebook();
		lb.checkavailability();	
		lb.returnbook();
		lb.checkavailability();	
	}
}
		