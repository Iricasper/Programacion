package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;
import java.util.Scanner;

public class PruebaFutbolista {

    public static void main(String[] args) {
        Futbolista f = new Futbolista("Furbo", "Martinez");
        int opcion;

        do {
            furboCatalogo();
            opcion = furboLectura();
            furboSwitch(opcion, f);
            if (opcion == 0) {
                System.out.println("TE AMO EN DIOS CONFIO!!");
            }
        } while (opcion != 0);
    }

    public static void furboCatalogo() {
        System.out.println("\nRONALDINHO SOOOCCER!!!");
        System.out.println("--------------------------------------------");
        System.out.println("0-Salir");
        System.out.println("1-Mostrar estado");
        System.out.println("2-Marcar varios goles");
        System.out.println("3-Anular varios goles");
        System.out.println("4-Cambiar nombre y apellidos");
        System.out.println("5-Cambiar salario");
        System.out.println("6-Se lesiona");
        System.out.println("7-Se recupera\n");
    }

    public static int furboLectura() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge tu furbo:");
        return sc.nextInt();
    }

    public static void furboSwitch(int elec, Futbolista f) {
        switch ((elec)) {
            case 0:
                break;
            case 1:
                imprimeFurbo(f);
                break;
            case 2:
                furboGol(f);
                break;
            case 3:
                furboGolnt(f);
                break;
            case 4:
                furboJugador(f);
                break;
            case 5:
                furboCobra(f);
                break;
            case 6:
                furboFalta(f);
                break;
            case 7:
                furboStim(f);
                break;
            default:
                System.out.println("Eso no es muy furbo de tu parte");
        }
    }

    public static void imprimeFurbo(Futbolista f) {
        System.out.println(f.getNombre() + " " + f.getApellidos() + " esta "
                + furboLesion(f) + ", ha marcado " + f.getNumGoles() + " goles y gana "
                + f.getSalario() + " muchillones de rublos.");
    }

    public static String furboLesion(Futbolista f) {
        if (f.isLesionado()) {
            return "lesionade";
        } else {
            return "dpm";
        }
    }

    public static void furboGol(Futbolista f) {
        System.out.println("Introduce cuantos goles ha marcado esta maquina: ");
        Scanner sc = new Scanner(System.in);
        int golinhos = sc.nextInt();
        f.marcaGol(golinhos);
    }

    public static void furboGolnt(Futbolista f) {
        System.out.println("Introduce cuantos goles le han anulado a este paquete: ");
        Scanner sc = new Scanner(System.in);
        int golinhos = sc.nextInt();
        f.golAnulado(golinhos);
    }

    public static void furboJugador(Futbolista f) {
        System.out.println("Introduce el nombre del jugador: ");
        Scanner sc = new Scanner(System.in);
        f.setNombre(sc.nextLine());
        System.out.println("Introduce el apellido del jugador: ");
        sc = new Scanner(System.in);
        f.setApellidos(sc.nextLine());
    }

    public static void furboCobra(Futbolista f) {
        System.out.println("Introduce el nuevo salario: ");
        Scanner sc = new Scanner(System.in);
        f.setSalario(sc.nextDouble());
    }

    public static void furboFalta(Futbolista f) {
        System.out.println("Ay dios mio se ha hecho un esguince");
        f.setLesionado(true);
    }

    public static void furboStim(Futbolista f) {
        System.out.println("Pues al final no era para tanto");
        f.setLesionado(false);
    }
}
