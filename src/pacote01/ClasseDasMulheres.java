package pacote01;

public class ClasseDasMulheres {

	private static boolean estaDeTpm;
	private static boolean bebeDrinks;
	private static boolean filhosEmCasa; // Agregação de filho para ser utilizado no construtor da ClasseDasMulheres

	public ClasseDasMulheres(boolean estaDeTpm, boolean bebeDrinks, boolean filhosEmCasa) {
		System.out.println("Passando pelo construtor da ClasseDasMulheres");
		setEstaDeTpm(estaDeTpm);
		setBebeDrinks(bebeDrinks);
		ClasseDosFilhos.setEmCasa(filhosEmCasa);
		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());

	}

	private static void setEstaDeTpm(boolean estaDeTpm) {
		ClasseDasMulheres.estaDeTpm = estaDeTpm;
	}

	private static void setBebeDrinks(boolean bebeDrinks) {
		ClasseDasMulheres.bebeDrinks = bebeDrinks;
	}

	public static boolean isEstaDeTpm() {
		return estaDeTpm;
	}

	public static boolean isBebeDrinks() {
		return bebeDrinks;
	}

}
