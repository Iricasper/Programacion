package com.mycompany.u2.e16;
import java.util.Scanner;

public class PruebaNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Creamos las variable n (int, para el switch) y x(double, para las mates)
        int n;
        double x;
        
        //Le pedimos el numero al usuario
        System.out.println("Escoge un numero real");
        x = sc.nextDouble();
        //Mostramos el menu y le pedimos al usuario que escoja su opcion.
        System.out.println("MENU DE POTENCIAS");
        System.out.println("1 - Calcular el cuadrado");
        System.out.println("2 - Calcular el cubo");
        System.out.println("3 - Calcular la raiz cuadrada");
        System.out.print("Escoja una opcion: ");
        n = sc.nextInt();
        
        //Creamos el switch con las operaciones correspondientes.
        switch(n){
            case 1:
                System.out.println("El cuadrado de "+x+" es "+Math.pow(x, 2d));
                break;
            case 2:
                System.out.println("El cubo de "+x+" es "+Math.pow(x, 3d));
                break;
            case 3:
                System.out.println("La raiz cuadrada de "+x+" es "+Math.pow(x, 1/2d));
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
