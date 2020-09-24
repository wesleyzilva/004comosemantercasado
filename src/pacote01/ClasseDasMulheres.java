package pacote01;

public class ClasseDasMulheres {

	private String estadoCivil;
	private int idade;
	private static boolean estaDeTpm = true;
	private ClasseDosFilhos filhosEmCasa; //Agregação de filho para ser utilizado no construtor da ClasseDasMulheres
	private static boolean bebeDrinks;

	
	public ClasseDasMulheres(boolean estaDeTpm, boolean filhosEmCasa, boolean bebeDrinks) {
		super();
		estaDeTpm = estaDeTpm;
		bebeDrinks = bebeDrinks;
		filhosEmCasa = ClasseDosFilhos.isEmCasa();
	}

	public static boolean isEstaDeTpm() {
		return estaDeTpm;
	}

	private static void setEstaDeTpm(boolean estaDeTpm) {
		ClasseDasMulheres.estaDeTpm = estaDeTpm;
	}

	private ClasseDosFilhos getFilhosEmCasa() {
		return filhosEmCasa;
	}

	private void setFilhosEmCasa(ClasseDosFilhos filhosEmCasa) {
		this.filhosEmCasa = filhosEmCasa;
	}

	public static boolean isBebeDrinks() {
		return bebeDrinks;
	}

	private static void setBebeDrinks(boolean bebeDrinks) {
		ClasseDasMulheres.bebeDrinks = bebeDrinks;
	}

}
