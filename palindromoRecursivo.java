/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.recursion;

/**
 *
 * @author Ariadna Yenisey
 */
public class palindromoRecursivo {
    //este es el metodo privado en el que se hace la recursividad
    private boolean esPalindromoAux(String cadena, int inicio, int fin){
        
        if(inicio>=fin){// Caso base: si los índices se cruzan o se encuentran
            return true;
        }
        if (cadena.charAt(inicio) != cadena.charAt(fin)){// Si los caracteres de los extremos son distintos, no puede ser palindromo
        return false;
        }
        //Caso recursivo: si los extremos coinciden, entonces se revisa la parte
        // interna de la cadena avanzando un índice por la izquierda y
        // retrocediendo uno por la derecha.
        return esPalindromoAux(cadena, inicio + 1, fin - 1);
    }
    //metodo publico de validacion, valida la entrada y si es verdadero llama al
    //metodo esPalindromoAux
    public boolean esPalindromo(String cadena){
        if(cadena==null ||(cadena.isEmpty())){
            return false;
         } 
        else {
        return esPalindromoAux(cadena.toLowerCase(), 0, cadena.length() - 1);
        }           
    }
}
