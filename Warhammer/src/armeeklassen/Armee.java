/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armeeklassen;

import java.util.ArrayList;

/**
 *
 * @author Christian Peters <peters30kmh@gmail.com>
 */
public class Armee {
    
    private String name;
    private int punkte;
    
    ArrayList<Einheiten> Einheiten;
    
    public Armee(String n, int points){
        name = n;
        punkte = points;
        Einheiten = new ArrayList<Einheiten>();
    }
}
