
public class objects
{
	int a;static int count=0;
	A(){a=10;count++;}
	A(int a){this.a=a;count++;}
	A add(A ap)
	{
		A ad=new A();
	}

	public static void main(String args[])
	{
		A a1=new A();
		A a2=new A(2);
		A a3=new A();
		a3=a1.add(a2);
		System.out.println("Total no of objects created"+A.count);
		B b1=new B();
		System.out.println("Total no of objects created"+(A.count + B.count));
	}
}


