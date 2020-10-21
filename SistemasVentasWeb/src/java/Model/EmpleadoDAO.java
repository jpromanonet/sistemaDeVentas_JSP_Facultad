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
}
