import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar (parametroUm, parametroDois);

        } catch (ParametroInvalidoException e) {
            
            System.out.println(e.getMessage());
        }finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm >= parametroDois) {
            throw new ParametroInvalidoException();
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
    
}
