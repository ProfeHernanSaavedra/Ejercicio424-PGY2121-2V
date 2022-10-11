package Datos;

import Negocio.Oferta;
import Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author USRVI-LC2
 */
public class Coleccion {

    private ArrayList<Producto> listaProducto;

    public Coleccion() {

        listaProducto = new ArrayList<>();

    }

    public void agregarProducto(Producto prod) {
        if (buscarProducto(prod.getCodigo()) == false) {
            listaProducto.add(prod);
        } else {
            System.out.println("Producto ya existe!! ");
        }
    }

    public boolean buscarProducto(int codigo) {
        for (Producto producto : listaProducto) {

            if (producto.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public void listaCompra(Oferta of) {
        
        int descuento= 0;
        System.out.println("CÓDIGO DESCRIPCIÖN\t\tCANTIDAD\tPRECIO UNITARIO\tTOTAL");
        for (Producto producto : listaProducto) {

            if (producto.getClass().getSimpleName().equals("Oferta")) {

                //System.out.println(producto.getClass().getSimpleName());
                //System.out.println(producto.getCodigo() + "\t" + producto.getDescripcion() + "\t\t\t" + producto.getCantidad() + "\t\t" + producto.getPrecio() + "\t\t" + of.aPagar(producto.getCantidad()));
                
            } 
                System.out.println(producto.getCodigo() + "\t" + producto.getDescripcion() + "\t\t\t" + producto.getCantidad() + "\t\t" + producto.getPrecio() + "\t\t" + producto.getCantidad() * producto.getPrecio());
                descuento = of.aPagar(producto.getCantidad());

        }
        System.out.println("\t\t\t\t\t\t\tTOTAL COMPRA $" + this.totalLista());
        System.out.println("\t\t\t\t\t\t\tDESCUENTO: $"+ descuento);
        System.out.println("\t\t\t\t\t\t\tTOTAL Con DESCUENTO $" + this.totalLista(of));
    }

    public int totalLista(Oferta of) {
        int total = 0;
        int totalP = 0;
        for (Producto producto : listaProducto) {
            totalP = producto.getPrecio() * producto.getCantidad();
            total += totalP; // total = total + totalP;
            if (producto.getClass().getSimpleName().equals("Oferta")) 
            {
                
                   total = total - of.aPagar(producto.getCantidad());
            }
        }
        return total;
    }

    public int totalLista() {
        int total = 0;
        int totalP = 0;
        for (Producto producto : listaProducto) {
            totalP = producto.getPrecio() * producto.getCantidad();
            total += totalP; // total = total + totalP;
            
        }
        return total;
    }
    
}
