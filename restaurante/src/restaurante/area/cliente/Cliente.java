package restaurante.area.cliente;

public class Cliente {

	public void escolhePrato() {
		System.out.println("escolhendo prato");
	}
	
	public void fazerPedido() {
		System.out.println("cliente realizndo pedido");
		}
	
	public void pedirConta() {
		System.out.println("solcitando conta");
		}
	public void pagar() {
		consultarSaldo();
		System.out.println("pagando");
		}
	private void consultarSaldo() {
		System.out.println("consulatando saldo no aplicativo");
		}
}
