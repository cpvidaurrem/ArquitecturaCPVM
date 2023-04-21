/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Puerta {
    private double Alto;
    private double Ancho;
    private MaterialPuerta material;
    private Color color;

    public Puerta(double Alto, double Ancho, MaterialPuerta material, Color color) {
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.material = material;
        this.color = color;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public MaterialPuerta getMaterial() {
        return material;
    }

    public void setMaterial(MaterialPuerta material) {
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
        return "Puerta{" + "Alto=" + Alto + ", Ancho=" + Ancho + ", material=" + material + ", color=" + color + '}';
    }
    
    
    
}
