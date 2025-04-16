using System.Collections.Generic;
using System.ComponentModel;
using ExercicioPropostoHeranca;
Console.WriteLine("Insira a quantidade de produtos desejados para cadastro");
int n = int.Parse(Console.ReadLine());
List <Product> ListaProduto = new List<Product>();
List <ImportedProduct> ListaImportado = new List<ImportedProduct>();
List <UsedProduct> ListaUsado = new List<UsedProduct>();    
for (int i = 0; i < n; i++)
{
    Console.WriteLine("O produto é usado, importado ou comum?  ( c / u / i ) ");
    char answer = char.Parse(Console.ReadLine());
    if (answer == 'i')
    {
        Console.WriteLine("Insira o nome dele");
        string name = Console.ReadLine();
        Console.WriteLine("Insira o preço dele");
        double price = double.Parse(Console.ReadLine());
        Console.WriteLine("Insira a taxa de importação");
        double customfee = double.Parse(Console.ReadLine());
        ImportedProduct Imp = new ImportedProduct(name,price,customfee);
        ListaImportado.Add(new ImportedProduct(name, price, customfee));
    }
    if (answer == 'u')
    {
        Console.WriteLine("Insira o nome do produto");
        string name = Console.ReadLine() ;
        Console.WriteLine("Insira o preço dele");
        double price = double.Parse (Console.ReadLine()) ;
        Console.WriteLine("Insira a data de fabricação");
        DateTime dateTime = DateTime.Parse(Console.ReadLine());
        UsedProduct Used = new UsedProduct(name,price,dateTime);
        ListaUsado.Add(new UsedProduct(name, price, dateTime));
    }
    if (answer == 'c')
    {
        Console.WriteLine("Insira o nome do produto");
        string name = Console.ReadLine();
        Console.WriteLine("Insira o preço do produto");
        double price = double.Parse(Console.ReadLine());
        Product product = new Product(name, price);
        ListaProduto.Add(new Product(name, price));
    }
    Console.WriteLine("Lista produtos importados");
    foreach (Product prod in ListaImportado)
    {
        Console.WriteLine(prod.PriceTag());
    }
    Console.WriteLine("Lista produtos usados");
    foreach (Product prod in ListaUsado)
    {
        Console.WriteLine(prod.PriceTag());
    }
    Console.WriteLine("Produtos Usados");
    foreach (Product prod in ListaProduto)
    {
        Console.WriteLine(prod.PriceTag());
    }
}