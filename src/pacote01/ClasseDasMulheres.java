package pacote01;

public class ClasseDasMulheres {

	private String estadoCivil;
	private int idade;
	private static boolean estaDeTpm;
	private static boolean bebeDrinks;
	private boolean filhosEmCasa; // Agregação de filho para ser utilizado no construtor da ClasseDasMulheres

	public ClasseDasMulheres(boolean estaDeTpm, boolean bebeDrinks, boolean filhosEmCasa) {
		System.out.println("Passando pelo construtor da ClasseDasMulheres");
		this.estaDeTpm = estaDeTpm;
		this.bebeDrinks = bebeDrinks;
		this.setFilhosEmCasa(filhosEmCasa);
	}

	public static boolean isEstaDeTpm() {
		return estaDeTpm;
	}

	private static void setEstaDeTpm(boolean estaDeTpm) {
		ClasseDasMulheres.estaDeTpm = estaDeTpm;
	}

	public static boolean isBebeDrinks() {
		return bebeDrinks;
	}

	private static void setBebeDrinks(boolean bebeDrinks) {
		ClasseDasMulheres.bebeDrinks = bebeDrinks;
	}

	/**
	 * @return the filhosEmCasa
	 */
	public boolean isFilhosEmCasa() {
		return filhosEmCasa;
	}

	/**
	 * @param filhosEmCasa the filhosEmCasa to set
	 */
	public void setFilhosEmCasa(boolean filhosEmCasa) {
		this.filhosEmCasa = filhosEmCasa;
	}

}
