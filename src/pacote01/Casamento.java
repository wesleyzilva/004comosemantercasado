/**
 * 
 */
package pacote01;

public class Casamento {
	// mulher0 e homem0 são instancias da classe usadas para a validação da regra.
	public void rolaSexo(ClasseDasMulheres mulher0, ClasseDosHomens homen0) {
		System.out.println("(estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
		System.out.println("&& bebeDrinks?) " + ClasseDasMulheres.isBebeDrinks());
		System.out.println("|| filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
		if (ClasseDasMulheres.isEstaDeTpm() == true && ClasseDasMulheres.isBebeDrinks() == true
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("TTT ### Pode até rolar um banho.");

		} else if (ClasseDasMulheres.isEstaDeTpm() == true && ClasseDasMulheres.isBebeDrinks() == true
				&& ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("TTF #### Mandou mensagem pra ela hoje?");

		} else if ((ClasseDasMulheres.isEstaDeTpm() == true && ClasseDasMulheres.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("TFT ### Melhor ficar na sua");

		} else if ((ClasseDasMulheres.isEstaDeTpm() == false && ClasseDasMulheres.isBebeDrinks() == true)
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("FTT ### Molhando a carne tudo rola !!!");

		} else if ((ClasseDasMulheres.isEstaDeTpm() == true && ClasseDasMulheres.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("TFF ### Melhor ficar no carinho...");

		} else if ((ClasseDasMulheres.isEstaDeTpm() == false && ClasseDasMulheres.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("FFT ### Rola uma rapidinha escondido !!!");

		} else if ((ClasseDasMulheres.isEstaDeTpm() == false && ClasseDasMulheres.isBebeDrinks() == true)
				|| ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("FTF ### Se der tudo certo tem Sexo.");

		} else if ((ClasseDasMulheres.isEstaDeTpm() == false && ClasseDasMulheres.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("FFF ### Desconheço este caso.");
		}
	}
}
