package com.gpomark.pvl.gpomarkpvl;

import MySQL.Conexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.sql.Connection;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(fxmlLoader.load(), dimension.getWidth()*0.9, dimension.getHeight()*0.9);
        stage.setTitle("Hello!");
        stage.setScene(scene);

//        Conexion con = Conexion.getInstance();
//        Connection conexion = con.getConexionBD();

        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}