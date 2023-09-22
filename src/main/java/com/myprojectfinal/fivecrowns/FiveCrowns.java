/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myprojectfinal.fivecrowns;

import java.util.Scanner;


/**
 *
 * @author JesusOmar Leal
 */
public class FiveCrowns {
    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int opcion;
       /*
        Mano mano =new Mano(52);
        
       System.out.println(""+mano.toString());
        
       System.out.println("Juego="+Mano.generarCartasEnOrden());
        */
       
        System.out.println("1.Tomar Una Mano de Cartas");
        System.out.println("2.Salir");
        opcion=leer.nextInt();
        
        switch(opcion){
        
            case 1: Mano mano =new Mano(5);
                        
                    System.out.println(""+mano.getBaraja().toString());
                    break;
                  
            case 2: System.out.println("Adios!! c:");
                
                    break;
        
            default:
        
        }
        
    }
}
