package es.tuespiral.u4.p11.fechahora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class PruebaFechaHora {
    public static void main(String[] args) {
        // Creamos distintos tipos de fechas y horas partiendo del "ahora"
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now() );
        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now() );
        System.out.println("El instante actual es: " + Instant.now() );
        
        // Creamos fecha y horas partiendo de unos datos concretos. Usamos "of"
        LocalDate miCumple = LocalDate.of(1977, Month.MAY, 12);
        LocalTime horaExactaNacimiento = LocalTime.of(19, 6, 58);
        System.out.println("Fecha de mi cumpleaños: " + miCumple);
        System.out.println("Exactamente nací a las: " + horaExactaNacimiento);
        
        // Podemos crear fechas y horas partiendo de una cadena de texto en formato ISO
        // Este formato establece las fechas del modo: AAAA-MM-DD        
        LocalDate seisJulio2020 = LocalDate.parse("2020-07-06");
        
        // Si queremos utilizar otro formato de introducción de fechas tendremos que
        // especificarlo
        LocalDate tresJunio2020 = LocalDate.parse("3/6/2020", DateTimeFormatter.ofPattern("d/M/yyyy") );
        
        // También podemos usar getters de las distintas partes de una fecha/hora
        System.out.println("Mi cumple es el "+miCumple.getDayOfMonth()+" del mes "+miCumple.getMonthValue());
        
        // También tenemos métodos para "sumar o restar tiempos" a una fecha/hora
        System.out.println("La fecha dentro de 10 días: " + LocalDate.now().plusDays(10) );
        System.out.println("La fecha y hora de hace 32 horas: " + LocalDateTime.now().minusHours(32) );
        
        
    }
}
