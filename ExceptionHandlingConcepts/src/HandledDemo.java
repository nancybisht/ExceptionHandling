import java.io.IOException;

public class HandledDemo {

	public static void main(String[] args) {
		int m=10;
		int n=0;
		int arr[]= {2,3,0};
		String s="Hello";
		s=null;
		System.out.println(s.charAt(0));
		/*try {
		int res=m/arr[2];
		System.out.println(res);
		}*/
		try {
			
			int num=Integer.parseInt("s");
			System.out.println(num);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		catch(NumberFormatException e1)
		{
			System.out.println(e1);
			
		}
		System.out.println("Completed");	
	
}
	}


