class MemberInner
{  
    class Inner
    {  
     void msg()
     {
    	 System.out.println("Inside Member Inner class's method");
     }     
}  
    public static void main(String args[])
    {  
    	MemberInner outObj=new MemberInner();  
    	
    	MemberInner.Inner inObj=outObj.new Inner();
    	
    	inObj.msg();  
    }  
 }  