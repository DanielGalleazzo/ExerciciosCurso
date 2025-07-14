import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        //tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        //bem como os nomes dessas pessoas caso houver.


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você quer cadastrar ?");
        int n = sc.nextInt();
        String [] Pessoa = new String [n];
        int [] Idade = new int[n];
        double [] Altura = new double[n];

        for(int i = 0; i<n ; i++){
            System.out.println("Qual é o nome da pessoa:" + i );
            Pessoa[i] = sc.next();
            System.out.println("Qual é a idade da pessoa: " + i);
            Idade[i] = sc.nextInt();
            System.out.println("Qual é a altura da pessoa: " + i);
            Altura [i] = sc.nextDouble();
        }
        double somaAlturas   = 0.0;
        int    menores16     = 0;

        for (int i = 0; i < n; i++) {
            somaAlturas += Altura[i];
            if (Idade[i] < 16) {
                menores16++;
            }
        }

        double mediaAlturas        = somaAlturas / n;
        double percentualMenores16 = (double) menores16 * 100.0 / n;

        System.out.printf("%nAltura média: %.2f m%n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores16);

        if (menores16 > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (int i = 0; i < n; i++) {
                if (Idade[i] < 16) {
                    System.out.println(Pessoa[i]);
                }
            }
        }
    }
}