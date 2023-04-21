package zoologico;

import java.util.*;
import javax.swing.JOptionPane;

public class Menu {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //IFabricaAbstracta fabricaMamifero = ProductorFabrica.getFactory("Mamifero");
        
        //Mamifero m1 = fabricaMamifero.getMamifero("oso");
        
        //m1.gettemperatura();
        
        
        int opciones = 0;
        String[] listaJaulas = new String[100];
        Zoologico z = new Zoologico("Zoo", "Central Park", 653261127);
        
        do {            
            opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la opcion: \n " + 
                    "1.- Anadir Mamifero \n" + 
                    "2.- Anadir Ave \n" + 
                    "3.- Anadir Pez \n" + 
                    "4.- Mostrar Mamifero \n" + 
                    "5.- Mostrar Ave \n" + 
                    "6.- Mostrar Pez \n" + 
                    "7.- Mostrar Zoologico \n" + 
                    "8.- Salir \n"));
            
            switch (opciones) {
                case 1:
                    IFabricaAbstracta fabricaMamifero = ProductorFabrica.getFactory("Mamifero");
                    Mamifero m1 = fabricaMamifero.getMamifero("oso");
                    m1.gettemperatura();
                    //System.out.println(m1.toString());
                    
                    Jaula j1 = new Jaula(m1.toString(), 10, 10, 10);
                   
                    listaJaulas[0] = j1.getAnimal();
                    z.setListaJaulas(listaJaulas);
                    
                    
                    break;

                case 2:
                    IFabricaAbstracta fabricaAve = ProductorFabrica.getFactory("Ave");
                    Ave a1 = fabricaAve.getAve("loro");
                    a1.volar();
                    
                    Jaula j2 = new Jaula(a1.toString(), 10, 10, 10);
                    
                    listaJaulas[1] = j2.getAnimal();
                    z.setListaJaulas(listaJaulas);
                
                    break;
                case 3:
                    IFabricaAbstracta fabricaPez = ProductorFabrica.getFactory("Pez");
                    Pez p1 = fabricaPez.getPez("pacu");
                    p1.nadar();
                    
                    Jaula j3 = new Jaula(p1.toString(), 10, 10, 10);
                    
                    listaJaulas[2] = j3.getAnimal();
                    z.setListaJaulas(listaJaulas);
                    
                    break;
                case 4:
                    
                    JOptionPane.showMessageDialog(null, listaJaulas[0]);
                    
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, listaJaulas[1]);
                    
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, listaJaulas[2]);
                    
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, z.toString());
                    
                    break;
                    
                case 8:
                    JOptionPane.showMessageDialog(null,"Saliendo de programa"); System.exit(0); 
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        } while (opciones != 4);
        
    }
    
}
