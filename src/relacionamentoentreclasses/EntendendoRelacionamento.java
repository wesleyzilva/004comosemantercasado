package relacionamentoentreclasses;
//CO MER NA DA
//Objeto é uma instância de uma classe
//É HP : pilares do POO

//Agregação e uma instancia que "tem uma" instancia.
//Encapsumaneto usa interfaces
public class EntendendoRelacionamento {

	public static void main(String[] args) {

//		ClasseDosFilhos.setEmCasa(false);
//		System.out.println("ClasseDosFilhos.isEmCasa = "+ClasseDosFilhos.isEmCasa());

		// Criando diferentes situações com as instancias das esposas
		ClasseDasMulheres mulher[] = new ClasseDasMulheres[8];
		/*
		 * @estaDeTpm &&
		 * 
		 * @bebeDrinks ||
		 * 
		 * @filhoEmCasa
		 */
		mulher[0] = new ClasseDasMulheres(false, true, false);
		System.out.println("CASAL1 - Retorno do instanciamento da Mulher");
		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
		System.out.println("-------------------");

//		mulher[1] = new ClasseDasMulheres(true, true, false); //
//		System.out.println("CASAL2 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");
//		mulher[2] = new ClasseDasMulheres(true, false, true);
//		System.out.println("CASAL3 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");
//		mulher[3] = new ClasseDasMulheres(false, true, true);
//		System.out.println("CASAL4 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");
//		mulher[4] = new ClasseDasMulheres(true, false, false); //
//		System.out.println("CASAL5 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");
//		mulher[5] = new ClasseDasMulheres(false, false, true);
//		System.out.println("CASAL6 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");
//		mulher[6] = new ClasseDasMulheres(false, true, false);
//		System.out.println("CASAL7 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");
//		mulher[7] = new ClasseDasMulheres(false, false, false);
//		System.out.println("CASAL8 - Retorno do instanciamento da Mulher");
//		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
//		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
//		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
//		System.out.println("-------------------");

		// Teste de instanciamento do homem e seus métodos
		ClasseDosHomens homem[] = new ClasseDosHomens[1];
		homem[0] = new ClasseDosHomens();
//		ClasseDosHomens.querSexo();

		System.out.println(">>>CASAL1 -rolaSexo");
		//CASAL1 um novo objeto da classe Casamento
		Casamento casal1 = new Casamento();
		casal1.rolaSexo(mulher[0], homem[0]);
		System.out.println(ClasseDasMulheres.isBebeDrinks());
		System.out.println(ClasseDasMulheres.isEstaDeTpm());
		System.out.println(ClasseDosFilhos.isEmCasa());

//		System.out.println(">>>CASAL2 - rolaSexo");
//		Casamento casal2 = new Casamento();
//		casal2.rolaSexo(mulher[1], homem[0]);
//
//		System.out.println(">>>CASAL3 - rolaSexo");
//		Casamento casal3 = new Casamento();
//		casal3.rolaSexo(mulher[2], homem[0]);
//
//		System.out.println(">>>CASAL4 - rolaSexo");
//		Casamento casal4 = new Casamento();
//		casal4.rolaSexo(mulher[3], homem[0]);
//
//		System.out.println(">>>CASAL5 - rolaSexo");
//		Casamento casal5 = new Casamento();
//		casal5.rolaSexo(mulher[4], homem[0]);
//
//		System.out.println(">>>CASAL6 - rolaSexo");
//		Casamento casal6 = new Casamento();
//		casal6.rolaSexo(mulher[5], homem[0]);
//
//		System.out.println(">>>CASAL7 - rolaSexo");
//		Casamento casal7 = new Casamento();
//		casal7.rolaSexo(mulher[6], homem[0]);
//
//		System.out.println(">>>CASAL8 - rolaSexo");
//		Casamento casal8 = new Casamento();
//		casal8.rolaSexo(mulher[7], homem[0]);

	}
}
