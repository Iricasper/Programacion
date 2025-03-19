package com.mycompany.matriculas;

import java.util.Scanner;

public class Matriculas {

    public static void main(String[] args) {
        String[] listaMatriculas = {"5432-FNT", "9823-TRH", "3451-LPU", "1937-YHN", "8474-PMG", "8183-TGF", "0293-SDR"};
        Scanner sc = new Scanner (System.in);
        String matricula;
        boolean encontrado = false;
        
        System.out.print("Introduzca la matrícula: ");
        matricula = sc.nextLine();
        
        for (int i = 0; i < listaMatriculas.length; i++) {
            if (matricula.equals(listaMatriculas[i])) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Llama a la policía");
        } else {
            System.out.println("Matrícula no encontrada");
        }
    }
}
