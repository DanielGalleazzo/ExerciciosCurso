import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota do primeiro semestre (OBS: A nota do primeiro semestre vale 30 pts");
        double Nota1 = sc.nextDouble();
        System.out.print("Insira a nota do segundo e terceiro semestre");
        double Nota2 = sc.nextDouble();
        System.out.print("Terceiro semestre: ");
        double Nota3 = sc.nextDouble();
        Student student = new Student(Nota1,Nota2,Nota3);
        double NotaFinal = student.NotaFinal();
        System.out.print("A nota final é de: " + NotaFinal + " pontos" );
        if (student.NotaFinal() < 60) {
            System.out.print("Reprovado !");
            System.out.print("Pontos faltando: " + student.PontosFaltando());
        }
        else {
            System.out.print("Passou, parabéns!!");
        }
    }
}