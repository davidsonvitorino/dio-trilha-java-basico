import java.util.Scanner;



public class ContaTerminal{
    private String numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(String numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo!");

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite a agência da conta: ");
        String agenciaConta = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numeroConta, agenciaConta, nomeCliente, saldoInicial);
    }
    
}