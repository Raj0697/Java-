
	class gendata <T>
	{
		T data;
		void display()
		{
			System.out.println(data);
		}
		T returndata()
		{
			return(data);
		}
	
	public static void main(String args[])
	{
			gendata <Integer>gdi=new gendata <Integer>();
			gdi.display();
			
	}

}
