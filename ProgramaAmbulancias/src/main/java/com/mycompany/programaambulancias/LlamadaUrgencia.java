/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaambulancias;

import java.awt.Point;

/**
 *
 * @author usuario1
 */
public class LlamadaUrgencia {
    private int idLlamada;
    private int coordenadaX;
    private int coordenadaY;
    
    public LlamadaUrgencia(int idLlamada, int coordenadaX, int coordenadaY){
        this.idLlamada = idLlamada;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    public LlamadaUrgencia(){
    }

    public int getIdLlamada() {
        return idLlamada;
    }

    public void setIdLlamada(int idLlamada) {
        this.idLlamada = idLlamada;
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    public Point getCoordenadas() {
        return new Point( coordenadaX, coordenadaY);
    }
    
}
