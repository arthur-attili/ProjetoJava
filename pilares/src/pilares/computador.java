package pilares;

public class computador {
    public static void main(String[] args) {

        mensagem msn = new msn();
        mensagem facebook = new facebook();
        mensagem telegram = new telegram();

        msn.enviarMensagem();
        msn.receberMensagem();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
