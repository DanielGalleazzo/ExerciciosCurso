import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a área ?");
        String area = sc.next();
        System.out.println("Qual o nome desse funcionário ?");
        String name = sc.next();
        System.out.println("Qual é o cargo desse funcionário ?");
        String level = sc.next();
        System.out.println("Qual é o salário desse funcionário ?");
        double salario = sc.nextDouble();
        System.out.println("Quantos contratos esse funcionário vai ter ?");
        int contratosqntd = sc.nextInt();
        Worker worker = new Worker(name,WorkerLevel.valueOf(level),salario, new Department(area));
        for(int i = 0; i <= contratosqntd; i++){
            System.out.println("Insira as informações do contrato: " + i  );
            System.out.println("Qual é a data desse contrato ?");
            Date date = new Date();
            System.out.println("Quanto ele recebe por hora ?");
            double valorHoras = sc.nextDouble();
            System.out.println("Quantas horas ele trabalha ?");
            int horas = sc.nextInt();
            HourContract contract = new HourContract(date,valorHoras,horas);
        }
        System.out.println("Insira o mês e o ano para calcular o quanto você ira receber");
        String MesAno = sc.next();
        int month = Integer.parseInt(MesAno.substring(0, 2));
        int year = Integer.parseInt(MesAno.substring(3));
        System.out.println("O nome do funcionário é: " + worker.getName());
        System.out.println("O departamento do funcionário é: " + worker.department);
        System.out.println("Irá receber em " + MesAno + " : " +worker.income(year,month));
    }
}