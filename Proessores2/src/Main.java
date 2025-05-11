import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Professores> professores = new ArrayList<>();

        System.out.print("Quantos professores deseja registrar? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nProfessor #" + (i + 1));
            System.out.print("É substituto (s/n)? ");
            String resposta = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas semanais: ");
            int horas = Integer.parseInt(sc.nextLine());
            System.out.print("Valor por hora: ");
            double valorPorHora = Double.parseDouble(sc.nextLine());

            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Adicional de deslocamento: ");
                double adicional = Double.parseDouble(sc.nextLine());
                professores.add(new Substituto(nome, horas, valorPorHora, adicional));
            } else {
                professores.add(new Professores(nome, horas, valorPorHora));
            }
        }

        System.out.println("\nPAGAMENTOS:");
        for (Professores prof : professores) {
            System.out.printf("%s - R$ %.2f%n", prof.getNome(), prof.pagamento());
        }

        sc.close();
    }
}
