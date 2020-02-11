
public class FinallyDemo {

	public static void main(String[] args) {
		try{  
			   int res=20/5;  
			   System.out.println(res);  
			  }  
			  catch(ArithmeticException e)
		{
				  System.out.println(e);
				  }  
			  finally
			  {
				  System.out.println("finally block is always executed");
				  }  
			  System.out.println("rest of the code...");  
			  }  

}
