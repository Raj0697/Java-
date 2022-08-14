class StaticNest
{      
    static class Inner
    {  
     void msg()
     	{
    	 System.out.println("Inside Static Inner class's method");
     	}  
    } 
}

public class StaticNested2
{    
    public static void main(String args[])
    {  
    	StaticNest.Inner inObj=new StaticNest.Inner();  
    	inObj.msg();  
    }  
} 