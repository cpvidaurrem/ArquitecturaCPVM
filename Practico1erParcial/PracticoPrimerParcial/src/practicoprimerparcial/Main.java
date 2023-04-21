/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicoprimerparcial;

/**
 *
 * @author CHRISTIAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CASA ECONOMICA");
        CasaMaker contruirCasa =  new CasaMaker(new CasaEconomicaBuilder());
        contruirCasa.BuildCasa();
        Casa casa1 = contruirCasa.getCasa();
        casa1.Mostrar();
        
        System.out.println("CASA MEDIA");
        CasaMaker contruirCasa2 =  new CasaMaker(new CasaMediaBuilder());
        contruirCasa2.BuildCasa();
        Casa casa2 = contruirCasa2.getCasa();
        casa2.Mostrar();
        
        System.out.println("CASA LUJO");
        CasaMaker contruirCasa3 =  new CasaMaker(new CasaLujoBuilder());
        contruirCasa3.BuildCasa();
        Casa casa3 = contruirCasa3.getCasa();
        casa3.Mostrar();
        //System.out.println(casa1.toString());
        
    }
    
}
