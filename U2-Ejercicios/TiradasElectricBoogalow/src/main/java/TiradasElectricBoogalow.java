
public class TiradasElectricBoogalow {

    public static void main(String[] args) {
        final int NUM_TIRADAS = 50;
        //Creo variables cuya función será guardar el numero de veces que salga cada número
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
        //Creamos el array
        int[] tir = new int[NUM_TIRADAS];

        //Le asignamos valor a las tiradas
        for (int i = 0; i < tir.length; i++) {
            tir[i] = (int) (Math.random() * 6 + 1);
        }

        //Recorro el array contando las veces que ha salido cada número
        for (int i = 0; i < tir.length; i++) {
            switch (tir[i]) {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
            }
        }

        System.out.println("Se han analizado " + NUM_TIRADAS + " tiradas de un"
                + "dado de 6 caras y se obtienen los siguientes resultados:");
        System.out.println("El numero 6 ha aparecido " + seis + " veces.");
        System.out.println("El numero 5 ha aparecido " + cinco + " veces.");
        System.out.println("El numero 4 ha aparecido " + cuatro + " veces.");
        System.out.println("El numero 3 ha aparecido " + tres + " veces.");
        System.out.println("El numero 2 ha aparecido " + dos + " veces.");
        System.out.println("El numero 1 ha aparecido " + uno + " veces.");
    }
}
