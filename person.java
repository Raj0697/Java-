
public class person 
{
	void eat(){}
	void sleep(){}
}
class student extends person                        
{
	void study(){}
}
class text
{
	public static void main(String args[])
	{
		person p1=new person();
		p1.eat();
		p1.sleep();
		student s1=new student();
		s1.eat();
		s1.sleep();
		s1.study();
	}
}

