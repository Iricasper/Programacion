package com.mycompany.u2.extra4.matriculaspoli;

import java.util.Scanner;

public class PruebaMatriculasPoli {

    public static void main(String[] args) {
        // Creamos un array de tipo String para registrar las matrículas
        String[] array = new String[7];

        // Registramos las matrículas en el array
        array[0] = "5432-FNT";
        array[1] = "9823-TRH";
        array[2] = "3451-LPU";
        array[3] = "1937-YHN";
        array[4] = "8474-PMG";
        array[5] = "8183-TGF";
        array[6] = "0293-SDR";

        // Le pedimos al usuario que introduzca qué matrícula buscar
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una matricula: ");
        String busqueda = sc.nextLine();

        // Recorremos el bucle buscando que coincidan,
        // para ello usaremos un marcador
        boolean marcador = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(busqueda)) {
                marcador = true;
                break;
            }
        }

        // Imprimiremos el resultado, dependiendo de lo que nos diga el marcador
        if (marcador) {
            System.out.println("Llama a la poli");
        } else {
            System.out.println("Matricula no encontrada");
        }
    }
}