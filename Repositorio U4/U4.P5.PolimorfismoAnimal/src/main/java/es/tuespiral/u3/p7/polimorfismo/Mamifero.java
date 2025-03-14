package es.tuespiral.u3.p7.polimorfismo;

public abstract class Mamifero {
    private String nombre;
    private int anioNacimiento;
    private boolean vacunado;
    
    public abstract void haceRuido();
    
    public void recibeVacuna() {
        vacunado = true;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "vacunado=" + vacunado + '}';
    }
    
    
}
