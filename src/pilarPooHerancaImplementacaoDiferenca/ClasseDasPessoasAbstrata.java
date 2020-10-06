package pilarPooHerancaImplementacaoDiferenca;

/*Métodos e classes podem ser abstratas
 * Classe abstrata não gera objetos, apenas pode ser projenitora.
 * Método abstrato é declarado mas não implementado na projenitora.
 * 		Método abstrato é usado em interface ou em Classe abstrata
 * Classe final não pode ter herança e é estéril (não pode ter filhos)
 * Metodo final não pode ser sobrescrito (ter especialização)
*/

public abstract class ClasseDasPessoasAbstrata {
	// Uma classe abstrata não pode ser instanciada/ter filhos

	private String nome;
	private int idade;
	private boolean sexo;
	private String estadoCivil;

	public String getEstadoCcivil() {
		return estadoCivil;
	}

	public void setEstadoCcivil(String estadoCcivil) {
		this.estadoCivil = estadoCcivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "ClasseDasPessoas [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public final void fazerAniversario() {
// Método abstrato é declarado mas não implementado na projenitora.
// Método abstrato é usado em interface ou em Classe abstrata
// Método final: não pode ser sobrescrito (polimorfismo)
// @Override
		this.idade++;
	}

	public void pagarConta() {
	}
}
