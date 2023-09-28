//criando uma exceção pontual ou personalizada
public class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido");
    }
}