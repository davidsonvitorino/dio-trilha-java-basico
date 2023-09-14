import javax.print.DocFlavor.STRING;

public class Aula3Operadores {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 7;

        boolean simNao = numero1 == numero2;

        System.out.println("Número1 é igual a Número? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Número1 é difernte de Número2? "+ simNao);

        simNao = numero1 < numero2;
        System.out.println("Número1 é menor ou igual a Número2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Número1 é maior ou igua a número2? " + simNao);

        //Na compação de objetos, usamos a expressão "equals".

        /*String nomeUm = "Davidson";
        String nomeDois = "Davidson";

        System.out.println(nomeUm == nomeDois);*/

        String nomeUm = "Davidson";
        String nomeDois = new String("Davidson");

        System.out.println(nomeUm.equals(nomeDois));


    }
}
