/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author User
 */
public class Nodo {
   public char dato;
    public Nodo siguiente;

    public Nodo(char dato) {
        this.dato = dato;
    }

    public Nodo(char dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
} 

