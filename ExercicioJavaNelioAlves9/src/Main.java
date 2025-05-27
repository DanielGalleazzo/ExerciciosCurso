import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer inserir no primeiro grupo ?");
        int n1 = sc.nextInt();
        int[] vect = new int [n1];
        for(int i = 0; i < n1 ; i++){
            System.out.println("Insira os numeros do primeiro grupo");
            vect[i] = sc.nextInt();
        }
        System.out.println("Quantos números você quer inserir no segundo grupo ?");
        int n2 = sc.nextInt();
        int[] vect1 = new int[n2];
        for(int i = 0; i <n2 ; i++){
            System.out.println("Insira os numeros do segundo grupo");
            vect1[i] = sc.nextInt();
        }
        int soma = 0;

        System.out.println("A soma dos números de acordo com as suas posições é de: ");

        for ( int i = 0; i < n2 ; i++){
            soma = vect1[i] + vect[i];
            System.out.println(soma);
        }
    }
}