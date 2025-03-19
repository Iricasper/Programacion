package com.mycompany.u1.e6;

public class PruebaVehiculo {

    public static void main(String[] args) {
        Vehiculo veh;
        veh = new Vehiculo();
        veh.setNumRuedas(4);
        veh.setPotencia(190);
        veh.setConsumoPorKm(3);
        veh.reponerCombustible(30);
        veh.arrancar();
        veh.recorrerDistancia(2);
        veh.imprimeAutonomiaEnKm();
        veh.imprimeLitrosEnDeposito();
        veh.imprimeNumRuedas();
        veh.imprimePotencia();
    }
}
