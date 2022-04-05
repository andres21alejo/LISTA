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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static Lista lista = new Lista();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        boolean salir = false;
        int eleccion;
        
        while (!salir){
            System.out.println("\n\n---------------------------");
            System.out.println("\nSeleccione qué desea hacer");
            System.out.println("\n1. Añadir al inicio\n2 Agregar de ultimo\n3 Enseñar \n4 Borrar el Primero"
                    + "\n5 Borrar el ultimo \n6 Borrar Elemento Seleccionado \n7 Buscar \n8 Salir");
            eleccion  = sc.nextInt();
            
            switch (eleccion){
                case 1: AñadiralPrincipio();
                        break;
                case 2: añadirAlFinal();
                        break;
                case 3: lista.mostrarLista();
                        break;
                case 4: System.out.println("elemento eliminado: [" + lista.borrarInicio() + "]");
                        break;
                case 5: System.out.println("elemento eliminado: [" + lista.borrarFinal() + "]");
                        break;
                case 6: System.out.println("elemento eliminado: [" + lista.borrarSeleccion() + "]");
                        break;
                case 7: System.out.println("Elemento encontrado: [" + lista.buscarElemento() + "]");
                        break;
                case 8: salir = true;
                        break;
                case 9: default: System.out.println("La opción que seleccionó no"
                        + " existe, seleccione otra");
                        break;
            }
        }
    }
    
    public static void AñadiralPrincipio(){
        char elemento=0;
        System.out.println("Escriba el Elemento que va añadir");
        elemento = sc.next().charAt(elemento);
        lista.AgregarInicio(elemento);
    }
    
    public static void añadirAlFinal(){
        char elemento = 0;
        System.out.println("Escriba el Elemento que va añadir");
        elemento = sc.next().charAt(elemento);
        lista.AgregarFinal(elemento);
    }
}
