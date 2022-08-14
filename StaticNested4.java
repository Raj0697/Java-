
public class StaticNested4
{  
    static class Inner
    {  
    	static int data=30; 
    	
    	void msg()
     	{
    	 System.out.println("data is "+data);
     	}  
    }  
    
    public static void main(String args[])
    {  
    	StaticNested4.Inner inObj=new StaticNested4.Inner();  
    	inObj.msg();  
    }  
}  