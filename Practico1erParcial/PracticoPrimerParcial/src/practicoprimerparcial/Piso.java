/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Piso {
    MaterialPiso material;
    Color color;

    public Piso(MaterialPiso material, Color color) {
        this.material = material;
        this.color = color;
    }

    public MaterialPiso getMaterial() {
        return material;
    }

    public void setMaterial(MaterialPiso material) {
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
        return "Piso{" + "material=" + material + ", color=" + color + '}';
    }
    
    
}
