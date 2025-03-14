package es.tuespiral.u3.p8.polimorfismofiguras;

public abstract class Figura2D {
    protected int colorBorde;
    protected int colorRelleno;
    protected int posX;
    protected int posY;
    protected boolean proyectaSombra;
   
    public Figura2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    public abstract void mostrar();
    public abstract void ocultar();
    
    public int getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(int colorBorde) {
        this.colorBorde = colorBorde;
    }

    public int getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(int colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public boolean isProyectaSombra() {
        return proyectaSombra;
    }

    public void setProyectaSombra(boolean proyectaSombra) {
        this.proyectaSombra = proyectaSombra;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
