import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        StudentADO dao = new StudentADO();
        Student s1 = dao.getStudent(1);
        System.out.println(s1.sname);

    }
}

class StudentADO
{
    public Student getStudent(int rollno)
    {
        try
        {
            Student s = new Student();
            s.rollno = rollno;
            String sql = "Select * from sakila.student_master where student_id = " + rollno;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "AwsPro$2023");
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String fname = rs.getString(2);
            s.sname = fname;
            return s;
        }
        catch(Exception e)
        {
            // Logger.getLogger(StudentADO.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
        }
        return null;        
    }
}

class Student
{
    int rollno;
    String sname;
}
