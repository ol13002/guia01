/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017;

import sv.edu.uesocc.ingenieria.prn335_2017.utilities.Utilities;

/**
 *
 * @author olmos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto1 = "hola amigos  hola amigos como estan :D HOLA";
        String frase1 = "hola";
        Utilities utilities = new Utilities();
        System.out.println("getResume:");
        System.out.println(utilities.getResume(texto1));
        System.out.println("capitalizar:");
        System.out.println(utilities.capitalizar(texto1));
        System.out.println("contarCoincidencias:");
        System.out.println(utilities.contarCoincidencias(frase1, texto1));
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println("getResume:");
        System.out.println(utilities.getResume(null));
        System.out.println("capitalizar:");
        System.out.println(utilities.capitalizar(null));
        System.out.println("contarCoincidencias:");
        System.out.println(utilities.contarCoincidencias(null, null));
        
        System.out.println("------------------------------------------------------------");
        
        System.out.println("getResume:");
        System.out.println(utilities.getResume(" "));
        System.out.println("capitalizar:");
        System.out.println(utilities.capitalizar(" "));
        System.out.println("contarCoincidencias:");
        System.out.println(utilities.contarCoincidencias("hola", " "));
        
        System.out.println("------------------------------------------------------------");
    }
    
}
