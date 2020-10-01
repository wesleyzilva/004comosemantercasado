package pilarPooEncapsulamento;

//Herança para implementação, pois, herdam e também tem novos métodos.
import pilarPooHeranca.ClasseDasPessoasAbstrata;

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

}
