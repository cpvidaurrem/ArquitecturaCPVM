package practicoprimerparcial;

import java.util.ArrayList;

/**
 *
 * @author CHRISTIAN
 */
public class Pared {
    Color color;
    MaterialPared material;
    ArrayList<Ventana> ventanas;
    ArrayList<Puerta> puertas;

    public Pared(Color color, MaterialPared material, ArrayList<Ventana> ventanas, ArrayList<Puerta> puertas) {
        this.color = color;
        this.material = material;
        this.ventanas = ventanas;
        this.puertas = puertas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MaterialPared getMaterial() {
        return material;
    }

    public void setMaterial(MaterialPared material) {
        this.material = material;
    }

    public ArrayList<Ventana> getVentanas() {
        return ventanas;
    }

    public void setVentanas(ArrayList<Ventana> ventanas) {
        this.ventanas = ventanas;
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }

    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Pared{" + "color=" + color + ", material=" + material + ", ventanas=" + ventanas + ", puertas=" + puertas + '}';
    }
    
    
    
    
}


