package es.tuespiral.u3.p8.polimorfismofiguras;

public class ImagenCompuesta {
    private Figura2D[] imagen;
    private int numImagenesActual;
    
    public ImagenCompuesta(int numMaxImagenes) {
        imagen = new Figura2D[numMaxImagenes];
        numImagenesActual = 0;
    }
    
    public void agregaFigura2D(Figura2D f) {
        if (numImagenesActual < imagen.length) {
            imagen[numImagenesActual] = f;
            numImagenesActual++;
        }
        else
            System.out.println("Error: se ha alcanzado el límite de figuras de la imagen");
    }
    
    // Método que aprovecha el polimorfismo
    public void mostrarImagenCompuesta() {
        for(int i=0; i<numImagenesActual;i++) {
            imagen[i].mostrar();
        }
    }
    
    // Método que aprovecha el polimorfismo
    public void ocultarImagenCompuesta() {
        for(int i=0; i< numImagenesActual;i++) {
            imagen[i].ocultar();
        }
    }
    
    // Método que aprovecha el polimorfismo
    public void mostrarConSombra() {
        for(int i=0; i< numImagenesActual;i++) {
            imagen[i].setProyectaSombra(true);
            imagen[i].mostrar();
        }
    }
    
    // Método que aprovecha el polimorfismo
    public void mostrarSinSombra() {
        for(int i=0; i< numImagenesActual;i++) {
            imagen[i].setProyectaSombra(false);
            imagen[i].mostrar();
        }
    }
}
