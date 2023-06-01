package com.vm.registro;
/*
  )
 (__
 _  )_
(_)_(_)                 - Cisco Huerta.
 (o o)
==\o/==


    * Build System : Maven.
    * JDK : Oracle OpenJDK Version 20.
    * IDE : Intellij
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Inventario");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}