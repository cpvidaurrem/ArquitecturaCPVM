/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Techo {
    private MaterialTecho material;
    private Color color;

    public Techo(MaterialTecho material, Color color) {
        this.material = material;
        this.color = color;
    }

    public MaterialTecho getMaterial() {
        return material;
    }

    public void setMaterial(MaterialTecho material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Techo{" + "material=" + material + ", color=" + color + '}';
    }
    
    
}
