package zoologico;
 
public class FabricaAve implements IFabricaAbstracta {

    @Override
    public Mamifero getMamifero(String nombre) {
        return null;
    }

    @Override
    public Ave getAve(String nombre) {
        
        if(nombre.equalsIgnoreCase("loro")){
            return new Aves("loro", 1, 1);
        } else if(nombre.equalsIgnoreCase("aguila")){
            return new Aves("aguila", 4, 2);
        } if(nombre.equalsIgnoreCase("condor")){
            return new Aves("Condor", 3, 3);
        }
        return null;  
    }

    @Override
    public Pez getPez(String nombre) {
        return null;
    }
    
}
