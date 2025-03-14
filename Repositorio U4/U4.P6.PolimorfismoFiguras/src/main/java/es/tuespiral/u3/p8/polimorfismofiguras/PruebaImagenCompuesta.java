package es.tuespiral.u3.p8.polimorfismofiguras;

public class PruebaImagenCompuesta {
    public static void main(String[] args) {
        ImagenCompuesta imagen = new ImagenCompuesta(5);
        
        imagen.agregaFigura2D(new Circulo(10, 12, 3.56));
        imagen.agregaFigura2D(new Circulo(20, 10, 21.32));
        imagen.agregaFigura2D(new Rectangulo(1, 23, 10.0, 20.0));
        imagen.agregaFigura2D(new Rectangulo(3, 45, 30.0, 2.8));
        
        imagen.mostrarImagenCompuesta();
        System.out.println(""); // Separador visual
        imagen.ocultarImagenCompuesta();
        System.out.println(""); // Separador visual
        imagen.mostrarConSombra();
    }
}
