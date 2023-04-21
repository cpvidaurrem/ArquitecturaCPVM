/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class CasaMaker {
    private CasaBuilder builder;
    
    public CasaMaker(CasaBuilder builder){
        this.builder = builder;
    }
    
    public void BuildCasa(){
        builder.createCasa();
        builder.crearPared();
        builder.crearTecho();
        builder.crearPiso();
        builder.crearGaraje();
    }
    
    public Casa getCasa(){
        return builder.getCasa();
    }
    
}
