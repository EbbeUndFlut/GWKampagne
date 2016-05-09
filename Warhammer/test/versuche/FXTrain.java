
package versuche;


import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Christian Peters <peters30kmh@gmail.com>
 */
public class FXTrain  extends Application{
    @Override
    public void start(Stage stage){
        
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.BLACK);
        
        Rectangle r = new Rectangle(25,25,250,250);
        r.setFill(Color.WHITESMOKE);
        root.getChildren().add(r);
        
        Circle c = new Circle(50, 50, 20, Color.CHOCOLATE);
        root.getChildren().add(c);
        
        TranslateTransition translate = new TranslateTransition(Duration.millis(7500));
        translate.setToX(390);
        translate.setToY(390);
        
        FillTransition fill = new FillTransition(Duration.millis(7500));
        fill.setToValue(Color.RED);
        
        RotateTransition rotate = new RotateTransition(Duration.millis(7500));
        rotate.setToAngle(360);
        
        ScaleTransition scale = new ScaleTransition(Duration.millis(7500));
        scale.setToX(0.1);
        scale.setToY(0.1);
        
        ParallelTransition transition = new ParallelTransition(c, translate, fill, rotate, scale);
        transition.setCycleCount(Timeline.INDEFINITE);
        transition.setAutoReverse(true);
        transition.play();
        
        FileChooser fileChooser = new FileChooser();
fileChooser.setTitle("Open Resource File");
fileChooser.showOpenDialog(stage);

        stage.setTitle("JavaFX Training");
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    public static void main(String[]args){
        launch(args);
    }


}
