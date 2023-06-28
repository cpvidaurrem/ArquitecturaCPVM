/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinefinal;

/**
 *
 * @author CHRISTIAN
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoSimple pipocaPequenia = new ProductoSimple("Pipoca Pequenia", 5, "pequenia");
        ProductoSimple pipocaMediana = new ProductoSimple("Pipoca Mediana", 8, "mediana");
        ProductoSimple pipocaGrande = new ProductoSimple("Pipoca Grande", 10, "grande");
        
        ProductoSimple sodaPequenia = new ProductoSimple("Soda Pequenia", 4, "pequenia");
        ProductoSimple sodaMediana = new ProductoSimple("Soda Mediana", 6, "mediana");
        ProductoSimple sodaGrande = new ProductoSimple("Soda Grande", 8, "grande");
        
        
        //Combos
        //Combo 1
        ProductoCompuesto combo1 = new ProductoCompuesto("combo 1");
        combo1.addProducto(pipocaMediana);
        combo1.addProducto(pipocaMediana);
        combo1.addProducto(sodaMediana);
        combo1.addProducto(sodaMediana);
        //Combo 2
        ProductoCompuesto combo2 = new ProductoCompuesto("combo 2");
        combo2.addProducto(pipocaMediana);
        combo2.addProducto(sodaMediana);
        //Combo 3
        ProductoCompuesto combo3 = new ProductoCompuesto("combo 3");
        combo3.addProducto(pipocaGrande);
        combo3.addProducto(pipocaGrande);
        combo3.addProducto(sodaMediana);
        combo3.addProducto(sodaMediana);
        
        
        //Venta
        Venta comboUno = new Venta(1, "Pedro Dominguez");
        comboUno.addProducto(combo1);
        comboUno.imprimirVenta();
        
        Venta comboDos = new Venta(2, "Maria Perez");
        comboDos.addProducto(combo2);
        comboDos.imprimirVenta();
        
        Venta comboTres = new Venta(3, "Carlos Diaz");
        comboTres.addProducto(combo3);
        comboTres.imprimirVenta();
        
        
        
    }
    
}
