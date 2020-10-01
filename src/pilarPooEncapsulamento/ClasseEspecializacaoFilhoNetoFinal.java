package pilarPooEncapsulamento;

//Herança da diferença
//Classe estéril, não pode ter filhos.
public final class ClasseEspecializacaoFilhoNetoFinal extends ClasseDosFilhos {

	private int mesada;

	// Método final: não pode ser sobrescrito (polimorfismo)
	// Não pode gerar especialização
	// @Override
	private final void ensinaTecnologia() {

	}

}
