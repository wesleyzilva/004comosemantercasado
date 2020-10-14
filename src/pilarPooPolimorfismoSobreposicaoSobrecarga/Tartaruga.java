package pilarPooPolimorfismoSobreposicaoSobrecarga;

/* Para Herança os astributos NÃO PODEM DESCER O NÍVEL de publico para protected ou privado.
 * publico
 * protegido
 * privado
 * 
 * Porém pode subir o nível.
 */


public class Tartaruga extends Reptil {

	@Override
	public void locomove() {
		System.out.println("anda devagar...");
	}
}
