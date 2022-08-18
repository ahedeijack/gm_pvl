package MySQL;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String driver;
    String url;
    String user;
    String password;

    private static Conexion conexion = null; //Unica instancia de la clase
    private Connection conexionBD;

    private Conexion(){
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost/storage_pvl?autoReconnect=true&useSSL=false";
        user = "root";
        password = "12345";
        try {
            Class.forName(driver);
            conexionBD = (Connection) DriverManager.getConnection(url,user, password);
            JOptionPane.showMessageDialog(null, "Conexión Exitosa! ");
        }catch (ClassNotFoundException| SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion: "+ex.getMessage());
        }
    }

    public static Conexion getInstance(){
        if(conexion == null){
            conexion = new Conexion();
        }
        return conexion;
    }

    public Connection getConexionBD(){
        return conexionBD;
    }

    public void desconectar(){
        try{
            conexionBD.close();
            JOptionPane.showMessageDialog(null,"Desconexion exitosa");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error de desconexion"+ex.getMessage());
        }
    }


}

