package msn.apps;

public class FacebookMessenger extends ServidorMensagem {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        
        System.out.println("ENVIANDO MENSAGEM PELO FACEBOOK");
    }
    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK");
    }
    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTORICO MESSENGER");
    }
}
