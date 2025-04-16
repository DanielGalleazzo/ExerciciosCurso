using System;
using System.Collections.Generic;
using System.Globalization;
using Exercicio1Herancaepoli;

Console.WriteLine("Digite a quantidade de funcionários");
int n = int.Parse(Console.ReadLine());
Console.WriteLine("A quantidade de funcionários é de " + n);

List <Employee> Lista1 = new List<Employee>();

for (int i = 0; i < n; i++)
{
    Console.WriteLine(" É terceirizado ?");
    char resposta = char.Parse(Console.ReadLine());
    if (resposta == 's')
    {
        Console.WriteLine("Digite o nome do funcionário");
        string name = Console.ReadLine();
        Console.WriteLine("digite a quantidade de horas trabalhadas");
        int hours = int.Parse(Console.ReadLine());
        Console.WriteLine("Digite o valor por hora");
        double valueperhour = double.Parse(Console.ReadLine());
        Console.WriteLine("Custo adicional");
        double addcharge = double.Parse(Console.ReadLine());
        OutsourceEmployee OutEmp = new OutsourceEmployee(name,hours,valueperhour,addcharge);
        Lista1.Add(new OutsourceEmployee(name, hours, valueperhour, addcharge));



    }
    else if (resposta == 'n')
    {
        Console.WriteLine("Digite o nome do funcionário");
        string name = Console.ReadLine();
        Console.WriteLine("digite a quantidade de horas trabalhadas");
        int hours = int.Parse(Console.ReadLine());
        Console.WriteLine("Digite o valor por hora");
        double valueperhour = double.Parse(Console.ReadLine());
        Employee Emp = new Employee(name,hours, valueperhour);
        Lista1.Add(new Employee(name, hours, valueperhour));
    }
    else
    {
        Console.WriteLine("Resposta inválida");
    }
    foreach (Employee emp in Lista1)
    {
        Console.WriteLine(emp.Name + " - $ " + emp.Payment().ToString("F2"));
    }

}