/*
 call this file boxdemo.java
*/

class boxdemo
{
	double width;
	double height;
	double depth;
}

// this class declares an object of type box.

class classbox
{
	public static void main(String args[])
	{
		boxdemo mybox = new boxdemo();
		double vol;
		
		//assign values to mybox's instance variables
		
		mybox.width = 30;
		mybox.height = 20;
		mybox.depth = 15;
		
		//compute volume of box
		
		vol = mybox.width * mybox.height * mybox.depth;
		
		System.out.println("volume is" + vol);
	}
}

