/**
 * 
 */
package pacote01;


public class Casamento {

	
	
	public void rolaSexo(ClasseDasMulheres mulher0, ClasseDosHomens homen0) {
		System.out.println("LOG ClasseDasMulheres |estaDeTpm " + ClasseDasMulheres.isEstaDeTpm() + " |filhosEmCasa "
				+ ClasseDosFilhos.isEmCasa() + " |bebeDrinks " + ClasseDasMulheres.isBebeDrinks());
		if (mulher0.isEstaDeTpm()==true && ClasseDosFilhos.isEmCasa()==true) {
			System.out.println("Sem sexo.");
		} else if (mulher0.isBebeDrinks()==true) {
			System.out.println("Pode rolar uma rapidinha.");
		} else  {
			System.out.println("Se lascou");
		}{

		}{

		}
	
	}
}
