class MemberInn
{  
    class Inner
    {  
     void msg()
     {
    	 System.out.println("Inside Member Inner class's method");
     }     
    } 
}

class MemberInner2
{
    public static void main(String args[])
    {  
    	MemberInn outObj=new MemberInn();  
    	
    	MemberInn.Inner inObj=outObj.new Inner();
    	
    	inObj.msg();  
    }  
 }  