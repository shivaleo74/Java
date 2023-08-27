import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception 
    {
            String url = "jdbc:mysql://localhost:3306/sakila";
        	String username = "root";
        	String password = "AwsPro$2023";
        	String sql = "Select * from sakila.student_master ";
        	
        	/* int student_id = 6;
        	String first_name = "janaki";
        	String last_name = "tanikella";
        	String insert_sql = "insert into sakila.student_master values( " + student_id + " , '" +  first_name  + "' , '" + last_name + "')";
        	out.println(insert_sql); */
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection con = DriverManager.getConnection(url, username, password);
        	
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery(sql);
        	/* rs.next(); */
        	System.out.println("---Rerieving Data...");
        	System.out.println("                      ");
        	
        	while(rs.next()) 
            {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
    }
}
