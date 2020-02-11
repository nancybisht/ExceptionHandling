import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionProp {
	void m() throws IOException, SQLException {  
	    throw new SQLException("device error");//checked exception  
	  }  
	  void n() throws SQLException{  
	    try {
			m();
		} catch (IOException e) {
			System.out.println(e);
		}  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
	   CheckedExceptionProp obj=new CheckedExceptionProp();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  

}
