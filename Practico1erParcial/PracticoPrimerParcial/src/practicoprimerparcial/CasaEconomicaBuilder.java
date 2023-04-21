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
public class CasaEconomicaBuilder extends CasaBuilder {
    @Override
    public void crearPared() {
        
        ArrayList<Puerta> puertas = new ArrayList<>();
        ArrayList<Ventana> ventanas = new ArrayList<>();
        Puerta puerta = new Puerta(2, 0.9, MaterialPuerta.aglomerado, Color.azul);
        puertas.add(puerta);
        Ventana ventana = new Ventana(1, 1, TipoMarco.fierro, Color.amarillo);
        ventanas.add(ventana);
        casa.paredes = new Pared(Color.rojo, MaterialPared.adobe, ventanas, puertas);
        
    }

    @Override
    public void crearTecho() {
        casa.techo = new Techo(MaterialTecho.calamina, Color.rojo);
    }

    @Override
    public void crearPiso() {
        casa.piso = new Piso(MaterialPiso.cemento, Color.rojo);
    }

    @Override
    public void crearGaraje() {
        casa.garaje = new Garaje(0, 0, 0);
    }
    
}
