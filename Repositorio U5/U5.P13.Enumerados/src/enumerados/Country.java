/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumerados;

/**
 * Aquí otro ejemplo en el que las constantes se acompañan de más valores
 */
public enum Country {
    // Constantes que invocan al constructor
    SP("Spain", "Spanish", 48000000), 
    EN("United Kingdom", "English", 67000000), 
    FR("France", "French", 68000000);
    
    // Propiedades constantes y públicas
    public final String country, language;
    public final int population;
    
    // Constructor privado
    private Country(String country, String language, int population) {
        this.country = country;
        this.language = language;
        this.population = population;
    }
    
    
}