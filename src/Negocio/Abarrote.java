
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Abarrote extends Producto{
    
    private int tamaño;

    public Abarrote() {
    }

    public Abarrote(int tamaño, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString()+ " Abarrote{" + "tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
