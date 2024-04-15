/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author pedro
 */
public class Transportes {

    public static void main(String[] args) {
        //crear un vehiculo terrestre
        
        VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Mattel","Terreneitor",4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor prr prr");
        VehiculoAereo vehiculoAereo=new VehiculoAereo("AeroMar","Presidencial",17);
        VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Rj29","vv",23);
        
        //Mostrar información de los vehiculos
        System.out.println("Información del vehiculo Terrestre");
        vehiculoTerrestre.mostrarInfo();
        System.out.println("Información del vehiculo Acuatico");
        vehiculoAcuatico.mostrarInfo();
        System.out.println("Información del vehiculo Aereo");
        vehiculoAereo.mostrarInfo();
        System.out.println("Información del vehiculo Espacial");
        vehiculoEspacial.mostrarInfo();
    }
}
