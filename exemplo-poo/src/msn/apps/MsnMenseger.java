package msn.apps;

public class MsnMenseger extends ServidorMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        
        System.out.println("ENVIANDO MENSAGEM PELO MSN");
    }
    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO MSN");
    }
    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTORICO MSN");
    }
}
