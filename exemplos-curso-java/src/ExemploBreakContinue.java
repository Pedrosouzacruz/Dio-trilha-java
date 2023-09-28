public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numeros = 1; numeros <=9; numeros ++){
            if (numeros == 3)
                continue;
            System.out.println(numeros);}
        for (int numero = 1; numero <=5; numero ++){
            if (numero == 3)
                break;
            System.out.println(numero);
        }
    }
}
