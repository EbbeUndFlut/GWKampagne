/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anlegen;

import armeeklassen.Armee;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    AnchorPane haupt;
    @FXML
    Button buts;
    @FXML
    Label armee;
    @FXML
    Label anzal;
    File armySave = new File("C:\\Users\\Christian\\Documents\\NetBeansProjects\\GWKampagne\\Warhammer\\src\\saveGames");
    
    @FXML
    public void loadAction(ActionEvent event) throws IOException{
        Stage stage;
        Parent root;
        stage=(Stage)buts.getScene().getWindow();
        //root=FXMLLoader.load(getClass().getResource("/Optionen/OptionenFXML.fxml"));
        root=FXMLLoader.load(getClass().getResource("/Anlegen/AnzeigenFXML.fxml"));
        try{
        FileInputStream fileStream = new FileInputStream("C:\\Users\\Christian\\Documents\\NetBeansProjects\\GWKampagne\\Warhammer\\src\\saveGames\\amry.ser");
        ObjectInputStream os = new ObjectInputStream(fileStream);
        Object eins = os.readObject();
        Armee army = (Armee) eins;
        os.close();
        armee.setText(army.getName());
        anzal.setText(""+army.Einheiten.size());
        
        
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        /**
         * Versuch um Buttons zur Laufzeit zu erstellen
         * im File[] werden die Pfade zu den gespeicherten Listen gespichert
         * im String[] werden die Dateinamen gespeichert
         * Die dateinamen sollen als Button Text dienen
        */
        */
        System.out.println(armySave.exists());
        File[] daten = armySave.listFiles();
        String[] dat = armySave.list();
        int i = 0;
        int x = 300;
        int y = 150;
        for(File f:daten){
            Button knop = new Button(dat[i]);
            knop.setLayoutX(x);
            knop.setLayoutY(y);
            haupt.getChildren().add(knop);
            i++;
            y +=30;
            
            
            
            System.out.println(f);}
        for(String s:dat){System.out.println(s);}
        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
