package pilarPooEncapsulamento;

import pilarPooHeranca.ClasseDasPessoasAbstrata;

//Herança para diferença: Herda e acrescenta métodos.
public class ClasseDasMulheres extends ClasseDasPessoasAbstrata {

	// Atributo tem que ser estático
	private static boolean estaDeTpm;
	private static boolean bebeDrinks;
	private ClasseDosFilhos emCasa; // Agregação de filho para ser utilizado no construtor da ClasseDasMulheres

	// Metodo que recebe parametros e executa ações
	/*
	 * public ClasseDasMulheres(boolean estaDeTpm, boolean bebeDrinks, boolean
	 * filhosEmCasa) {
	 * System.out.println("Passando pelo construtor da ClasseDasMulheres");
	 * setEstaDeTpm(estaDeTpm); setBebeDrinks(bebeDrinks);
	 * ClasseDosFilhos.setEmCasa(filhosEmCasa); System.out.println("|estaDeTpm? " +
	 * ClasseDasMulheres.isEstaDeTpm()); System.out.println("|bebeDrinks? " +
	 * ClasseDasMulheres.isBebeDrinks()); System.out.println("|filhosEmCasa? " +
	 * ClasseDosFilhos.isEmCasa());
	 * 
	 * }
	 */

	public ClasseDasMulheres(boolean estaDeTpm, boolean bebeDrinks) {
		this.estaDeTpm = estaDeTpm;
		this.bebeDrinks = bebeDrinks;

	}

	public void setEstaDeTpm(boolean estaDeTpm) {
		this.estaDeTpm = estaDeTpm;
	}

	public void setBebeDrinks(boolean bebeDrinks) {
		this.bebeDrinks = bebeDrinks;
	}

//
	public static boolean isEstaDeTpm() {
		return estaDeTpm;
	}

	public static boolean isBebeDrinks() {
		return bebeDrinks;
	}

	public void pagarConta() {
		System.out.println("@overRide da clase DAS MULHERES.");
	}
	
}
