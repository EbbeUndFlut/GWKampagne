/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplay;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author s13
 */
public class Planet {
    
    private Image image;
    private double positionX;
    private double positionY;
    
    public Planet(Image image, double positionX, double positionY){
        
        this.image=image;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public void update(double t){
        this.positionX += 30 * Math.sin(t);
        this.positionY += 30 * Math.cos(t);
    }
    
    public void render(GraphicsContext gc){
        gc.drawImage( this.image, this.positionX, this.positionY);
    }
}
