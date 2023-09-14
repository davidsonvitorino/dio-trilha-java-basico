package src;
public class Operadores {
    public static void main(String[] args) {
        //Concatenação
        String nomeCompleto = "Linguadem " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 2+3+2+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1" +(1+1+1);
        System.out.println(concatenacao);
    }
}
