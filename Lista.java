/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lista {
    protected Nodo Primero, Ultimo;
    static Scanner sc = new Scanner(System.in);
    public Lista() {
    Primero=null;
    Ultimo=null;
    }
    public boolean estaVacia(){
	if(this.Primero == null){
		return true;
        }
	return false;
    }
    public void AgregarInicio(char elemento){
        Primero = new Nodo(elemento, Primero);
        if (Ultimo == null){
            Ultimo = Primero;
        }
    }
    public void AgregarFinal(char elemento){

    if(!estaVacia()){

	this.Ultimo.siguiente = new Nodo(elemento);
	this.Ultimo = this.Ultimo.siguiente;

    } else {

	 Primero = Ultimo = new Nodo(elemento);
        }
}
     public void mostrarLista(){
        Nodo aux = Primero;
        while(aux != null){
            if(aux.siguiente == null){
                System.out.print("[" + aux.dato + "]->Null");
            }else{
                System.out.print("[" + aux.dato + "]->");
            }
            aux = aux.siguiente;
        }
      }
 
    public char borrarInicio(){
    	char elemento = this.Primero.dato;
	if(this.Primero == this.Ultimo){
		this.Primero = this.Ultimo = null;

	}else{
		this.Primero=this.Primero.siguiente;
	}
	return elemento;     
    }
    public char borrarFinal(){

	char elemento = this.Ultimo.dato;
	if (this.Primero==this.Ultimo){
		this.Primero = this.Ultimo = null;
	}else{
		Nodo Temporal = Primero;
		while(Temporal.siguiente !=this.Ultimo){
			Temporal = Temporal.siguiente;
		}
		this.Ultimo = Temporal;
		this.Ultimo.siguiente=null;
	}
	
	return elemento;
}
    
    public char borrarSeleccion(){
        char elemento = 0;
        
        
        if(!estaVacia()){
            System.out.println("Escriba el elemento que desea eliminar");
            elemento = sc.next().charAt(elemento);
            if(this.Primero==this.Ultimo && this.Primero.dato == elemento){
                this.Primero=this.Ultimo=null;
            } else if (this.Primero.dato == elemento) {
                this.Primero = this.Primero.siguiente;
            } else{
                Nodo anterior, temporal;
                anterior =this.Primero;
                temporal = this.Primero.siguiente;
                
                while (temporal != null && temporal.dato != elemento){
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal !=null){
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == this.Ultimo){
                        this.Ultimo = anterior;
                    }
                }
                
            }
        }else{
            System.out.println("No se eliminó nada");
        }
        return elemento;
    }
    
    public char buscarElemento(){
        char elemento = 0;
	System.out.println("Escriba el elemento que desea buscar");
        elemento = sc.next().charAt(elemento);
        
        boolean encontrado = false;	
	Nodo aux = Primero;
	while (aux !=null){
		if(aux.dato == elemento){
                    System.out.println("Dato encontrado: [" + aux.dato + "]");
			encontrado = true;
			break;
		}
	aux=aux.siguiente;
	}
	
	if(encontrado==false){
	System.out.println("No se encontró el elemento: [" + elemento + "]");
        }
        return elemento;
    }
} 

