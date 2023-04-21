/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
abstract class CasaBuilder {
    protected Casa casa;
    
    public Casa getCasa() {
        return casa;
    }
    
    public void createCasa(){
        casa = new Casa();
    }
    
    public abstract void crearPared();
    public abstract void crearTecho();
    public abstract void crearPiso();
    public abstract void crearGaraje();
    
}
