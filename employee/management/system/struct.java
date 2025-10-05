package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.Class.forName;

public class struct {


    Connection connection;
    Statement statement;


    public struct() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem", "root", "Muskan.jain@21120");
            statement = connection.createStatement();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}