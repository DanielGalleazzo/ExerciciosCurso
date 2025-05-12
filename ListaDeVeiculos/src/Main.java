import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CarroNovo> carro = new ArrayList<>();
        System.out.println("Quantos carros você deseja cadastrar ?");
        int qntd = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < qntd; i++) {
            System.out.println("O carro é novo ou é usado ?");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("Novo")) {
                System.out.println("Qual é a marca do carro ?");
                String Marca = scanner.nextLine();
                System.out.println("Qual é o modelo do carro ?");
                String Modelo = scanner.nextLine();
                System.out.println("Qual é o ano do carro ?");
                int ano = Integer.parseInt(scanner.nextLine());
                System.out.println("Qual é o preço do carro ?");
                double preco = Double.parseDouble(scanner.nextLine());
                carro.add(new CarroNovo(Marca, Modelo, ano, preco));
            }
            if (resposta.equalsIgnoreCase("Usado")) {
                System.out.println("Qual é a marca do carro ?");
                String Marca = scanner.nextLine();
                System.out.println("Qual é o modelo do carro ?");
                String Modelo = scanner.nextLine();
                System.out.println("Qual é o ano do carro ?");
                int ano = Integer.parseInt(scanner.nextLine());
                System.out.println("Qual é o preço do carro ?");
                double preco = Double.parseDouble(scanner.nextLine());
                System.out.println("Qual é a kilometragem do carro ?");
                int kilometragem = Integer.parseInt(scanner.nextLine());
                carro.add(new CarroUsado(Marca, Modelo, ano, preco, kilometragem));
            }
        }
        for (CarroNovo c : carro) {
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Ano: " + c.getAno());
            System.out.println("Preço: R$ " + c.getPreco());
            if (c instanceof CarroUsado) {
                CarroUsado usado = (CarroUsado) c;
                System.out.println("Quilometragem: " + usado.getKilometragem() + " km");
            }
        }
    }
}