/**
 * 
 */
package pilarPooEncapsulamento;

public class Casamento {
	// mulher0 e homem0 são instancias da classe usadas para a validação da regra.
	public void rolaSexo(ClasseDasMulheres mulher0, ClasseDosHomens homen0) {
		System.out.println("(estaDeTpm? " + mulher0.isEstaDeTpm());
		System.out.println("&& bebeDrinks?) " + mulher0.isBebeDrinks());
		System.out.println("|| filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
		if (mulher0.isEstaDeTpm() == true && mulher0.isBebeDrinks() == true
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("TTT ### Pode até rolar um banho.");

		} else if (mulher0.isEstaDeTpm() == true && mulher0.isBebeDrinks() == true
				&& ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("TTF #### Mandou mensagem pra ela hoje?");

		} else if ((mulher0.isEstaDeTpm() == true && mulher0.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("TFT ### Melhor ficar na sua");

		} else if ((mulher0.isEstaDeTpm() == false && mulher0.isBebeDrinks() == true)
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("FTT ### Molhando a carne tudo rola !!!");
			System.out.println(mulher0.isEstaDeTpm());
			System.out.println(mulher0.isBebeDrinks());
			System.out.println("---");

		} else if ((mulher0.isEstaDeTpm() == true && mulher0.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("TFF ### Melhor ficar no carinho...");

		} else if ((mulher0.isEstaDeTpm() == false && mulher0.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("FFT ### Rola uma rapidinha escondido !!!");

		} else if ((mulher0.isEstaDeTpm() == false && mulher0.isBebeDrinks() == true)
				|| ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("FTF ### Se der tudo certo tem Sexo.");

		} else if ((mulher0.isEstaDeTpm() == false && mulher0.isBebeDrinks() == false)
				|| ClasseDosFilhos.isEmCasa() == false) {
			System.out.println("FFF ### Desconheço este caso.");
		}
	}
}
