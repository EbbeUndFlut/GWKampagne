/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versuche;

/**
 *
 * @author s13
 */
public class zeitrechner {
    public static void main(String[] args){
        
        long time = System.currentTimeMillis();
        
        System.out.println(time);
        time = time/1000;
        System.out.println(time);
        time = time/60;
        System.out.println(time);
        
        time = time/60;
        
        System.out.println(time +"h");
    }
}
