/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u1.e6;

/**
 *
 * @author XxLok
 */
public class PruebaVehiculo2 {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        //Vehículo 1
        v1.setNumRuedas(4);
        v1.setPotencia(100);
        v1.setConsumoPorKm(0.06);
        v1.reponerCombustible(30);
        v1.arrancar();
        v1.recorrerDistancia(100);
        v1.apagar();
        v1.arrancar();
        v1.recorrerDistancia(200);
        v1.imprimeAutonomiaEnKm();
        v1.imprimeKmRecorridos();
        v1.imprimeLitrosEnDeposito();
        v1.imprimeNumRuedas();
        v1.imprimePotencia();
        //Vehículo 2
        v2.setNumRuedas(2);
        v2.setPotencia(80);
        v2.setConsumoPorKm(0.02);
        v2.reponerCombustible(20);
        v2.arrancar();
        v2.recorrerDistancia(220);
        v2.apagar();
        v2.arrancar();
        v2.recorrerDistancia(120);
        v2.imprimeAutonomiaEnKm();
        v2.imprimeKmRecorridos();
        v2.imprimeLitrosEnDeposito();
        v2.imprimeNumRuedas();
        v2.imprimePotencia();
    }
}