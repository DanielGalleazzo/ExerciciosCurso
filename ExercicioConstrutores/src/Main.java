import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoInformacoes banco;


        System.out.println("Insira o número da conta");
        int NumeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o nome do proprietário");
        String Proprietario = sc.nextLine();
        System.out.println("Vai ter depósito inicial ?");
        String Resposta = sc.next();

        if (Resposta.equalsIgnoreCase("sim")) {
            System.out.println("Insira a quantidade do depósito inicial:");
            double depositoInicial = sc.nextDouble();
            banco = new BancoInformacoes(Proprietario, NumeroConta, depositoInicial);
        } else {
            banco = new BancoInformacoes(Proprietario, NumeroConta);
        }
        System.out.println("Insira a quantidade para depósito");
        System.out.println(banco);

        System.out.println("Insira a quantidade para depósito:");
        double valorDeposito = sc.nextDouble();
        banco.deposito(valorDeposito);

        System.out.println("Informações atualizadas da conta:");
        System.out.println(banco);

        System.out.println("Insira a quantidade para sacar");
        double ValorSaque = sc.nextDouble();
        banco.saque(ValorSaque);

        System.out.println("Informações atualizadas da conta:");
        System.out.println(banco);


        sc.close();
        
    }
}