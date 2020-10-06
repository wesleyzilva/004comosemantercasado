package pilarPooPolimorfismo;

public class Canguru extends Mamifero {

	void usaBosa() {
		System.out.println("usando bolsa...");
	}

	@Override
	public void locomove() { // Possui a mesma assinatura do método
		System.out.println("pulando...");
	}
}
