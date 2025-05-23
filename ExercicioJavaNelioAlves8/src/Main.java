import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos Numeros voce vai digitar ?");
        int n = sc.nextInt();
        int[] vect = new int [n];

        for (int i = 0; i < n ; i++){
            vect[i] = sc.nextInt();
        }
        int par = 0;
        for (int i = 0; i < n; i++){
            if(vect[i] % 2 == 0){
                System.out.println("Numeros pares" + vect[i]);
                par++;
            }
        }
        System.out.println("Quantidade de pares: " + par);



    }
}