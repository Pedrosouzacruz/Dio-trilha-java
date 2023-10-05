package msn.apps;

public class Telegram extends ServidorMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        
        System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");
    }
    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");
    }
    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTORICO TELEGRAM");
    }
}
