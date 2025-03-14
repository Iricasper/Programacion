package es.tuespiral.u3.p8.polimorfismofiguras;

public final class Circulo extends Figura2D {
    private double radio;

    public Circulo(int posX, int posY, double radio) {
        super(posX, posY);
        this.radio = radio;
    }
    
    @Override
    public void mostrar() {
        String sombra  = proyectaSombra? "con":"sin";
       
        System.out.println("Dibuja un círculo con radio "+radio+" en la posicion ("+
                posX+","+posY+") "+sombra+" sombra");
    }
    
    @Override
    public void ocultar() {
        String sombra  = proyectaSombra? "con":"sin";
        
        System.out.println("Oculta un círculo con radio "+radio+" de la posicion ("+
                posX+","+posY+") "+sombra+" sombra");
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
