/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u2.e1;
import java.util.Scanner;
/**
 *
 * @author usuario24
 */
public class PruebaMenu {

    public static void main(String[] args) {
        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del primer plato:");
        m.setPrimerPlato(sc.nextLine());
        
        System.out.print("Introduce el nombre del segundo plato:");
        m.setSegundoPlato(sc.nextLine());
        
        System.out.print("Introduce el número de calorías:");
        m.setCalorias(sc.nextInt());
        
        System.out.print("Introduce el precio total:");
        m.setPrecio(sc.nextDouble());
        
        System.out.print("Su menu consiste en "+m.getPrimerPlato()+" y "+
                          m.getSegundoPlato()+". Son "+m.getCalorias()+" calorias"
                +" y cuesta "+m.getPrecio()+" euros.");
    }
}
