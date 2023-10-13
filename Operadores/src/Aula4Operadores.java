package src;

public class Aula4Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condi;ões são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condi;ões forem verdadeiras");
        }
        System.out.println("Fim");
    }
}