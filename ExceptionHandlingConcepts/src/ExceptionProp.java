
public class ExceptionProp {
	void m(){  
	    int d=50/0;  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){
		   System.out.println("exception handled");
		   }  
	  }  
	    
	public static void main(String[] args) {
		// By default Unchecked Exceptions are forwarded in calling chain (propagated).
		 ExceptionProp obj=new ExceptionProp();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  
	}

}
