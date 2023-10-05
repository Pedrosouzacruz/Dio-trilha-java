public class Carro extends Veiculo {
    public void ligar(){
        confereCambio();
        checarCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void checarCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }

}
