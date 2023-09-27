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

        Scanner leer = new Scanner(System.in);

        int opcion;

        do {

        System.out.println("1.Tomar Una Mano de Cartas");
        System.out.println("2.Salir");
        
        opcion = leer.nextInt();
        leer.nextLine();

            switch (opcion) {

                case 1:
                    int filtro;

                    Mano mano = new Mano(5);

                    Pila <Carta> barajaOriginal= mano.getBaraja();

                    Pila <Carta> barajaAux = new Pila<>();

                    do {
                        System.out.println("Baraja Actual:" + mano.getBaraja().toString());
                        System.out.println("Escoga lo que quiera filtrar");
                        System.out.println("1)Numero");
                        System.out.println("2)Palo");
                        System.out.println("3)Restablecer");
                        System.out.println("4)Salir");
                        filtro = leer.nextInt();
                        leer.nextLine();
                        switch (filtro) {

                            case 1:
                                System.out.println("Numeros=");
                                System.out.println("3,4,5,6,7,8,9,10,J,Q,K");

                                String numero = leer.nextLine();
                                numero = numero.toUpperCase();
                                mano.filtrarPorNumero(numero,barajaAux);

                                break;

                            case 2:
                                System.out.println("Palo=");
                                System.out.println("1)Trebol");
                                System.out.println("2)Picas");
                                System.out.println("3)Diamante");
                                System.out.println("4)Corazon");
                                System.out.println("5)Estrella");
                                System.out.println("6)Joker");

                                int palo = leer.nextInt();
                                leer.nextLine();
                                mano.filtrarPorPalo(palo,barajaAux);
                                break;

                            case 3: System.out.println("barajaAux:"+barajaAux);
                                    mano.setBaraja(barajaOriginal);
                                      break;

                                default: System.out.println("Numero fuera del menu");
                        }
                    } while (filtro != 4);
                    break;

                case 2:
                         System.out.println("Adios!! c:");

                    break;

                default: System.out.println("Numero fuera del menu");

            }
        } while (opcion != 2);
    }

}
