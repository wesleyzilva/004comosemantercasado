package pilarPooPolimorfismo;

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

		System.out.println("==========================Mamífero");
		animalMamifero.alimenta();
		animalMamifero.locomove();
		animalMamifero.emiteSom();
		System.out.println("==========================Reptil");
		animalReptil.alimenta();
		animalReptil.locomove();
		animalReptil.emiteSom();
		System.out.println("==========================Ave");
		animalAve.alimenta();
		animalAve.locomove();
		animalAve.emiteSom();
		animalAve.fazNinho();

		System.out.println("==========================Peixe");
		animalPeixe.alimenta();
		animalPeixe.locomove();
		animalPeixe.emiteSom();
	}

}
