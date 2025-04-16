using System;
using System.Collections.Generic;
using MetodosAbstratos1; 

Console.WriteLine("Insira a quantidade de itens que serão lidos:");
int n = int.Parse(Console.ReadLine());

List<Shape> Lista = new List<Shape>();

for (int i = 0; i < n; i++)
{
    Console.WriteLine($"Forma #{i + 1}: É um retângulo ou um círculo? (R ou C)");
    char answer = char.Parse(Console.ReadLine().ToUpper());

    Console.WriteLine("Qual é a cor? (Preto / Azul / Vermelho)");
    string colorInput = Console.ReadLine();
    Color color = Enum.Parse<Color>(colorInput, true); 

    if (answer == 'R')
    {
        Console.WriteLine("Qual a largura?");
        double width = double.Parse(Console.ReadLine());

        Console.WriteLine("Qual a altura?");
        double height = double.Parse(Console.ReadLine());

        Lista.Add(new Rectangle(width, height, color));
    }
     else if (answer == 'C')
    {
        Console.WriteLine("Qual o raio do círculo?");
        double radius = double.Parse(Console.ReadLine());

        Lista.Add(new Circle(radius, color));
    }
    else
    {
        Console.WriteLine("Valor inválido");
    }
 

}

Console.WriteLine("ÁREAS DAS FORMAS:");
foreach (Shape shape in Lista)
{
    Console.WriteLine($"{shape.Area():F2}");
}
