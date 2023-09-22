/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myprojectfinal.fivecrowns;

import static com.myprojectfinal.fivecrowns.Mano.generarNCartas;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author omarleal
 */
public class Deck {
    
   private Pila<Carta> deck = new Pila<>();
    
   public Deck(){
   
   deck= generarDeck();
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

   
  public static ArrayList<Carta> generarDeck() {
      
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

        for (int aleatorioFigura = 1; aleatorioFigura <= 6; aleatorioFigura++) {
           for(int aleatorioNumero=1;aleatorioNumero<=11;aleatorioNumero++){
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
                    carta =new Carta(figuras.get(6), colores.get(6), numeros.get(12));
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
}
