import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ContaBanco contaBanco;

        System.out.print("Insira o número da conta ");
        int Numero = sc.nextInt();
        System.out.print("Insira o nome do dono da conta");
        sc.nextLine();
        String Dono = sc.nextLine();
        System.out.print("É um depóstio inicial ?");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Insira o valor do depósito inicial ");
            double DepositoInicial = sc.nextDouble();
            contaBanco = new ContaBanco(Numero, Dono, DepositoInicial);
        }
        else {
            contaBanco = new ContaBanco(Numero, Dono);
        }

        System.out.println();
        System.out.println("Informações da conta: ");
        System.out.println(contaBanco);

        System.out.print("Insira o valor de um depósito ");
        double Deposito = sc.nextDouble();
        contaBanco.deposit(Deposito);
        System.out.println("Informações atualizadas");
        System.out.println(contaBanco);

        System.out.println();
        System.out.print("Insira a quantidade que deseja sacar");
        double withdrawValue = sc.nextDouble();
        contaBanco.withdraw(withdrawValue);
        System.out.println("Informações atualizadas");
        System.out.println(contaBanco);


        // estava fazendo esse codigo e meu irmao me perguntou " sabe o que eh uma lambda ? " e ele me lambeu
    }
}