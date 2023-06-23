/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaambulancias;

import java.util.ArrayList;

/**
 *
 * @author usuario1
 */
public abstract class CentroHospitalario implements ConfirmacionUrgencia{
    
    ArrayList <Ambulancia> ambulanciasDisponibles = new ArrayList<>();
    ArrayList <LlamadaUrgencia> llamadasEmergencia = new ArrayList<>();

    public void agregarLlamada(){
    }
    
    public void conseguirCoordenadas(){
    }
    
    @Override
    public void acudiendo(){
    }
    
    @Override
    public void trasladando(){
    }

    @Override
    public void confirmacion(){
    }    
    
}




