package restaurante.atendimento.cozinha;

import restaurante.atendiment.Atendente;

public class Cozinheiro {
	
	public void adicionarPrato() {
		System.out.println("Adionando Prato");
	}

	public void adicionarSuco() {
		System.out.println("Adionando Suco");
	}
	public void adicionarCombo() {
		adicionarPrato();
		adicionarSuco();	
	
	}

	private void prepararPrato() {
		System.out.println("preparando prato");
	}
	
	private void prepararSuco() {
		System.out.println("preparando suco");
	}
	

	private void prepararCombo() {
		prepararPrato();
		prepararSuco();
	}
	
	private void selecionarIngredientesPrato() {
		System.out.println("selecionando ingredientes prato");
	}
	private void selecionarIngredientesSuco() {
		System.out.println("selecionando ingredientes suco");
	
	}
	
	private void baterSuco() {
		System.out.println("batendo suco");
		
	}
	
	private void fitarIngredientesPrato() {
		System.out.println("fritando ingredientes");
	}
	
	//public void pedirTrocarGaz(Atendente atendente) {
	//atendente.trocarGaz();}	
	
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
	/* Um cozinheiro faz várias ações e nessas ações pode depender de outras classes.
	 * ex da troca do gaz*/
	
	
}

