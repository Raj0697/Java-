
class boxdemo 
{
	public double width,height,depth;
	
	boxdemo(int a,int b,int c)
	{
		width=a;
		height=b;           
		depth=c;
	}
double volume()
{
	return(width*height*depth);
}

	public static void main(String args[])
	{
		boxdemo mybox1 = new boxdemo(1,2,3);
		boxdemo mybox2 = new boxdemo(5,6,7);
		
		
		//compute volume of 1st box
		
		
		System.out.println("volume is" + mybox1.volume());
		
		//compute volume of 2nd box
		
	
		System.out.println("volume is" + mybox2.volume());
	}

}
