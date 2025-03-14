package mi.tienda.juguetes;

public class Juguete {
    public String nombreJuguete;
    public String edadJuguete;
    public double precioJuguete;
    public int stock;
    
    public void estableceNombreJuguete (String nuevoNombre) {
        nombreJuguete = nuevoNombre;
    }
    
    public void estableceEdadJuguete (String nuevaEdad) {
        edadJuguete = nuevaEdad;
    }
    
    public void establecePrecioJuguete (double nuevoPrecio) {
        precioJuguete = nuevoPrecio;
    }
    
    public void estableceStock (int numTotal) {
        stock = numTotal;
    }
    
    public String obtieneNombreJuguete() {
        return nombreJuguete;
    }
    
    public String obtieneEdadJuguete () {
        return edadJuguete;
    }
    
    public double obtienePrecioJuguete () {
        return precioJuguete;
    }
    
    public int obtieneStock () {
        return stock;
    }
    
    public double compra (int cantidad) {
        stock -= cantidad;
        return cantidad * precioJuguete;
    }
    
    public double devuelve (int cantidad) {
        stock += cantidad;
        return cantidad * precioJuguete;
    }
    
    public double calculaPrecioRebajado25 () {
        final int porcentajeRebaja = 25;
        return precioJuguete * (1 - (double) porcentajeRebaja / 100);
    }
    
    public double calculaPrecioRebajado40 () {
        final int porcentajeRebaja = 40;
        return precioJuguete * (1 - (double) porcentajeRebaja / 100);
    }
}
