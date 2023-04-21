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
public class CasaMediaBuilder extends CasaBuilder{

    @Override
    public void crearPared() {
        ArrayList<Puerta> puertas = new ArrayList<>();
        ArrayList<Ventana> ventanas = new ArrayList<>();
        Puerta puerta = new Puerta(2, 0.9, MaterialPuerta.madera, Color.azul);
        puertas.add(puerta);
        Ventana ventana = new Ventana(1.5, 1.5, TipoMarco.aluminio, Color.amarillo);
        ventanas.add(ventana);
        casa.paredes = new Pared(Color.rojo, MaterialPared.ladrillo, ventanas, puertas);
    }

    @Override
    public void crearTecho() {
        casa.techo = new Techo(MaterialTecho.calamina, Color.rojo);
    }

    @Override
    public void crearPiso() {
        casa.piso = new Piso(MaterialPiso.ceramica, Color.rojo);
    }

    @Override
    public void crearGaraje() {
        casa.garaje = new Garaje(2, 3, 2);
    }
    
}
