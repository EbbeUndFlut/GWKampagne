/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Circle;

/**
 *
 * @author s13
 */
public class Ships {
    double positionX;
    double positionY;
    double velocity=1;
    int transportKapazität;
    int height;
    int width;
    Image bild;
    
    public Ships(double x, double y, Image b){
        positionX = x;
        positionY = y;
        bild = b;
        Circle circle;
    }
    
    public void render(GraphicsContext gc){
        gc.drawImage(bild,positionX,positionY);
    }
    public Circle pressAble(){
        return new Circle(positionX,positionY,50);
    }
    public void setX(double x,double y){
        positionX =  x;
        positionY = y;
        
    }
    public double getX(){
        return positionX;
    }
    public double getY(){
        return positionY;
    }
    
    public void setVelocity(double v){
        velocity = v;
    }
    
    public double getVelocity(){
        
        return velocity;
    }
}
