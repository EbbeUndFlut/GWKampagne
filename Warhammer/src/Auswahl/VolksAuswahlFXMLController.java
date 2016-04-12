/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auswahl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author s13
 */
public class VolksAuswahlFXMLController implements Initializable {

    @FXML
    Button back;
    @FXML
    Button next;
    
    @FXML
    public void backAction(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)back.getScene().getWindow();
        root=FXMLLoader.load(getClass().getResource("/warhammer/MainFXML.fxml"));
        
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
     @FXML
    public void nextAction(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)next.getScene().getWindow();
        root=FXMLLoader.load(getClass().getResource("/Anlegen/AnlegenFXML.fxml"));
        
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
