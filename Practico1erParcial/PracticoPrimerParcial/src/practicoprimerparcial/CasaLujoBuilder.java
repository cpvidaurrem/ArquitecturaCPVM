/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicoprimerparcial;

import java.util.ArrayList;

/**
 *
 * @author CHRISTIAN
 */
public class CasaLujoBuilder extends CasaBuilder{

    @Override
    public void crearPared() {
        
        ArrayList<Puerta> puertas = new ArrayList<>();
        ArrayList<Ventana> ventanas = new ArrayList<>();
        Puerta puerta = new Puerta(2, 1.5, MaterialPuerta.madera, Color.azul);
        puertas.add(puerta);
        Ventana ventana = new Ventana(1.5, 1.5, TipoMarco.madera, Color.amarillo);
        ventanas.add(ventana);
        casa.paredes = new Pared(Color.rojo, MaterialPared.cemento, ventanas, puertas);
    }

    @Override
    public void crearTecho() {
        casa.techo = new Techo(MaterialTecho.teja, Color.rojo);
    }

    @Override
    public void crearPiso() {
        casa.piso = new Piso(MaterialPiso.porcelanato, Color.rojo);
    }

    @Override
    public void crearGaraje() {
        casa.garaje = new Garaje(4, 3, 2);
    }
    
}
