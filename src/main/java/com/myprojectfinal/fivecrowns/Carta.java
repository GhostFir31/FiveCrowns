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
