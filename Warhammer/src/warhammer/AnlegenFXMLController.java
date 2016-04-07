/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import armeeklassen.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author s13
 */
public class AnlegenFXMLController implements Initializable {

   Armee army = new Armee("Blood Angels", 5000);
   Einheiten einheit;
   
   @FXML
   Label labl1;
   @FXML
   Label anzahl;
   
   @FXML
   Button undo;
   
   @FXML
   TextField einheitsname;
   
   @FXML
   public void undoAction(ActionEvent event){
       int zahl = army.Einheiten.size();
       if(zahl !=0){
           army.Einheiten.remove(zahl-1);
           
           labl1.setText(""+army.punkteRechner());
           anzahl.setText(""+army.Einheiten.size());
       }
   }
   
   @FXML
   public void addCaptain(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Captain", "HQ", 90);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
   
   @FXML
   public void addLibrarian(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Librarian", "HQ", 65);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
   @FXML
   public void addTechmarine(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Techmarine", "HQ", 65);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
   @FXML
   public void addChaplain(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Chaplain", "HQ", 90);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
   
   /**
    * Methoden zum hinzufügn der Standarteinheiten
    */
   
   @FXML
   public void addTactical(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Tactical Squad", "Standart", 70);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
   @FXML
   public void addScoutSquad(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Scout Squad", "Standart", 55);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
   @FXML
   public void addCrusader(ActionEvent event){
       int lenght = einheitsname.getLength();
       if (lenght>0){
           einheit = new Einheiten(einheitsname.getText(), "Crusader Squad", "Standart", 70);
           army.Einheiten.add(einheit);
           
           labl1.setText(""+army.punkteRechner());
           einheitsname.setText("");
           einheitsname.setPromptText("Einheitsname");
           anzahl.setText(""+army.Einheiten.size());
           
           
       }
       else{
          einheitsname.setPromptText("HIER NAMEN EINGEBEN");
       }
   }
    @FXML
    public void listenAction(){
        System.out.print("Läuft");  
        //labl1.setText(""+army.getPunkte());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      labl1.setText(""+army.getPunkte());
      anzahl.setText("0");
    }    
    
}
