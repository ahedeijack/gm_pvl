module com.gpomark.pvl.gpomarkpvl {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires mysql.connector.java;
    requires java.sql;
    requires java.desktop;

    opens com.gpomark.pvl.gpomarkpvl to javafx.fxml;
    exports com.gpomark.pvl.gpomarkpvl;
}