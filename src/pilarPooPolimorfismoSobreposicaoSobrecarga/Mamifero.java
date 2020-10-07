package pilarPooPolimorfismoSobreposicaoSobrecarga;

public class Mamifero extends Animal {

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	private String corPelo;

	@Override //Sobreposição
	public void alimenta() {
		System.out.println("mamando...");
	}

	@Override
	public void locomove() {
		System.out.println("correndo...");
	}

	@Override //Sobreposição
	public void emiteSom() {
		System.out.println("som de mamífero...");
	}

}