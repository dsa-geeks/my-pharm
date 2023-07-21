
package PharmacyDB;
import java.sql.*;
public class PharmacyDatabase {
    public Connection con=null;
    public Statement stnt=null;
    public PreparedStatement pstmt=null;
    public ResultSet rst=null;
  public PharmacyDatabase (){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/pos","root","");
      }
      catch(ClassNotFoundException | SQLException e){
            System.out.println("Driver not loaded successfuly");
            System.out.println(e.getMessage()); 
      }
    }   
}
