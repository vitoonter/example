/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author adms_ppis
 */
public class Funcion {

    /**
     * @param args the command line arguments
     */
    public boolean isprim(int var){
        
        for (int i = 2; i <= Math.sqrt((double)var); i++) {
            if(var%i==0){return false;}
        }
        return true;
    }
   
}
