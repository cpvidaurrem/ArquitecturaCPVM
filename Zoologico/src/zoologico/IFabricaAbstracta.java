package zoologico;

public interface IFabricaAbstracta {
    Mamifero getMamifero(String nombre);
    Ave getAve(String nombre);
    Pez getPez(String nombre);
}
