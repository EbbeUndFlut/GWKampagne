/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optionen;

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
 * @author s01
 */
public class OptionenFXMLController implements Initializable {

 
    @FXML
    private Button back;
    
    
    @FXML
    private void actionBac(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)back.getScene().getWindow();
        root=FXMLLoader.load(getClass().getResource("/warhammer/MainFXML.fxml"));
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();   
        }
                
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
