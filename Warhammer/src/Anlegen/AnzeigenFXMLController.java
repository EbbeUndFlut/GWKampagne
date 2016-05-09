/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anlegen;

import armeeklassen.Armee;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Christian Peters <peters30kmh@gmail.com>
 */
public class AnzeigenFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    Label armee;
    @FXML
    Label anzal;
    
    @FXML
    public void loadAction(ActionEvent event){
        try{
        FileInputStream fileStream = new FileInputStream("amry.ser");
        ObjectInputStream os = new ObjectInputStream(fileStream);
        Object eins = os.readObject();
        Armee army = (Armee) eins;
        os.close();
        armee.setText(army.getName());
        anzal.setText(""+army.Einheiten.size());
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
