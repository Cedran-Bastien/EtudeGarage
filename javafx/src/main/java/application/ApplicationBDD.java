package application;

import Vue.VuParametre;

import Vue.Vue;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Time;
import java.util.Timer;

public class ApplicationBDD extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Vue vue = new Vue(VuParametre.INDICE_LISTE_VEHICULE);
        vue.setPadding(new Insets(10));
        Scene scene = new Scene(vue);

        stage.setTitle("OJDBC Project");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}