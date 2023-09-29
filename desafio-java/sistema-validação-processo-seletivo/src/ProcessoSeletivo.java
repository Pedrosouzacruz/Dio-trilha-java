import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args){
    ArrayList<String> candidatosEscolhidos = selecaoCandidato();
    for(String candidato:candidatosEscolhidos){  
        entrandoEmContato(candidato);
    }
    }
    static void analisarCandidato(double salarioPretendido){
        double salaraioBase = 2000.0;

        if(salaraioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salaraioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static ArrayList<String> selecaoCandidato(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIO", "PAULA", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "JORGE", "DANIELA"};

        int candidatoSelicionado = 0;
        int cadidatoAtual = 0;
        double salaraioBase = 2000.0;
        ArrayList<String> candidatosEscolhidos = new ArrayList<>();

        while (candidatoSelicionado < 5 && cadidatoAtual < candidatos.length){
            String candidato = candidatos[cadidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " Solicitou este valor de salário: "+ salarioPretendido);
            if (salaraioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga.");
                candidatoSelicionado++;
                candidatosEscolhidos.add(candidato); 
                
            }
            cadidatoAtual++;
            
        }
        System.out.println("\nCandidatos escolhidos:");
        for (String candidatoEscolhido : candidatosEscolhidos) {
            System.out.println("O Candidato selecionado foi: " + candidatoEscolhido);
        }
        return candidatosEscolhidos;
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void  entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }
            
        } while (continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato);
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato);
        }


    }


    // metodo auxiliar
    static Boolean atender(){
        return new Random().nextInt(3)==1;
    }
}

