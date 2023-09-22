package com.myprojectfinal.fivecrowns;

import java.util.HashMap;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JesusOmar Leal
 */

public class Carta {

    private String figura;
    private String color;
    private String numero;

    public Carta(String figura, String color, String numero) {
        this.figura = figura;
        this.color = color;
        this.numero = numero;
    }

     public static Carta generarCartaAleatoria() {

        int aleatorioFigura;
        int aleatorioNumero;

        Random numeroAleatorio = new Random();

        HashMap<Integer, String> figuras = new HashMap<>();

        figuras.put(1, "Trebol");
        figuras.put(2, "Picas");
        figuras.put(3, "Diamante");
        figuras.put(4, "Corazon");
        figuras.put(5, "Estrella");
        figuras.put(6, "Joker");

        HashMap<Integer, String> colores = new HashMap<>();

        colores.put(1, "Rojo");
        colores.put(2, "Negro");
        colores.put(3, "Amarillo");
        colores.put(4, "Azul");
        colores.put(5, "Verde");
        colores.put(6, " -----");

        HashMap<Integer, String> numeros = new HashMap<>();

      //  numeros.put(1, "A");
      // numeros.put(2, "2");
        numeros.put(1, "3");
        numeros.put(2, "4");
        numeros.put(3, "5");
        numeros.put(4, "6");
        numeros.put(5, "7");
        numeros.put(6, "8");
        numeros.put(7, "9");
        numeros.put(8, "10");
        numeros.put(9, "J");
        numeros.put(10, "Q");
        numeros.put(11, "K");
        numeros.put(12, "----- ");

        aleatorioNumero = numeroAleatorio.nextInt(12) + 1;
        aleatorioFigura = numeroAleatorio.nextInt(4) + 1;

        //Si el valor del numero es 14 regresa un joker
        if (aleatorioNumero == 12) {

            return new Carta(figuras.get(6), colores.get(6), numeros.get(12));

            //De otra manera empieza a escoger el palo y numero de la carta
        } else {

            switch (aleatorioFigura) {
                //Si la figura es Trebol regresa un Trebol Verde el numero se genera Aleatoriamente.
                case 1:
                    return new Carta(figuras.get(aleatorioFigura), colores.get(5), numeros.get(aleatorioNumero));
                //Si la figura es Picas regresa un Picas Negro el numero se genera Aleatoriamente.
                case 2:
                    return new Carta(figuras.get(aleatorioFigura), colores.get(2), numeros.get(aleatorioNumero));
                //Si la figura es Diamante regresa un Diamante Azul el numero se genera Aleatoriamente.
                case 3:
                    return new Carta(figuras.get(aleatorioFigura), colores.get(4), numeros.get(aleatorioNumero));
                //Si la figura es Corazon regresa un Corazon Rojo el numero se genera Aleatoriamente.
                case 4:
                    return new Carta(figuras.get(aleatorioFigura), colores.get(1), numeros.get(aleatorioNumero));
                //Si la figura es Estrella regresa un Estrella Amarilla el numero se genera Aleatoriamente.
                case 5:
                    return new Carta(figuras.get(aleatorioFigura), colores.get(3), numeros.get(aleatorioNumero));

                default:
                    break;
            }

        }
        return null;

    }

    public String getFigura() {
        return this.figura;
    }

    public String getColor() {
        return this.color;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return " "+ numero + " " + figura + " " + color;
    }

}
