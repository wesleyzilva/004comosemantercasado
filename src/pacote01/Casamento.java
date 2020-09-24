/**
 * 
 */
package pacote01;

public class Casamento {

	public void rolaSexo(ClasseDasMulheres mulher0, ClasseDosHomens homen0) {
		System.out.println("LOG ClasseDasMulheres |estaDeTpm " + ClasseDasMulheres.isEstaDeTpm() + " |filhosEmCasa "
				+ ClasseDosFilhos.isEmCasa() + " |bebeDrinks " + ClasseDasMulheres.isBebeDrinks());
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
