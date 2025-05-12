import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Rectangle> rectangleList = new ArrayList<>();
        System.out.println("Área, perímetro e a diagonal de um retângulo");
        System.out.println("Insira a altura: ");
        double Height = sc.nextDouble();
        System.out.println("Insira a largura");
        double Width = sc.nextDouble();
        Rectangle rect = new Rectangle(Height,Width);
        rectangleList.add(rect);
        System.out.println("Área: " + rect.Area());
        System.out.println("Perímetro: " + rect.Perimeter());
        System.out.println("Diagonal: " + rect.Diagonal());

    }
}