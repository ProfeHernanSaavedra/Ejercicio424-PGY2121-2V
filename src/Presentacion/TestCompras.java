package Presentacion;

import Datos.Coleccion;
import Negocio.*;

/**
 *
 * @author USRVI-LC2
 */
public class TestCompras {
    
    public static void main(String[] args) {
        
        Abarrote fideo = new Abarrote(1, 10, 1000, 1, "Numero 5");
        Liquido cerveza = new Liquido(7, 20, 1200, 2, "Corona");
        Congelado helado = new Congelado(-18.5, 30, 1200, 3, "Crazy");
        Oferta arroz = new Oferta(10,40, 1000, 2, "grado 2");
        
        Coleccion col = new Coleccion();
        
        col.agregarProducto(fideo);
        col.agregarProducto(cerveza);
        col.agregarProducto(helado);
        col.agregarProducto(arroz);
        
        col.listaCompra(arroz);
    }
    
}
