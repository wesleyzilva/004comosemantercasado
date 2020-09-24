package pacote01;

public class ClasseDosHomens {

	private String estadoCivil;
	private int idade;
	private ClasseDasMulheres estaDeTpm; // Tensão pós e pré menstrução
	private ClasseDosFilhos emCasa;

	static void querSexo() {
		if (ClasseDasMulheres.isEstaDeTpm() == true && ClasseDosFilhos.isEmCasa() == true) {
			System.out.println("Sem sexo.");
		} else if (ClasseDasMulheres.isBebeDrinks() == true) {
			System.out.println("Pode rolar uma rapidinha.");
		}else if (ClasseDasMulheres.isBebeDrinks() == false) {
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

}
