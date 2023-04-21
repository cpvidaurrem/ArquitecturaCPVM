package zoologico;

import java.util.*;

/**
 *
 * @author CHRISTIAN
 */
public class Zoologico {
    private String nombre;
    private String[] listaJaulas;
    private String direccion;
    private int telefono;
    

    public Zoologico(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String[] getListaJaulas() {
        return listaJaulas;
    }

    public void setListaJaulas(String[] listaJaulas) {
        this.listaJaulas = listaJaulas;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Zoologico{" + "nombre=" + nombre + ", listaJaulas=" + listaJaulas + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    

    
    

    
    
    
    
}
