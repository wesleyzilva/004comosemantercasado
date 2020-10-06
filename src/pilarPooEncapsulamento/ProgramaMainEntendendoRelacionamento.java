package pilarPooEncapsulamento;

import pilarPooHerancaImplementacaoDiferenca.ClasseDasPessoasAbstrata;

//CO MER NA DA

//Objeto é uma instância de uma classe
//É HP : pilares do POO

//Agregação e uma instancia que "tem uma" instancia.
//Encapsumaneto usa interfaces
public class ProgramaMainEntendendoRelacionamento {

	public static void main(String[] args) {

//		ClasseDosFilhos.setEmCasa(false);
//		System.out.println("ClasseDosFilhos.isEmCasa = "+ClasseDosFilhos.isEmCasa());

		// Teste de instanciamento do homem e seus métodos da classe do tipo abstrato
		// ClasseDosHomens
		ClasseDosHomens homem[] = new ClasseDosHomens[1];
		homem[0] = new ClasseDosHomens();
//		ClasseDosHomens.querSexo();

		ClasseDoVisitante visita = new ClasseDoVisitante();

		ClasseDosFilhos filho = new ClasseDosFilhos();
		filho.setEmCasa(true);

		ClasseEspecializacaoFilhoNetoFinal neto = new ClasseEspecializacaoFilhoNetoFinal();

		// Criando diferentes situações com as instancias das esposas
		ClasseDasMulheres mulher[] = new ClasseDasMulheres[8];
		/*
		 * @estaDeTpm &&
		 * 
		 * @bebeDrinks ||
		 * 
		 * @filhoEmCasa
		 */
		mulher[0] = new ClasseDasMulheres(false, true);
		mulher[0].setEstaDeTpm(true);
//		mulher[0] = new ClasseDasMulheres(false, true, false);
		System.out.println("CASAL1 - Retorno do instanciamento da Mulher");
		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
		System.out.println("-------------------");

		System.out.println(">>>CASAL1 -rolaSexo");
		// CASAL1 um novo objeto da classe Casamento
		Casamento casal1 = new Casamento();

		casal1.rolaSexo(mulher[0], homem[0]);

		System.out.println(ClasseDasMulheres.isBebeDrinks());
		System.out.println(ClasseDasMulheres.isEstaDeTpm());
		System.out.println(ClasseDosFilhos.isEmCasa());

		mulher[1] = new ClasseDasMulheres(true, true);
		mulher[1].setBebeDrinks(false);
		// mulher[1] = new ClasseDasMulheres(true, true, false);
		System.out.println("CASAL2 - Retorno do instanciamento da Mulher");
		System.out.println("|estaDeTpm? " + ClasseDasMulheres.isEstaDeTpm());
		System.out.println("|bebeDrinks? " + ClasseDasMulheres.isBebeDrinks());
		System.out.println("|filhosEmCasa? " + ClasseDosFilhos.isEmCasa());
		System.out.println("-------------------");

		System.out.println(">>>CASAL2 - rolaSexo");
		Casamento casal2 = new Casamento();
		casal2.rolaSexo(mulher[1], homem[0]);

		// TESTES DE HERANÇA
		System.out.println();
		System.out.println("-----TESTE E CONCEITOS DE HERANÇA-----");
		System.out.println("HERANÇA DA DIFERENÇA: Herda, porém também tem novas ações e atributos");
		System.out.println(
				">>> Filho, Homem, Mulher e Netos herdam caracteristicas de pessoas, porém também tem novas funcionalidades/particularidades");
		System.out.println("");
		System.out.println("HERANÇA DE IMPLEMENTAÇÃO (pobre): Apenas herda e utiliza a herança");
		System.out.println(
				">>>Visita extende pessoas, porém não acrescenta nenhuma funcionalidade, apenas utiliza a herança de pessoas."
						+ "");
		System.out.println();
		System.out.println("ABSTRATO: declarado, mas não implementado na projenitora. Usado apenas em interface");
		System.out.println(">>>Classe de pessoas é abstrata.");
		System.out.println("");
		System.out.println("FINAL: Não pode ser sobrescrito e gerar especialização e nem gerar filhos");
		System.out.println(">>>Classe da especialização dos netos não pode gerar bisnetos e ser sobrescrita");
		System.out.println("");
		System.out.println("VEJA EXEMPLOS NO CODIGO: ");
		filho.setNome("Heitor");
		filho.setEstadoCcivil("S");
		mulher[0].setNome("Daiana");
		mulher[0].setIdade(38);
		mulher[0].fazerAniversario();
		filho.chegaEmCasa(); // Herda e implementa a diferença
		visita.fazerAniversario(); // Herda apenas as caracteristicas de pessoa

		// ClasseDasPessoasAbstrata pessoa = new ClasseDasPessoasAbstrata(); //Classe
		// abstrata não pode ser instanciada

		System.out.println(filho.toString());
		System.out.println(mulher[0].toString());

		mulher[0].pagarConta();
		homem[0].pagarConta();
		filho.pagarConta();
		neto.setNome("Nome do neto");
		neto.pagarConta();

		
	}
}
