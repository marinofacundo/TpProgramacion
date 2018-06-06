
import java.sql.Connection;
import java.sql.DriverManager;


import com.mysql.jdbc.Driver;
public class ConecBD {
	public void conectarBD(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
