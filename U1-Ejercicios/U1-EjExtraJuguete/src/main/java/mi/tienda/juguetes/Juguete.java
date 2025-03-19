package mi.tienda.juguetes;

public class Juguete {
    //Propiedades
    public String nombreJuguete;
    public String edadJuguete;
    public double precioJuguete;
    public int stock;
    
    //Métodos
    public void estableceNombreJuguete (String nuevoNombre){
    nombreJuguete = nuevoNombre;
    }
    
    public void estableceEdadJuguete (String nuevaEdad){
        edadJuguete = nuevaEdad;
    }
    
    public void establecePrecioJuguete (double nuevoPrecio){
        precioJuguete = nuevoPrecio;
    }
    
    public void estableceStock (int numTotal){
        stock = numTotal;
    }
    
    public String obtieneNombreJuguete(){
        return nombreJuguete;
    }
    
    public String obtieneEdadJuguete(){
        return edadJuguete;
    }
    
    public double obtienePrecioJuguete(){
        return precioJuguete;
    }
    
    public int obtieneStock(){
        return stock;
    }
    
    public double compra(int unidades){
        stock -= unidades;
        return unidades*precioJuguete;
    }
    
    public double devuelve(int unidades){
        stock += unidades;
        return unidades*precioJuguete;
    }
    
    public double calculaPrecioRebajado25(){
        final int REBAJA=25;
        return (1-(double)REBAJA/100)*precioJuguete;
    }
    
    public double calculaPrecioRebajado40(){
        final int REBAJA=40;
        return (1-(double)REBAJA/100)*precioJuguete;
    }
    
}
