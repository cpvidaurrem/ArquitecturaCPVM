/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Garaje {
    private double Alto;
    private double Ancho;
    private double Largo;

    public Garaje(double Alto, double Ancho, double Largo) {
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Largo = Largo;
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

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    @Override
    public String toString() {
        return "Garaje{" + "Alto=" + Alto + ", Ancho=" + Ancho + ", Largo=" + Largo + '}';
    }
    
    
    
    
}
