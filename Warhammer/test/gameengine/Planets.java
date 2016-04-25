/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author s13
 */
public class Planets {
    int positionX;
    int positionY;
    Image bild;
    
    public Planets(int x, int y, Image image){
        positionX=x;
        positionY=y;
        bild=image;
    }
    
    public void render(GraphicsContext gc){
        gc.drawImage(bild,positionX,positionY);
    }
}
