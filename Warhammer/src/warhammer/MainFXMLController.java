/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammer;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 *
 * @author s13
 */
public class MainFXMLController implements Initializable {
    

    
    @FXML
    private Button armee;
    
    @FXML
    private Button optionen;
    
   
    
    @FXML
    private Button start;
    
    @FXML
    private void actionStart(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)start.getScene().getWindow();
        root=FXMLLoader.load(getClass().getResource("/KampStart/Start.fxml"));
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();       
    }
    
    @FXML
    private void actionBuilder(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)armee.getScene().getWindow();
        root=FXMLLoader.load(getClass().getResource("/Auswahl/VolksAuswahlFXML.fxml")); 
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
      @FXML
    private void actionOpt(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)optionen.getScene().getWindow();
        root=FXMLLoader.load(getClass().getResource("/Optionen/OptionenFXML.fxml"));
        Scene scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
     
    }
    @FXML
    private void closeAction(ActionEvent event){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
