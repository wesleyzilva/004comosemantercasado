package pilarPooEncapsulamento;

import pilarPooHeranca.ClasseDasPessoas;

public class ClasseDosFilhos extends ClasseDasPessoas {

	private static boolean emCasa;

	public static boolean isEmCasa() {
		return emCasa;
	}

	public void setEmCasa(boolean emCasa) {
		ClasseDosFilhos.emCasa = emCasa;
	}

	public void quemSaoPais() {

	}

	@Override
	public String toString() {
		return "ClasseDosFilhos [getEstadoCcivil()=" + getEstadoCcivil() + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", isSexo()=" + isSexo() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
