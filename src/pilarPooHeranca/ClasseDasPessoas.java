package pilarPooHeranca;

public class ClasseDasPessoas {

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

	private void fazerAniversario() {
		this.idade++;
	}
	
}
