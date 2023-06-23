/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaambulancias;

import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Point;
/**
 *
 * @author usuario1
 */
public class DirectorHospital extends CentroHospitalario {
    private ArrayList<Ambulancia> ambulanciasDisponibles;
    private ArrayList<LlamadaUrgencia> llamadasEmergencia;
    Scanner scanner = new Scanner(System.in);
    
    public DirectorHospital(){
        ambulanciasDisponibles = new ArrayList<>();
        llamadasEmergencia = new ArrayList<>();
    }
    
    @Override
    public void agregarLlamada() {
        System.out.print("Ingrese el ID de la llamada: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese la coordenada X: ");
        int coordenadaX = scanner.nextInt();
        System.out.print("Ingrese la coordenada Y: ");
        int coordenadaY = scanner.nextInt();
        LlamadaUrgencia llamada = new LlamadaUrgencia(id, coordenadaX, coordenadaY);
        llamadasEmergencia.add(llamada);
    }
    
    public Point conseguirCoordenadasAmbulancia() {
        System.out.print("Ingrese el ID de la ambulancia disponible más cercana: ");
        int id = scanner.nextInt();

        for (Ambulancia ambulancia : ambulanciasDisponibles) {
            if (id == ambulancia.getIdAmbulancia()) {
                System.out.println("La ambulancia se encuentra en (" + ambulancia.getCoordenadaX() + ", " + ambulancia.getCoordenadaY() + ")");
                return ambulancia.getCoordenadas(); // Salir del método después de encontrar la ambulancia
            }
        }

        System.out.println("No se encontró ninguna ambulancia con el ID proporcionado.");
        return null;
    }
    
    public void sistemaEmergencia ( ArrayList<Ambulancia> ambulanciasDisponibles, LlamadaUrgencia llamada){
        for (Ambulancia ambulancia : ambulanciasDisponibles){
            Point coordenadasA = ambulancia.getCoordenadas();
            Point coordenadasL = llamada.getCoordenadas();
            if(ambulancia.isDisponibilidad()){ //habilitado
                if ((float) Math.sqrt(Math.pow(coordenadasA.x - coordenadasL.x, 2) + Math.pow(coordenadasA.y - coordenadasL.y, 2)) < 150.0f) {
                    // Código a ejecutar si la distancia es menor a 150 Metros, cobertura del hospital
                    ambulancia.acudiendo();
                    
                    if(ambulancia.isDisponibilidad()){
                        ambulancia.confirmacion();
                    }else{
                        System.out.print("No se logró ayudar al paciente");
                    }   
                }
            }else{
            System.out.print("Esta fuera de la cobertura del hospital");
           }      
        }
    }

}
