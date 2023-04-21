/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author CHRISTIAN
 */
public class Mamiferos implements Mamifero {
    private String nombre;
    private float temperatura;
    private int nroPatas;
    private String color;

    public Mamiferos(String nombre, float temperatura, int nroPatas, String color) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.nroPatas = nroPatas;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public int getNroPatas() {
        return nroPatas;
    }

    public void setNroPatas(int nroPatas) {
        this.nroPatas = nroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mamiferos{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", nroPatas=" + nroPatas + ", color=" + color + '}';
    }

    @Override
    public void gettemperatura() {
        System.out.println("Temperatura de " + this.temperatura);
    }
    
    
    
}
