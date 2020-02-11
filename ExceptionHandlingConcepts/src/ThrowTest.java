import java.io.IOException;

public class ThrowTest {
	void method() throws IOException{
		  throw new IOException("device error");
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	          ThrowTest m=new ThrowTest();
	    try {
	          m.method();

	    }catch(Exception e){System.out.println("exception handled");}   

	    System.out.println("normal flow...");
	  }


}
