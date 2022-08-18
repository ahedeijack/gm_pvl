package MySQL;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahedeijack
 */
public class Conexion {

    private Connection conexion = null;


    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/storage_pvl?autoReconnect=true&useSSL=false","root", "");
            JOptionPane.showMessageDialog(null, "Conexión Exitosa! ");

        }catch (ClassNotFoundException|SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion: "+ex.getMessage());
        }
        return conexion;
    }
    public void desconectar(){
        try{
            conexion.close();
            //JOptionPane.showMessageDialog(null,"Desconexion exitosa");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de desconexion"+ex.getMessage());
        }
    }

}

