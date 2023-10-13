import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirella", "Daniella", "Daniel"};

        int candidatosAtual=0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor se sálario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }
    }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato.");
        }
        else if (salarioBase < salarioPretendido) {
            System.out.println("Ligar para candidato e fazer uma contra proposta.");
        }
        else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
