
public class sam {

	public double width,height,depth;
		
		sam(int a,int b,int c)
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
			sam mybox1 = new sam(10,20,30);
			sam mybox2 = new sam(50,60,70);
				
			System.out.println("volume is " + mybox1.volume());
			
			System.out.println("volume is " + mybox2.volume());
		}

	}


				