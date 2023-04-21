/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author CHRISTIAN
 */
public class Jaula {
    private String Animal;
    private float ancho;
    private float alto;
    private float largo;

    public Jaula(String Animal, float ancho, float alto, float largo) {
        this.Animal = Animal;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
    
    
    
    
    
}
