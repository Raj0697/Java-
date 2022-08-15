
public class words {

	public static void main(String[] args) {
		int n=6925;
		int d1,d2,d3,d4;
		d4=n%10;
		d3=(n/10)%10;
		d2=(n/100)%10;
		d1=(n/1000)%10;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		print(d1);
		print(d2);
		print(d3);
		print(d4);
}
static void print(int d)
{
	switch(d)
	{
	case 0: System.out.println("ZERO");
	break;
	case 1: System.out.println("ONE");
	break;
	case 2: System.out.println("TWO");
	break;
	case 3: System.out.println("THREE");
	break;
	case 4: System.out.println("FOUR");
	break;
	case 5: System.out.println("FIVE");
	break;
	case 6: System.out.println("SIX");
	break;
	case 7: System.out.println("SEVEN");
	break;
	case 8: System.out.println("EIGHT");
	break;
	case 9: System.out.println("NINE");
	break;
	case 10: System.out.println("TEN");
	break;
	default: System.out.println("INVALID NUMBER");
}
}

}
