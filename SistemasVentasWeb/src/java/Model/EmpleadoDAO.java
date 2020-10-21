package Model;

import Config.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpleadoDAO {
    Connector cn=new Connector();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado validar(String user, String dni){
        Empleado em;
        em = new Empleado();
        
        String sql = "SELECT * FROM empleado WHERE User=? AND Dni=?";
        try{
            
        } catch(Exception e){
        }
        return em;
    }
}
