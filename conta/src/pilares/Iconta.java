package pilares;

public interface Iconta {
	
	//resumo de tudo que a conta pode fazer
	
	
void sacar(double valor);	
void depositar(double valor);
void transferir(double valor, conta contaDestino);
	//método genérico, pois recebe tanto da conta corrente como da poupança
void imprimirExtrato();

}
