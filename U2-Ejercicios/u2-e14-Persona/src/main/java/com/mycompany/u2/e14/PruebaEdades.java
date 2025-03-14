package com.mycompany.u2.e14;

public class PruebaEdades {

    public static void main(String[] args) {
        
        // Nuestro programa creará un objeto de la clase Persona
        Persona p = new Persona();
        
        /* Utilizará datos predefinidos, que serán Pedro para el nombre y
        30 para la edad. */
        p.setNombre("Pedro");
        p.setEdad(30);
        
        /* Ahora tenemos que codificar los mensajes que aparecerán en pantalla,
        para ello los dividimos en cuatro rangos de edad: [0, 3], [4, 12],
        (12, 20] y (21, inf). He decidido que el segundo mensaje corresponderá
        a la edad de 12 años inclusive guiándome por lo que entiendo yo por un
        niño, pero por el enunciado podría entenderse que forma parte del tercer
        mensaje, falta claridad. */
        if (p.getEdad() <= 3) {
            System.out.println("Es un bebe");
        }
        else {
            if (p.getEdad() <= 12) {
                System.out.println("Es un niño");
            }
            else {
                if (p.getEdad() <= 20) {
                    System.out.println("Es un adolescente");
                }
                else {
                    System.out.println("Es un adulto");
                }
            }
        }
    }
    /*Adicionalmente podría crearse una primera condición que fuese que el
    valor debe ser igual o superior a 0, pero el enunciado no lo exige. */
}
