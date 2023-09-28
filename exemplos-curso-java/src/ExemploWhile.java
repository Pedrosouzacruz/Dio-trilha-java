import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;

        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce valor: "+ valorDoce + "adicionado ao carrinho.");
            mesada -= valorDoce;
        }
        System.out.println("Total: " + mesada);
        System.out.println("Sua mesada acabou!");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);

    }
}
