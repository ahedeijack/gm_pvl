package Controller;

import Model.Producto;
import MySQL.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoCrudRepository {
    String sqlGetAll = "SELECT * FROM producto";
    List<Producto> productos = new ArrayList<>();

    //Database connection
    Conexion conn = Conexion.getInstance();

    Statement stmt = null;
    ResultSet rs = null;

    public List<Producto> getAll() throws SQLException {
        stmt = conn.getConexionBD().createStatement();
        rs = stmt.executeQuery(sqlGetAll);

        while(rs.next()) {
            System.out.println("");
            System.out.print(rs.getLong("id_prod") + " , ");
            System.out.print(rs.getString("nombre_prod") + " , ");
            System.out.print(rs.getLong("fk_marca") + " , ");
            System.out.print(rs.getLong("fk_categoria") + " , ");
            System.out.print(rs.getInt("existencias_prod") + " , ");
            System.out.print(rs.getString("codigo_prod") + " , ");
            System.out.print(rs.getDouble("precio_prod"));

            productos.add(new Producto(
                    rs.getLong("id_prod"),
                    rs.getString("nombre_prod"),
                    rs.getLong("fk_marca"),
                    rs.getLong("fk_categoria"),
                    rs.getInt("existencias_prod"),
                    rs.getString("codigo_prod"),
                    (double) rs.getFloat("precio_prod")));
        }

        stmt.close();
        rs.close();
        return productos;
    }
}
