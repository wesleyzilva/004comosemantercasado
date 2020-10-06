package pilarPooEncapsulamento;

import pilarPooHerancaImplementacaoDiferenca.ClasseDasPessoasAbstrata;

public class ClasseDosFilhos extends ClasseDasPessoasAbstrata {

	private static boolean emCasa;

	public static boolean isEmCasa() {
		return emCasa;
	}

	public void setEmCasa(boolean emCasa) {
		ClasseDosFilhos.emCasa = emCasa;
	}

	public void quemSaoPais() {
	}

	public void chegaEmCasa() {
		setEmCasa(true);
	}

	@Override
	public String toString() {
		return "ClasseDosFilhos [EstadoCivil=" + getEstadoCcivil() + ", Nome=" + getNome() + ", Idade=" + getIdade()
				+ ", Sexo=" + isSexo() + "]";
	}

	// Caso o metodo for final na classe mãe o método não poderá ser sobreposto.
	public void pagarConta() {
		System.out.println(this.getNome() + " @overRide da clase DOS FILHOS.");
	}

}
