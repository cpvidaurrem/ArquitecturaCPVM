
package ejercicio1;

/**
 *
 * @author CHRISTIAN
 */
public class EstadoMulta implements IEstadoCobro{
    public int modelo;
    public float precioR;
    public float totalP;
    public float t;

    public EstadoMulta(int modelo, float precioR, float t) {
        this.modelo = modelo;
        this.precioR = precioR;
        this.totalP = 0;
        this.t = t;
    }
    
    @Override
    public void mostrar() {
        this.totalP = (float) ((this.modelo * 0.007 + this.precioR * 0.12) * (1 + 0.07) * this.t);
        
        System.out.println("El total a pagar con MULTA es: " + this.totalP); 
    }
    
}
