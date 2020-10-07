package pilarPooPolimorfismoSobreposicaoSobrecarga;

// PREMISSA: Necessário relembrar e entender assinatura de métodos.
// Poliformismo de sobreposição.
// Polimorfismo de sobrecarga.

//SUPER CLASSE (Generalização) : Compartilha um design comum para as classes de herança
public abstract class Animal {

	protected float peso;
	protected int idade;
	protected int membros;

	// Quando tem método abstrato, sou obrigado á desenvolve-lo.
	public abstract void alimenta();

	public abstract void locomove();

	public abstract void emiteSom();
	
}
