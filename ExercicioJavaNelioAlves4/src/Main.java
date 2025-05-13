import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Qual é o preço do dólar ?");
    double CotacaoDolar = sc.nextDouble();
    System.out.print("Quantos doláres serão comprados ?");
    double DolarQntd = sc.nextDouble();
    CurrecyConverter cur = new CurrecyConverter(CotacaoDolar,DolarQntd);
    double Amount = cur.Amount();
    System.out.print("A quantia que deve ser paga em reais é de:" + Amount);
    }
}