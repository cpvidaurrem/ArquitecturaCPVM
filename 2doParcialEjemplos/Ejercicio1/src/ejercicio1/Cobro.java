package ejercicio1;

/**
 *
 * @author CHRISTIAN
 */
public class Cobro {
    private IEstadoCobro estado;
    
    public Cobro (IEstadoCobro estado){
        this.estado = estado;
    }

    public void setEstado(IEstadoCobro estado) {
        this.estado = estado;
    }

    public IEstadoCobro getEstado() {
        return estado;
    }
      
    
    public void mostrar(){
        estado.mostrar();
    }
}
