package com.mycompany.u2.e2;

public class Menu {
    
    /**
     * Representa el primer plato
     */
    public String primerPlato;
    
    /**
     * Representa el segundo plato
     */
    public String segundoPlato;
    
    /**
     * Representa el número de calorías
     */
    public int calorias;
    
    /**
     * Representa el precio del menú
     * 
     */
    public double precio;
    
    /**
     * Devuelve el valor del primer plato
     * @return 
     */
    public String getPrimerPlato(){
        return primerPlato;
    }
    
    /**
     * Devuelve el valor del segundo plato
     * @return 
     */
    public String getSegundoPlato(){
        return segundoPlato;
    }
    
    /**
     * Devuelve el valor de las calorías
     * @return 
     */
    public int getCalorias(){
        return calorias;
    }
    
    /**
     * Devuelve el valor del precio
     * @return 
     */
    public double getPrecio(){
        return precio;
    }
    
    /**
     * Permite modificar el nombre del plato principal
     * @param plato1 Cadena del primer plato
     */
    public void setPrimerPlato(String plato1){
        primerPlato = plato1;
    }
    
    /**
     * Permite modificar el nombre del segundo plato
     * @param plato2 Cadena del segundo plato
     */
    public void setSegundoPlato(String plato2){
        segundoPlato = plato2;
    }
    /**
     * Permite cambiar la cantidad de calorías
     * @param cal entero que representa las calorías
     */
    public void setCalorias(int cal){
        calorias = cal;
    }
    
    /**
     * Permit cambiar el precio del menú
     * @param nuevoPrecio numero real que representa el precio en euros
     */
    public void setPrecio (double nuevoPrecio){
        precio = nuevoPrecio;
    }
}
