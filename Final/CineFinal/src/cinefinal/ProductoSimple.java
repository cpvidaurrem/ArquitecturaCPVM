/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinefinal;

/**
 *
 * @author Carlos
 */
public class ProductoSimple extends ProductoAbstracto {

    public ProductoSimple(String nombre, double precio, String tamanio) {
        super(nombre, precio, tamanio);
    }


    

    

    

    @Override
    public double getPrecio() {
        return this.precio;
    }



 
}
