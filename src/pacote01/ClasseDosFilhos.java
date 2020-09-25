package pacote01;

public class ClasseDosFilhos {

	private static  boolean emCasa;

	public ClasseDosFilhos(boolean emCasa) {
		ClasseDosFilhos.emCasa = emCasa;
	}

	public static boolean isEmCasa() {
		return emCasa;
	}

	static void setEmCasa(boolean emCasa) {
		ClasseDosFilhos.emCasa = emCasa;
	}
}
