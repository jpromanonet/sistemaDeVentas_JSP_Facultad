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
            con = cn.Connector();
            ps = con.prepareCall(sql);
            ps.setString(1, user);
            ps.setString(2, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                em.setId(rs.getInt("IdEmpleado"));
                em.setUser(rs.getString("User"));
                em.setDni(rs.getString("Dni"));
                em.setNom(rs.getString("Nombres"));
            }
        } catch(Exception e){
        }
        return em;
    }
}
