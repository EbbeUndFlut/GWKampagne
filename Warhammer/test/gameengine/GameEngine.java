/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/**
 *
 * @author s13
 */
public class GameEngine extends Application{
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage theStage){
        theStage.setTitle("Engine Test");
        
        boolean aktiv = false;
        
        Circle shiff;
        Group root = new Group();
        Canvas canvas = new Canvas(1080,720);
        Scene theScene = new Scene(root,1080,720,Color.BLACK);
        Image planet = new Image("/img/planetOne.png");
        Image planetA = new Image("/img/planetTwo.png");
        Image shipOne = new Image("/img/shipOne.png");
        root.getChildren().add(canvas);
        
        ArrayList<Planets>planeten = new ArrayList<Planets>();
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Ships shipOnes = new Ships(10,400,shipOne);
        
        Planets planetOne = new Planets(500,600,planet);
        Planets planetTwo = new Planets(300,300,planetA);
        Planets planetThree = new Planets(900,500,planetA);
        planeten.add(planetOne);
        planeten.add(planetTwo);
        planeten.add(planetThree);
        //gc.drawImage(planet,500,100);
        //planetOne.render(gc);
        
        shipOnes.render(gc);
        
        for(Planets a : planeten){
            a.render(gc);
        }
        
        theStage.setScene(theScene);
        theScene.setOnMouseClicked(
        new EventHandler<MouseEvent>()
                {
                    public void handle(MouseEvent e)
                    {
                        System.out.println(""+ e.getX()+ "\n"+ e.getY());
                        shipOnes.setX(e.getX()-32, e.getY()-32);
                    }
                });
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                gc.clearRect(0, 0, 1080,720);
                double velocity = -0.5;
                double x = shipOnes.getX()+shipOnes.getVelocity();//5*Math.sin(currentNanoTime);
                if(shipOnes.getX()>=1020){
                    shipOnes.setVelocity(-1);
                }
                if(shipOnes.getX()==0)
                {
                    shipOnes.setVelocity(1);
                }

                double y = shipOnes.getY();//+0.5;//*Math.cos(currentNanoTime);
                shipOnes.setX(x, y);
        
            for(Planets a : planeten){
                a.render(gc);
            }
            shipOnes.render(gc);
                }
        }.start();
        theStage.show();
    
    }
    
}
