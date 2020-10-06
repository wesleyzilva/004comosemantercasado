package pilarPooPolimorfismoSobreposicaoSobrecarga;

//SUB CLASSE DE ANIMAL (especialização)
public class Ave extends Animal {

	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public void fazNinho() {
		System.out.println("faz ninho...");
	}

	@Override
	public void alimenta() {
		System.out.println("comendo frutas...");
	}

	@Override
	public void locomove() {
		System.out.println("voando...");
	}

	@Override
	public void emiteSom() {
		System.out.println("piu piu...");
	}
}
