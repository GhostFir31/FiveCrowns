/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myprojectfinal.fivecrowns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author JesusOmar Leal
 */
public class Mano {

    private Pila<Carta> baraja = new Pila<>();

    public Mano(int tamañoMano) {

        baraja = generarNCartas(tamañoMano);

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

        numeros.put(1, "A");
        numeros.put(2, "2");
        numeros.put(3, "3");
        numeros.put(4, "4");
        numeros.put(5, "5");
        numeros.put(6, "6");
        numeros.put(7, "7");
        numeros.put(8, "8");
        numeros.put(9, "9");
        numeros.put(10, "10");
        numeros.put(11, "J");
        numeros.put(12, "Q");
        numeros.put(13, "K");
        numeros.put(14, "----- ");

        aleatorioNumero = numeroAleatorio.nextInt(14) + 1;
        aleatorioFigura = numeroAleatorio.nextInt(4) + 1;

        //Si el valor del numero es 14 regresa un joker
        if (aleatorioNumero == 14) {

            return new Carta(figuras.get(6), colores.get(6), numeros.get(14));

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

    public static Pila<Carta> generarNCartas(int numeroCartas) {

        Pila<Carta> baraja = new Pila<>();
        int jokers = 0;
        if (numeroCartas <= 0) {
            throw new IllegalArgumentException("No se pueden generar 0 cartas.");
        }

        ArrayList<String> cartasGeneradas = new ArrayList<>();

        while (cartasGeneradas.size() < numeroCartas) {

            Carta carta = generarCartaAleatoria();

            String cartaString = carta.getFigura() + carta.getColor() + carta.getNumero();

            if (!cartasGeneradas.contains(cartaString)) {

                cartasGeneradas.add(cartaString);
                baraja.push(carta);

            } else if ("Joker".equals(carta.getFigura()) && jokers < 2) {

                cartasGeneradas.add(cartaString);
                baraja.push(carta);
                jokers++;
            }
        }

        return baraja;
    }

    public static ArrayList<Carta> generarCartasEnOrden() {
        ArrayList<Carta> juego = new ArrayList<>();
        Carta carta;
        int jokers=0;
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
        numeros.put(1, "A");
        numeros.put(2, "2");
        numeros.put(3, "3");
        numeros.put(4, "4");
        numeros.put(5, "5");
        numeros.put(6, "6");
        numeros.put(7, "7");
        numeros.put(8, "8");
        numeros.put(9, "9");
        numeros.put(10, "10");
        numeros.put(11, "J");
        numeros.put(12, "Q");
        numeros.put(13, "K");
        numeros.put(14, "-----");

        for (int aleatorioFigura = 1; aleatorioFigura <= 6; aleatorioFigura++) {
           for(int aleatorioNumero=1;aleatorioNumero<=13;aleatorioNumero++){
            switch (aleatorioFigura) {
                //Si la figura es Trebol regresa un Trebol Verde el numero se genera Aleatoriamente.
                case 1:
                    carta = new Carta(figuras.get(aleatorioFigura), colores.get(5), numeros.get(aleatorioNumero));
                    juego.add(carta);
                    break;
                //Si la figura es Picas regresa un Picas Negro el numero se genera Aleatoriamente.
                case 2:
                    carta =new Carta(figuras.get(aleatorioFigura), colores.get(2), numeros.get(aleatorioNumero));
                    juego.add(carta);
                    break;
                //Si la figura es Diamante regresa un Diamante Azul el numero se genera Aleatoriamente.
                case 3:
                    carta =new Carta(figuras.get(aleatorioFigura), colores.get(4), numeros.get(aleatorioNumero));
                    juego.add(carta);
                    break;
                //Si la figura es Corazon regresa un Corazon Rojo el numero se genera Aleatoriamente.
                case 4:
                    carta =new Carta(figuras.get(aleatorioFigura), colores.get(1), numeros.get(aleatorioNumero));
                    juego.add(carta);
                    break;
                //Si la figura es Estrella regresa un Estrella Amarilla el numero se genera Aleatoriamente.
                case 5:
                    carta =new Carta(figuras.get(aleatorioFigura), colores.get(3), numeros.get(aleatorioNumero));
                    juego.add(carta);
                    break;
                case 6:if(jokers<=2){
                    carta =new Carta(figuras.get(6), colores.get(6), numeros.get(14));
                    juego.add(carta);
                    jokers++;
                             }
                    break;
                default:

            }
           }
        }
        return juego;
    }

    @Override
    public String toString() {
        return "Baraja=" + baraja + "";
    }

}
