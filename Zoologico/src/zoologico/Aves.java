/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author CHRISTIAN
 */
public class Aves implements Ave {
    private String nombre;
    private float peso;
    private float tamanioAlas;

    public Aves(String nombre, float peso, float tamanioAlas) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamanioAlas = tamanioAlas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanioAlas() {
        return tamanioAlas;
    }

    public void setTamanioAlas(float tamanioAlas) {
        this.tamanioAlas = tamanioAlas;
    }

    @Override
    public String toString() {
        return "Aves{" + "nombre=" + nombre + ", peso=" + peso + ", tamanioAlas=" + tamanioAlas + '}';
    }

    @Override
    public void volar() {
        System.out.println("Ave Volando");
    }
    
}
