import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de números desejada (MAX: 10");
        int n = sc.nextInt();
        int [] vect = new int [n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite os seus numeros");
            vect[i] = sc.nextInt();
        }

            for(int i = 0; i < n; i++) {
                if (vect[i] < 0) {
                    System.out.println("Numeros negativos");
                    System.out.println(vect[i]);
                }
            }


    }
}