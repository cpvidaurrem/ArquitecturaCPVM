/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author CHRISTIAN
 */
public class EstadoDescuento implements IEstadoCobro{
    
    public int modelo;
    public float precioR;
    public float totalP;

    public EstadoDescuento(int modelo, float precioR) {
        this.modelo = modelo;
        this.precioR = precioR;
        this.totalP = 0;
    }
    
    
    
    @Override
    public void mostrar() {
        this.totalP = (float) ((this.modelo * 0.005 + this.precioR * 0.12) * (1 - 0.05));
        
        System.out.println("El total a pagar con DESCUENTO es: " + this.totalP); 
    }
        
    
}
