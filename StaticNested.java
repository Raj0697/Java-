class StaticNested
{      
    static class Inner
    {  
     void msg()
     	{
    	 System.out.println("Inside Static Inner class's method");
     	}  
    }  
    
    public static void main(String args[])
    {  
    	StaticNested.Inner inObj=new StaticNested.Inner();  
    	inObj.msg();  
    }  
}  