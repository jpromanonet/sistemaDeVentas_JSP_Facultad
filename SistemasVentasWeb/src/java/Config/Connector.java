package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_ventas";
    String user="root";
    String pass="";
    public Connection Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e){
        }
        return con;
    }
}
