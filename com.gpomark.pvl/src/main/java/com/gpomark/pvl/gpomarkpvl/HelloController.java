package com.gpomark.pvl.gpomarkpvl;

import Controller.ProductoCrudRepository;
import Model.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;
    ProductoCrudRepository productoCrudRepository = new ProductoCrudRepository();
    List<Producto> productos;
    String nombre;

    private void getAllProducts() throws SQLException {
        productos = productoCrudRepository.getAll();
        nombre = productos.get(0).getNombre_prod();
    }

    @FXML
    protected void onHelloButtonClick() {
        try {
            getAllProducts();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        welcomeText.setText(nombre + "!");
    }
}