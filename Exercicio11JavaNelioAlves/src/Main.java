//Exercício de fixação referehte ao capítulo 12

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> EmployeeList = new ArrayList<>();
        System.out.println("Insira a quantidade de funcionários");
        int n1 = sc.nextInt();
        for(int i = 0; i < n1 ; i++){
            System.out.println("É terceirizado? (s/n)");
            char resposta = sc.next().charAt(0);
            sc.nextLine(); // Consome quebra de linha
            System.out.println("Nome:");
            String name = sc.nextLine();
            System.out.println("Horas:");
            int hours = sc.nextInt();
            System.out.println("Valor por hora:");
            double valuePerHour = sc.nextDouble();
            if (resposta == 's') {
                System.out.println("Valor adicional:");
                double adicional = sc.nextDouble();
                EmployeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, adicional));
            } else {
                EmployeeList.add(new Employee(name, hours, valuePerHour));
            }
            sc.nextLine();
        }
        for(Employee emp : EmployeeList){
            System.out.println("Nome: " + emp.getName() + "Pagamento: " + emp.payment());
        }
        }

    }
