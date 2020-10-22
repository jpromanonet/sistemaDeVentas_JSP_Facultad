/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jromano
 */
public class Conexion {
    Connection con;
    String url="jdbc:mariadb://localhost:3306/bd_ventas";
    String user="root";
    String pass="1234";
    public Connection Conexion(){
        try {
            Class.forName("com.mariadb.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException e){
        }
        return con;
    }
}