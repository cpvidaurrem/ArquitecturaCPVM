/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Ventana {
    private double Alto;
    private double Ancho;
    private TipoMarco marco;
    private Color color;

    public Ventana(double Alto, double Ancho, TipoMarco marco, Color color) {
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.marco = marco;
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

    public TipoMarco getMarco() {
        return marco;
    }

    public void setMarco(TipoMarco marco) {
        this.marco = marco;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ventana{" + "Alto=" + Alto + ", Ancho=" + Ancho + ", marco=" + marco + ", color=" + color + '}';
    }
    
    
    
    
}
