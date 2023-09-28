public class CaixaEletornica {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 37.00;

        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println(saldo);
        }

        else
            System.out.println("saldo insuficiente");
        

    }
}
