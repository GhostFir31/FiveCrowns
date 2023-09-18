/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myprojectfinal.fivecrowns;


/**
 *
 * @author JesusOmar Leal
 */
public class FiveCrowns {

    public static void main(String[] args) {
       
        Mano mano =new Mano(52);
        
       // System.out.println(""+mano.toString());
        
        System.out.println("Juego="+Mano.generarCartasEnOrden());
        
    }
}
