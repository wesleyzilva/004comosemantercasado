package pilarPooPolimorfismo;

public class Reptil extends Animal {

	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void alimenta() {
		System.out.println("come insetos...");
	}

	@Override
	public void locomove() {
		System.out.println("rasteja...");
	}

	@Override
	public void emiteSom() {
		System.out.println("grune...");
	}
}
