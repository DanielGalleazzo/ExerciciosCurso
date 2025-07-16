import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        //mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        //os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter nesse vetor ?");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n ; i++){
            System.out.println("Digite um número");
            vetor[i] = sc.nextDouble();

        }
        double soma = 0.0;
        for (int i = 0; i < n ; i++){
            soma = soma + vetor[i];
        }
        double media = soma / n ;

        System.out.println("A media dos vetores é: " + media);

        for(int i = 0; i < n ; i++){
            if (media > vetor[i]){
                System.out.println("O vetor da posição: " + i + " está abaixo da média");
            }

        }
    }
}