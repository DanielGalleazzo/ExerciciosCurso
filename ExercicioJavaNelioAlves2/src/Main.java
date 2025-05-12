import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário");
        String Name = sc.nextLine();
        System.out.println("Insira o salário bruto");
        double salarioBruto = sc.nextDouble();
        System.out.println("Insira o valor a ser descontado pelo imposto");
        double Tax = sc.nextDouble();
        Employee emp = new Employee(Name,salarioBruto,Tax);
        System.out.println("Nome do funcionário: " + emp.Name);
        System.out.println("Salário bruto: " + emp.NetSalary());
        System.out.println("Imposto: " + emp.Tax);

        System.out.println("Qual é a porcentagem que você quer aumentar ?");
        double porcentagem = sc.nextDouble();
        emp.IncreaseSalary(porcentagem);
        System.out.print("Dados atualizados:");
        System.out.println(emp);

    }
}