package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author CHRISTIAN
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Introducir Datos de Cobro");
            System.out.println("2. Salir");

            System.out.println("Escribe una de las opciones: ");
            opcion = sn.nextInt();
            
            IEstadoCobro estado = new EstadoNormal(0, 0);
            Cobro c = new Cobro(estado);

            switch (opcion) {

                case 1:
                    Scanner modelo = new Scanner(System.in);
                    Scanner precioR = new Scanner(System.in);
                    Scanner tipoCobro = new Scanner(System.in);

                    System.out.println("Introduce el modelo: ");
                    int mod = modelo.nextInt(); 
                    System.out.println("Introduce precio Referencial: ");
                    float pr = precioR.nextFloat();
                    
                    System.out.println("Introduce tipo de Cobro(descuento, normal, multa): ");
                    String tc = tipoCobro.next();
                    
                    
                    if("descuento".equals(tc)){
                        IEstadoCobro tipoc = new EstadoDescuento(mod, pr);
                        c.setEstado(tipoc);
                    }
                    else{
                        if("normal".equals(tc)){
                            IEstadoCobro tipoc = new EstadoNormal(mod, pr);
                            c.setEstado(tipoc);
                        }
                        else{
                            if("multa".equals(tc)){
                                IEstadoCobro tipoc = new EstadoMulta(mod, pr, 2);
                                c.setEstado(tipoc);
                            }
                            else{System.out.println("NO ESTA ENTRANDO");}
                        }
                    }
                    
                    Scanner sn2 = new Scanner(System.in);
                    int opcion2;
                    
                    System.out.println("1. Calcular");
                    System.out.println("2. Salir");
                    
                    
                    System.out.println("Escribe una de las opciones: ");
                    opcion2 = sn2.nextInt();
                    
                    switch(opcion2){
                        case 1: c.mostrar(); break;
                        case 2: salir = true; break;
                    }
                    //c.mostrar();
                    break;
                    
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 2");
            }
        }

//        IEstadoCobro descuento = new EstadoDescuento(2022, 20000);
//        IEstadoCobro normal = new EstadoNormal(2022, 200000);
//        IEstadoCobro multa = new EstadoMulta(2022, 20000, 2);
//
//        Cobro c = new Cobro(normal);
//        c.mostrar();
//        c.setEstado(descuento);
//        c.mostrar();
//        c.setEstado(multa);
//        c.mostrar();
        
    }

}
