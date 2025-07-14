import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercício proposto:
        //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        //- Imprimir todos os elementos do vetor
        //- Mostrar na tela a soma e a média dos elementos do vetor

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer inserir no vetor ?");
        int n = sc.nextInt();

        int [] vect = new int [n];

        for ( int i = 0; i < n; i++){
            System.out.println("Adicione os valores para a quantidade de 'n'  " );
            vect[i] = sc.nextInt();
        }

        int soma = 0;

        for (int i = 0; i<n ; i++){
            soma = soma + vect[i];
        }

        int media = 0;

        for (int i = 0; i<n ; i++){
            media = soma / n ;
        }

        for (int i = 0; i<n; i++){
            System.out.println("Vetor da posição: " + i + " com valor de " + vect[i]);
        }

        System.out.println("A soma dos vetores é de:" + soma);
        System.out.println("A média dos vetores é de: " + media);


    }
}