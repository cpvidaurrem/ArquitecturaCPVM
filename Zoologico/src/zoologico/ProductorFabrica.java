package zoologico;

public class ProductorFabrica {
    public static IFabricaAbstracta getFactory(String tipoFabrica) {

		if (tipoFabrica.equalsIgnoreCase("Mamifero")) {
			return new FabricaMamifero();
		} else if (tipoFabrica.equalsIgnoreCase("Ave")) {
			return new FabricaAve();
		} else if (tipoFabrica.equalsIgnoreCase("Pez")) {
			return new FabricaPez();
		}

		return null;
	}
}
