import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
        //N funcionários. Não deve haver repetição de id.
        //Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
        //Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        //mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
        //conforme exemplos.
        //Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
        //ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
        //aumento por porcentagem dada.

        Scanner sc = new Scanner(System.in);

        List<Employee> lista = new ArrayList<>();
        System.out.println("Quantos funcionários serão registrados ?");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Insira o id do funcionário");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Salário: ");
            double salary = sc.nextDouble();
            lista.add(new Employee(id, name, salary));
        }

        System.out.println("Insira o id do funcionário que você quer atualizar o salário");
        int idUpdate = sc.nextInt();
        Employee emp = lista.stream().filter(x -> x.getId() == idUpdate).findFirst().orElse(null);
        System.out.print("Insira a porcentagem ( sem simbolos ): ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        for (Employee list : lista) {
            System.out.println(list);
        }
    }
}