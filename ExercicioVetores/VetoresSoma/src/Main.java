import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        //terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        //o vetor C gerado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor ?");
        int n = sc.nextInt();

        int[] vetor1 = new int [n];
        int[] vetor2 = new int [n];

        for(int i = 0; i < n ; i++){
            System.out.println("Digite os valores para o vetor A");
            vetor1[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++){
            System.out.println("Digite os valores para o vetor B");
            vetor2[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Soma de cada posição");
            soma = vetor1[i] + vetor2[i];

            System.out.println("Soma da posição: " + i);
            System.out.println(soma);
        }

    }
}