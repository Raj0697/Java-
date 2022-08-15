 class A
{
	int a=10;
	void print(){System.out.println(a);}
	void init(int x){a=x;}
}
 class B
{
	int b;
	A aobj;
	void print()
	{
		System.out.println(b);
		aobj.print();
	}
	void init(int x)
	{
		b=x;
		aobj.init(x);
	}
}
 public class A
 
 {
	 public static void main(String args[])
	 {
		 A obj=new A();
		 B obj1=new B();
		 aobj1.init(20);
		 bobj.print();//20
		 bobj.init(30);
		 bobj.print();//30 30
	 }
 }

 
 