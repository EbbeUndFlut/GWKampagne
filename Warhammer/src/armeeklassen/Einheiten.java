/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armeeklassen;

/**
 *
 * @author Christian Peters <peters30kmh@gmail.com>
 */
public class Einheiten {
    /**
     * bezeichnung soll ein vom User individueller name sein
     * schlachtfeldRolle nimmt auf ob es ein HQ Standart Elite Sturm oder Unterstüzer ist
     */
    
    private String bezeichnung;
    private String name;
    private String schlachtfeldRolle;
    private int punktKosten;
    
    public Einheiten(String b, String n, String s, int p){
        bezeichnung = b;
        name = n;
        schlachtfeldRolle = s;
        punktKosten = p;
    }
    
}
