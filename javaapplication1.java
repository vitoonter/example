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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        Funcion obj= new Funcion();
        System.out.println(obj.isprim(read.nextInt()));
    }
    
}

