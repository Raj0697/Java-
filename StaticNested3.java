public class StaticNested3
{  
    static int data=30; 
    
    static class Inner
    {  
     void msg()
     	{
    	 System.out.println("data is "+data);
     	}  
    }  
    
    public static void main(String args[])
    {  
    	StaticNested3.Inner inObj=new StaticNested3.Inner();  
    	inObj.msg();  
    }  
}  