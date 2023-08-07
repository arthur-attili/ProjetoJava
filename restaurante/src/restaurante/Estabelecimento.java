package restaurante;

import restaurante.area.cliente.Cliente;
import restaurante.atendiment.Atendente;
import restaurante.atendimento.cozinha.Almoxarife;
import restaurante.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Almoxarife almoxarife = new Almoxarife();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();

        // Ações que não precisam estar disponíveis
        // cozinheiro.baterSuco();
        // cozinheiro.fritarIngredientesPrato();
        // cozinheiro.pedirIngredientes(almoxarife);

        // Ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarCombo();
        cozinheiro.adicionarPrato();
        cozinheiro.adicionarSuco();

        // Ações do almoxarife
        // almoxarife.controlarSaida();
        // almoxarife.trocarGaz();
        // almoxarife.entregarIngredientes();

        // Ações do atendente
        atendente.servirMesa();
        atendente.receberPagamento();
        // Ação que somente o pacote cozinha deve ver
        // atendente.trocarGaz();

        // Ações do cliente
        cliente.fazerPedido();
        // cliente.escolherPrato();
        cliente.pedirConta();

        // Ação sigilosa
        // cliente.consultarSaldo();

        // Imaginem clientes ouvindo o cozinheiro
        // cozinheiro.pedirTrocarGaz(atendente);
    }
}
