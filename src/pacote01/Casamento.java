/**
 * 
 */
package pacote01;

public class Casamento {
	//mulher0 e homem0 são instancias da classe usadas para a validação da regra.
	public void rolaSexo(ClasseDasMulheres mulher0, ClasseDosHomens homen0) {
		System.out.println("LOG ClasseDasMulheres |estaDeTpm " + mulher0.isEstaDeTpm() + " |bebeDrinks "
				+ mulher0.isBebeDrinks() + " |isFilhosEmCasa " + mulher0.isFilhosEmCasa());
		if (mulher0.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == true && mulher0.isBebeDrinks() == false) {
			System.out.println("Duvidas, mandou mensagem no zap durante o dia?");
		}
		if (mulher0.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == false && mulher0.isBebeDrinks() == false) {
			System.out.println("MAYBE : Pode rolar uma rapidinha.");
		}
		if (mulher0.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == false && mulher0.isBebeDrinks() == false) {
			System.out.println("");
		}
		if (mulher0.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == true && mulher0.isBebeDrinks() == false) {
			System.out.println("");
		}
		if (mulher0.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == true && mulher0.isBebeDrinks() == true) {
			System.out.println("");
		}
	}
}
