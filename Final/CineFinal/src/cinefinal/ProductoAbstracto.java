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
public abstract class ProductoAbstracto {
    protected String nombre;
    protected String tamanio;
    protected double precio;

    public ProductoAbstracto(String nombre,  double precio,String tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    

    
}
