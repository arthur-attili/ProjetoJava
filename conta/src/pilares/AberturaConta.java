package pilares;


public class AberturaConta {
	public static void main(String[] args) {
		conta cc = new ContaCorrente();
		cc.depositar(100);
		conta poupanca = new ContaPoupanca();
		//aqui esta o exemplo  de polimorfismo (cc /poupanca)
		// se eu trocar por iconta, tb da certo, pq ela implemanta conta
		cc.transferir(70, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}


}
