package selecao_candidato;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Paulo", "Julia", "Augusto", "Monica", "Fabricio", "Gustavo", "Marcelo", "João"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecinado para a vaga");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisandoCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com uma contra proposta.");
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
