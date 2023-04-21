package zoologico;

public class FabricaPez implements IFabricaAbstracta {

    @Override
    public Mamifero getMamifero(String nombre) {
        return null;
    }

    @Override
    public Ave getAve(String nombre) {
        return null;
    }

    @Override
    public Pez getPez(String nombre) {
        if(nombre.equalsIgnoreCase("pacu")){
            return new Peces("pacu", 1);
        } else if(nombre.equalsIgnoreCase("sabalo")){
            return new Peces("sabalo", 2);
        }
        return null;  
    }
    
}
