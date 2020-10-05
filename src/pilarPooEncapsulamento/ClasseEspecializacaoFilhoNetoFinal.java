package pilarPooEncapsulamento;

//Herança da diferença
//Classe FINAL é estéril, não pode ter filhos.
public final class ClasseEspecializacaoFilhoNetoFinal extends ClasseDosFilhos {

	private int mesada;

	// Método final: não pode ser sobrescrito (polimorfismo)
	// Não pode gerar especialização
	// @Override
	private final void ensinaTecnologia() {

	}

	@Override //Pagar mensalidade do Neto não é a mesma coisa do Filho
	public void pagarConta() {
		System.out.println("@overRide da clase DOS NETOS.");
	}

}
