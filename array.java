import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		int n,i;
		Scanner si=new Scanner(System.in);
		n=si.nextInt();
		int arr[]=new int[n];
		System.out.println(arr.length+"integers are to be entered");
		for(i=1;i<arr.length;i++)
			arr[i]=si.nextInt();
		for(i=1;i<arr.length;i++)
			System.out.println("arr["+i+"j="+arr[i]);
		si.close();
	}
}
