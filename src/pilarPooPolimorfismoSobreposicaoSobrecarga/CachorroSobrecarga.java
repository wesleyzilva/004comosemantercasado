package pilarPooPolimorfismoSobreposicaoSobrecarga;

public class CachorroSobrecarga extends LoboSobreposicao {

	public String periodoDia;
	public boolean dono;

	void enterrarOsso() {
		System.out.println("enterrando osso...");
	}

	void abanarRabo() {
		System.out.println("abanando o rabo...");
	}

	// Observe que a assinatura (quantidade e tipos de atributos) do método é a
	// mesma na mãe e suas filhas.
	@Override
	public void emiteSom() {
		System.out.println("Cachorro faz: Au Au Au");
	}

	/*
	 * Abstração para SOBRECARGA para entendimento de POLIMORFISMO Varias formas de
	 * um cão reagir como: Frase agradavel ou não, se é o dono ou não ou diferença
	 * entre períodos do dia ou se é pesado ou leve
	 * 
	 * POLIMORFISMO DE SOBRECARGA tem assinaturas diferentes na mesma classe !!!
	 * 
	 */
	// Mesmo método que tenha ASSINATURAS DIFERENTES !!!

	//OBS: Static serve para referenciar todos aqueles atributos/métodos de classe, 
	//ou seja, que podem ser acessados diretamente da definição da classe, 
	//sem precisar instanciar nenhum objeto.
	public static void reagir(boolean dono) {
		if (dono) {
			System.out.println("abana rabo feliz !!!");
		} else {
			System.out.println("fica quieto e atento.");
		}
	}

	public static void reagir(String periodoDia) {
		if (periodoDia == "M") {
			System.out.println("fica super feliz...");
		} else if (periodoDia == "T") {
			System.out.println("late e pede comida...");
		} else if (periodoDia == "N") {
			System.out.println("fica na sua...");
		}
	}

}
