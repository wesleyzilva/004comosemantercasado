package pilarPooPolimorfismoSobreposicaoSobrecarga;

public class validaExistenciaAnimal {
	/*
	 * Polimorfismo de sobreposição: Usando os mesmos métodos (nomes) e obtendo
	 * resultados direfenciados para cada objeto. CONCEITO: Acontece quando
	 * substituimos um método de uma superclasse na sua subclasse usando a mesma
	 * assinatura.
	 * 
	 */
	public static void main(String[] args) {

// Animal animal = new Animal(); //Classe abstrata não pode ser objeto

		Mamifero animalMamifero = new Mamifero();
		Peixe animalPeixe = new Peixe();
		Reptil animalReptil = new Reptil();
		Ave animalAve = new Ave();

		Cobra reptilCobra = new Cobra();
		Cachorro mamiferoCachorro = new Cachorro();
		Canguru mamiferoCanguru = new Canguru();
		Tartaruga reptilTartaruga = new Tartaruga();

		System.out.println("==========================Características basicas de um Mamífero");
		animalMamifero.alimenta();
		animalMamifero.locomove();
		animalMamifero.emiteSom();
		System.out.println("=========Polimorfismo de sobreposição");
		mamiferoCachorro.abanarRabo();
		mamiferoCanguru.locomove();
		mamiferoCanguru.alimenta();
		System.out.println("==========================Características basicas de um Reptil");
		animalReptil.alimenta();
		animalReptil.locomove();
		animalReptil.emiteSom();
		System.out.println("=========Polimorfismo de sobreposição");
		reptilCobra.locomove();
		reptilTartaruga.locomove();
		System.out.println("==========================Características basicas de um Ave");
		animalAve.alimenta();
		animalAve.locomove();
		animalAve.emiteSom();
		animalAve.fazNinho();

		System.out.println("==========================Características basicas de um Peixe");
		animalPeixe.alimenta();
		animalPeixe.locomove();
		animalPeixe.emiteSom();
		System.out.println("");
		System.out.println("RESUMO:");
		System.out.println("\n" + "POLIMORFISMO DE SOBREPOSIÇÃO: Usando os mesmos métodos (nomes) e obtendo\n"
				+ "resultados direfenciados para cada objeto. \n" + "CONCEITO: \n"
				+ "Acontece quando substituimos um método de uma superclasse na sua subclasse usando a mesma\n"
				+ "assinatura.");
	}

}
