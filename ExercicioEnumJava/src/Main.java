import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
        //sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
        //o instante do sistema: new Date()
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Insira as informações do cliente");
            System.out.println("Qual o nome do cliente ?");
            String name = scanner.nextLine();
            System.out.println("Qual o e-mail do cliente ?");
            String email = scanner.nextLine();
            System.out.println("Qual a data de nascimento do cliente ?");
            Date birthDate = SDF.parse(scanner.next());
            Client client = new Client(name, email, birthDate);
            System.out.println("Qual a situação do pedido ?");
            OrderStatus status = OrderStatus.valueOf(scanner.next());
            Order order = new Order(new Date(), status, client);

            System.out.println("Quantos itens você irá adicionar ?");
            int n = scanner.nextInt();

            for (int i = 0; i < n ; i++){
                System.out.println("Insira as informações do item: " + i);
                scanner.nextLine();
                System.out.println("Qual o nome do item ? ");
                String itemName = scanner.nextLine();
                System.out.println("Qual o preço do item ?");
                double itemPrice = scanner.nextDouble();
                System.out.println("Qual a quantidade do item ?");
                int quantidadeItem = scanner.nextInt();
                Product product = new Product(itemName,itemPrice);
                OrderItem OI = new OrderItem(quantidadeItem,itemPrice,itemName);
                order.addItem(OI);

            }
            System.out.println("Resumo do pedido");
            System.out.println(order);
        }
        catch (Exception e) {
            throw new RuntimeException("A data está no formato inválido. Código do erro: " + e);
        }
    }
}