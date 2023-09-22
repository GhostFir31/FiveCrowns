package com.myprojectfinal.fivecrowns;

import java.util.ArrayList;

public class Pila<T> {

 ArrayList <T> pila;
 int tope;

    public Pila() {

        pila = new ArrayList<>();

        tope=-1;

    }

    public boolean estaVacia(){

     return pila.isEmpty();


    }

    public boolean pila_llena(){

     return pila.size() == tope;

    }
// puede haber un error en el diagrama hay T
    public T pop(){

        if(estaVacia()){
               System.out.println("SubDesbordamiento");

            }else{
                tope--;
                return pila.remove(pila.size()-1);
               

            }
        return null;
    }
    

    public void push(T dato){

        if(pila_llena()){

               System.out.println("Desbordamiento");

            }else{

                tope++;
                pila.add(dato);
    
            }

    }

    public T peek(){

        if(estaVacia()){

    System.out.println("SubDesbordamiento");
   
return null;
        }else{

       return pila.get(tope);
       
        }

    }

    @Override
    public String toString() {
        return  " " + pila;
    }


}