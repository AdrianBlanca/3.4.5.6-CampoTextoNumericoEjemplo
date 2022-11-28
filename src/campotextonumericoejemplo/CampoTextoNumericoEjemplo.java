/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package campotextonumericoejemplo;

import componentes_blancaadrian.CampoTextoNumerico;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class CampoTextoNumericoEjemplo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        CampoTextoNumerico campoTextoNumerico = new CampoTextoNumerico();
        
        Stage stage = new Stage();
        Pane pane = new Pane();
        pane.getChildren().add(campoTextoNumerico);
        stage.setScene(new Scene(pane));
        stage.setTitle("CampoTextoNumerico");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
