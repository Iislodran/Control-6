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
public class Ambulancia extends CentroHospitalario{
    private int idAmbulancia;
    private int coordenadaX;
    private int coordenadaY;
    private boolean disponibilidad;
    
    public Ambulancia(int idAmbulancia, int coordenadaX, int coordenadaY, boolean disponibilidad){
        this.idAmbulancia = idAmbulancia;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.disponibilidad = disponibilidad;
    }
    
    public Ambulancia(){
    }

    public int getIdAmbulancia() {
        return idAmbulancia;
    }

    public void setIdAmbulancia(int idAmbulancia) {
        this.idAmbulancia = idAmbulancia;
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public Point getCoordenadas() {
        return new Point(coordenadaX, coordenadaY);
    }
    
    @Override
    public void acudiendo(){
        System.out.print("La ayuda va en camino");
    }
    
    @Override
    public void trasladando(){
        System.out.print("El paciente viene de regreso");
        disponibilidad = false;
    }
    
    @Override
    public void confirmacion(){
        System.out.print("Se recogió al paciente con exito");
        disponibilidad = true;
    }       
    
}