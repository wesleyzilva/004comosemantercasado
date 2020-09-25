package pacote01;

public class EntendendoRelacionamento {

	public static void main(String[] args) {

//		ClasseDosFilhos.setEmCasa(false);
//		System.out.println("ClasseDosFilhos.isEmCasa = "+ClasseDosFilhos.isEmCasa());

		// Criando diferentes situações com as instancias das esposas
		ClasseDasMulheres mulher[] = new ClasseDasMulheres[3];
		/*
		 * @estaDeTpm
		 * @bebeDrinks
		 * @filhoEmCasa
		 */
		mulher[0] = new ClasseDasMulheres(true, true, true);
		System.out.println("Retorno do instanciamento da Mulher");
		System.out.printf("|estaDeTpm? "+mulher[0].isEstaDeTpm() + " |bebeDrinks? " + mulher[0].isBebeDrinks()+" |filhosEmCasa? "+mulher[0].isFilhosEmCasa());
		System.out.println("");
		mulher[1] = new ClasseDasMulheres(false, true, true);
		mulher[2] = new ClasseDasMulheres(true, false, true);
		mulher[3] = new ClasseDasMulheres(true, true, false);
		mulher[4] = new ClasseDasMulheres(false, false, false);
		mulher[5] = new ClasseDasMulheres(true, false, false);
		mulher[6] = new ClasseDasMulheres(false, true, false);
		mulher[7] = new ClasseDasMulheres(false, false, true);

		//Teste de instanciamento do homem e seus métodos
		ClasseDosHomens homem[] = new ClasseDosHomens[3];
		homem[0] = new ClasseDosHomens();
//		homem[0].querSexo();


		System.out.println("casal1");
		Casamento casal1 = new Casamento();
		casal1.rolaSexo(mulher[0], homem[0]);
		
		System.out.println("casal2");
		Casamento casal2 = new Casamento();
		casal2.rolaSexo(mulher[1], homem[0]);

		System.out.println("casal3");
		Casamento casal3 = new Casamento();
		casal3.rolaSexo(mulher[2], homem[0]);

		System.out.println("casal4");
		Casamento casal4 = new Casamento();
		casal1.rolaSexo(mulher[3], homem[0]);

		System.out.println("casal5");
		Casamento casal5 = new Casamento();
		casal1.rolaSexo(mulher[4], homem[0]);

		System.out.println("casal6");
		Casamento casal6 = new Casamento();
		casal1.rolaSexo(mulher[5], homem[0]);

	}
}
