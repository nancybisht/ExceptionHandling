
public class NegativeNumberException extends Exception{
String s;
	NegativeNumberException(String s)
	{
		this.s=s;
		
		
	}
	public String toString()
	{
		return s;
		
	}
}
