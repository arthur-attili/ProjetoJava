package pilares;

public abstract class mensagem {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

}
