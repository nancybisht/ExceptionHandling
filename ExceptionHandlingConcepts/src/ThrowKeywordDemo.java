
public class ThrowKeywordDemo {

	public static void main(String[] args) {
		int n=-1;
		try {
		check(n);
	}catch(ArithmeticException e)
		{
		System.out.println(e);
		}
	}
	
	static void check(int n)
	{
	if(n<0)
		throw new ArithmeticException("not valid");
	else
		System.out.println("Positive Number");
	
	}
	public String toString(String s)
	{
		return s;
		
		
	}
}
