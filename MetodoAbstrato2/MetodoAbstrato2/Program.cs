using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using MetodoAbstrato2;

Console.WriteLine("Digite a quantidade de pagantes de impostos");
int n = int.Parse(Console.ReadLine());
List<TaxPayer> Lista1 = new List<TaxPayer>();

for (int i = 0; i < n; i++)
{
    Console.WriteLine("É uma companhia ou individual ? ( i / c )");
    char answer = char.Parse(Console.ReadLine());

    if (answer == 'i')
    {
        Console.WriteLine("Digite o nome do pagante");
        string name = Console.ReadLine();
        Console.WriteLine("Digite o quanto o pagante recebeu durante o ano");
        double anualincome = double.Parse(Console.ReadLine());
        Console.WriteLine("Digite o quanto o pagante gastou com saúde");
        double healthexpenditures = double.Parse(Console.ReadLine());
        Individual individual = new Individual(anualincome,name,healthexpenditures);
        Lista1.Add(new Individual(healthexpenditures,name, anualincome));
    }
    if (answer == 'c')
    {
        Console.WriteLine("Digite o nome da companhia");
        string name = Console.ReadLine();
        Console.WriteLine("Digite o quanto a companhia recebeu durante o ano");
        int anualincome = int.Parse(Console.ReadLine());
        Console.WriteLine("Quantos funcionários a companhia tem ?");
        int employees = int.Parse(Console.ReadLine());
        Company company = new Company(anualincome,name,employees);
        Lista1.Add(new Company(employees, name, anualincome));
    }
    double sum = 0;
    foreach (TaxPayer obj in Lista1)
    {
        double tax = obj.Tax();
        Console.WriteLine("Nome: " + obj.Name + " Total de impostos: " + tax.ToString());
        
    }
}