
public class TestCustomException {

	 static void validate(int num) throws NegativeNumberException{  
	     if(num<0)  
	      throw new NegativeNumberException("not valid");  
	     else  
	      System.out.println("Valid Input");  
	   }  
	     	
	   public static void main(String args[]){  
	       
	      try {
			validate(-1);
		} catch (NegativeNumberException e) {
			System.out.println(e);
		}  
	     
	  
	      System.out.println("rest of the code...");  
	  }  

}
