package pilarPooPolimorfismo;

public class Peixe extends Animal {

	private String corEscama;

	void soltaBolha() {
	}

	@Override
	public void alimenta() {
System.out.println("comendo substancias...");
	}

	@Override
	public void locomove() {
		System.out.println("nadando...");
	}

	@Override
	public void emiteSom() {
		System.out.println("Não faz som...");
	}
}
