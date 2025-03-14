package es.tuespiral.u3.p8.polimorfismofiguras;

public final class Rectangulo extends Figura2D {
    private double base, altura;

    public Rectangulo(int posX, int posY, double base, double altura) {
        super(posX, posY);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void mostrar() {
        String sombra  = proyectaSombra? "con":"sin";
        
        System.out.println("Dibuja un rectángulo con base "+base+" y altura "+altura+
                " en la posicion ("+posX+","+posY+") "+sombra+" sombra");
    }
    
    @Override
    public void ocultar() {
        String sombra  = proyectaSombra? "con":"sin";
        
        System.out.println("Oculta un rectángulo con base "+base+" y altura "+altura+
                " en la posicion ("+posX+","+posY+") "+sombra+" sombra");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
