package gameplay;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s13
 */
public class TestMainClass extends Application {
    
    
    public void start(Stage theStage) 
{
    theStage.setTitle( "Timeline Example" );
 
    Group root = new Group();
    Scene theScene = new Scene( root );
    theStage.setScene( theScene );
 
    Canvas canvas = new Canvas( 1024, 1024 );
    Canvas layer2 = new Canvas(1024,1024);
            
    root.getChildren().add( canvas );
    root.getChildren().add(layer2);
 
    GraphicsContext gc = canvas.getGraphicsContext2D();
    GraphicsContext l2 = layer2.getGraphicsContext2D();
 
    Image earth = new Image( "/img/world.png" );
    Image sun   = new Image( "/img/Sun.png" );
    Image sun2   = new Image( "/img/Sun2.png" );
    Image space = new Image( "/img/space-04.jpg" );
    Image ship = new Image ("/img/ChaosShip.png");
    Image ship2 = new Image ("/img/imperialShip.png");
    
    
 
    final long startNanoTime = System.nanoTime();
 
    new AnimationTimer()
    {
        @Override
        public void handle(long currentNanoTime)
        {
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
           
            double x = 350 + 200 * Math.cos(t/15);
            double y = 350+ 200 * Math.sin(t/15);
            double xa = 180 + 10 * Math.cos(t/2);
            double ya = 232 + 10 * Math.sin(t/2);
            double xb = 50 + 10 * Math.sin(t/2);
            double yb = 50 ;
            
            
            
           
           // l2.rotate(5.0* Math.sin(t/15));
 
            // background image clears canvas
            gc.drawImage( space, 0, 0 );
            gc.drawImage( earth, x, y );
            gc.drawImage( sun, 196, 150 );
            //l2.drawImage( sun2, 196, 150 );
            gc.drawImage( ship, xa, ya);
            gc.drawImage( ship2, xb, yb);
            
        }
    }.start();
 
    theStage.show();
}
    public static void main(String[] args) {
        launch(args);
    
}
}
