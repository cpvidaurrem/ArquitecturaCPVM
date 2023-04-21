package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Casa {
    public Pared paredes;
    public Techo techo;
    public Piso piso;
    public Garaje garaje;

    public void Mostrar() {
        System.out.println("Paredes:  " + paredes.toString() + 
                "Techo:  " + techo.toString() + 
                "Piso: " + piso.toString() + 
                "Garaje" + garaje.toString());
    }
    
    @Override
    public String toString() {
        return "Casa{" + "paredes=" + paredes + ", techo=" + techo + ", piso=" + piso + ", garaje=" + garaje + '}';
    }
    
    
}
