package zoologico;

public class FabricaMamifero implements IFabricaAbstracta {

    @Override
    public Mamifero getMamifero(String nombre) {
        
        if(nombre.equalsIgnoreCase("oso")){
            return new Mamiferos("oso", (float) 35.2, 4, "cafe");
        } else if(nombre.equalsIgnoreCase("mono")){
            return new Mamiferos("mono", (float) 30.1, 4, "blanco");
        } if(nombre.equalsIgnoreCase("leon")){
            return new Mamiferos("leon", (float) 33.4, 4, "naranja");
        }
        return null;  
    }

    @Override
    public Ave getAve(String nombre) {
        return null;
    }

    @Override
    public Pez getPez(String nombre) {
        return null;
    }
    
    
    
}
