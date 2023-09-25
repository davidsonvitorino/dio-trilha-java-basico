import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);
        var banco = "Caixa Economica";

        System.out.print("Digite o codigo do banco: ");
        int codigo = scanner.nextInt();
        if(codigo == 104){
            banco = "Caixa Economica Federal";
        }
        else if(codigo == 105){
            banco = "Bradesco";
        }
        else if(codigo == 106){
            banco = "Itaú";
        }else {
            banco = "Codigo invalido";
        }
        System.out.println("Banco: " + banco);

        System.out.print("Digite a sua agência: ");
        int agencia = scanner.nextInt();

    }
}