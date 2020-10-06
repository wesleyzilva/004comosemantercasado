package pilarPooEncapsulamento;

import pilarPooHerancaImplementacaoDiferenca.ClasseDasPessoasAbstrata;

public class ClasseDosHomens extends ClasseDasPessoasAbstrata {

//Agregação entre as Classes
	private ClasseDasMulheres estaDeTpm; // Tensão pós e pré menstrução
	private ClasseDosFilhos emCasa;

	static void querSexo() {
		System.out.println("Homem quer sexo:");
		System.out.println("LOG ClasseDosHomens |estaDeTpm " + ClasseDasMulheres.isEstaDeTpm() + " |filhosEmCasa "
				+ ClasseDosFilhos.isEmCasa() + " |bebeDrinks " + ClasseDasMulheres.isBebeDrinks());
		if (ClasseDasMulheres.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("Sem sexo.");
		} else if (ClasseDasMulheres.isBebeDrinks() == true) {
			System.out.println("Pode rolar uma rapidinha.");
		} else if (ClasseDasMulheres.isBebeDrinks() == false) {
			System.out.println("Não vai rolar.");
		}
	}

	private void querCarinho() {
	}

	private void querFazerExercicios() {
	}

	private void querRelaxarSozinho() {
	}

	private void querRelaxarComEsposa() {
	}

	private void querRelaxarComFillhos() {
	}

	public void pagarConta() {
		System.out.println("@overRide da clase DOS HOMENS.");
	}
}
