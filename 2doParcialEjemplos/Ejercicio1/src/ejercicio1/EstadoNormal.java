
package ejercicio1;

/**
 *
 * @author CHRISTIAN
 */
public class EstadoNormal implements IEstadoCobro {
    
    public int modelo;
    public float precioR;
    public float totalP;

    public EstadoNormal(int modelo, float precioR) {
        this.modelo = modelo;
        this.precioR = precioR;
        this.totalP = 0;
    }
    
    @Override
    public void mostrar() {
        this.totalP = (float) (this.modelo * 0.007 + this.precioR * 0.12);
        
        System.out.println("El total a pagar NORMAL es: " + this.totalP);
    }
    
}
