/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.josuemarroquin.system;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Josué Daniel Marroquín Hernández <jmarroquin-2020296@kinal.edu.gt>
 * @date 5 may. 2021
 * @time 17:28:56
 * Codigo Tecnico:  IN5BV 
 * Carnet: 2020296
 */
public class Principal  extends Application{

    public static void main(String[] args) {
        launch(args);
    }
        @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/josuemarroquin/view/MenuPrincipalView.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.getIcons().add(new Image("/org/josuemarroquin/resource/images/KINAL-MALL-LOGO.png"));
        stage.show();
    }
}
