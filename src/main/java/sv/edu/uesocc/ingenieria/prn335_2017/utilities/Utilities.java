/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.utilities;

import java.io.Serializable;
/**
 *
 * @author olmos
 */
public class Utilities implements Serializable {
    
    public String getResume(String texto) {
        if (texto != null && !texto.isEmpty() && texto.length() > 30) {
            return texto.substring(0, 30);
        } else {
            return texto;
        }
    }
    
    public String capitalizar(String texto) {
        if (texto != null && !texto.isEmpty()) {
            texto = texto.toLowerCase();
            texto = texto.replace("  ", " ");
            texto = texto.replace("  ", " ");
            String[] words = texto.split(" ");
            if (words.length > 0) {
                String salida = "";
                for (String word : words) {
                    if (word.length() > 0) {
                        salida += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
                    } else {
                        salida += word;
                    }
                    salida += " ";
                }
                return salida;
            }             
        }
        
        return texto;
    }
    
    public int contarCoincidencias(String frase, String texto) {
        int count = 0;
        
        if (frase != null && !frase.isEmpty() && texto != null && !texto.isEmpty()) {
            frase = frase.toLowerCase();
            texto = texto.toLowerCase();
            if (texto.contains(frase)) {
                count = texto.split(frase).length;
            }
        }
        
        return count;
    }
    
}
