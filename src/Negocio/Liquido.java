
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Liquido extends Producto{
    
    private double gradosA;

    public Liquido() {
    }

    public Liquido(double gradosA, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradosA = gradosA;
    }

    public double getGradosA() {
        return gradosA;
    }

    public void setGradosA(double gradosA) {
        this.gradosA = gradosA;
    }

    @Override
    public String toString() {
        return super.toString() + " Liquido{" + "gradosA=" + gradosA + '}';
    }
    
    
    
}
