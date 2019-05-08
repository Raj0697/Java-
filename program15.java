import java.util.Scanner;


	class person
	{
		Scanner s=new Scanner(System.in);
		String name;
		int age=0;
		void accept()
		{
		
			System.out.println("Enter the name: ");
			name = s.next();
			System.out.println("Enter the age: ");
			age = s.nextInt();
		}
		void display()
		{
			System.out.println("The name is"+name);
			System.out.println("The age is"+age);
		}
		void helloname()
		{
			System.out.println("Hello,"+name+"! Have a nice day");
		}	
	}
	
	class student extends person
	{
		int rollno;
		int[] marks=new int[6];
		int totalmarks=0;
		
		void accept()
		{
			super.accept();
			System.out.println("Enter the name: ");
			name=s.next();
			System.out.println("Enter the rollno: ");
			rollno=s.nextInt();
			System.out.println("Enter the mark: ");
			for(int i=0;i<6;i++)
			{
				System.out.println("Enter the mark"+(i+1));
				marks[i]=s.nextInt();
			}
			System.out.println("Enter totalmarks: ");
			for(int i=0;i<6;i++)
			{
				totalmarks=totalmarks+marks[i];
			}
			System.out.println(totalmarks);
		}
		
		void display()
		{
			super.display();
			System.out.println("The name is"+name);
			System.out.println("The rollno is"+rollno);
			System.out.println("The mark is");
			for(int i=0;i<6;i++)
			{
				System.out.println("The mark "+(i+1)+ " is "+marks[i]);
			}
			System.out.println("The totalmark is"+totalmarks);
		}
		
	}
	
	class employee extends person
	{
		int empId;
		String designation;
		String organizationname;
		int salary;
		
		void accept()
		{
			super.accept();
			System.out.println("Enter the empId: ");
			empId=s.nextInt();
			System.out.println("Enter the designaton: ");
			designation=s.next();
			System.out.println("Enter the organizatonname: ");
			organizationname=s.next();
			System.out.println("Enter the salary: ");
			salary=s.nextInt();
		}
		
		void display()
		{
			super.display();
			System.out.println("The empId is"+empId);
			System.out.println("The designation is"+designation);
			System.out.println("The organization name is"+organizationname);
			System.out.println("The salary is"+salary);
		}
	}
	
	class worker extends person
	{
		String companyname;
		int dailywagesrate;
		int noofdaysworked;
		int salary;
		
		void accept()
		{
			super.accept();
			System.out.println("Enter the companyname: ");
			companyname=s.next();
			System.out.println("Enter the dailywagesrate: ");
			dailywagesrate=s.nextInt();
			System.out.println("Enter the noofdaysworked: ");
			noofdaysworked=s.nextInt();
			System.out.println("Enter the salary: ");
			salary=s.nextInt();
		}
		
		void display()
		{
			super.display();
			System.out.println("The company name is"+companyname);
			System.out.println("The daily wages rate is"+dailywagesrate);
			System.out.println("The no of days worked is"+noofdaysworked);
			System.out.println("The salary is"+salary);
		}
	}
	
	class PGstudent extends student
	{
		String coursename;
		int percentageofmarks;
		
		void accept()
		{
			super.accept();
			System.out.println("Enter the coursename: ");
			coursename=s.next();
			System.out.println("Enter the percentageofmarks: ");
			percentageofmarks=s.nextInt();
		}
		
		void display()
		{
			super.display();
			System.out.println("The course name is"+coursename);
			System.out.println("The percentage of marks is"+percentageofmarks);
		}
	}
	
	class manager extends employee
	{
		int noofworkers;
		
		void accept()
		{
			super.accept();
			System.out.println("Enter the noofworkers: ");
			noofworkers=s.nextInt();
		}
		
		void display()
		{
			super.display();
			System.out.println("The no of workers is"+noofworkers);
		}
	}
	
	class seniorworker extends worker
	{
		int yearsofexperience;
		
		void accept()
		{
			super.accept();
			System.out.println("Enter the years of experience: ");
			yearsofexperience=s.nextInt();
		}
		
		void display()
		{
			System.out.println("The years of experience is"+yearsofexperience);
		}
	}
	class program15
	{
		public static void main(String args[])
		{
			person pr;
			person p1=new person();
			student s1=new student();
			employee e1=new employee();
			worker w1=new worker();
			PGstudent PG1=new PGstudent();
			manager m1=new manager();
			seniorworker sw1=new seniorworker();
			
			pr=p1;
			pr.accept();
			pr.display();
			
			pr=s1;
			pr.accept();
			pr.display();
			
			pr=e1;
			pr.accept();
			pr.display(); 
			
			pr=w1;
			pr.accept();
			pr.display();
			
			pr=PG1;
			pr.accept();
			pr.display();
			
			pr=m1;
			pr.accept();
			pr.display();
			
			pr=sw1;
			pr.accept();
			pr.display();
	 }
	}
