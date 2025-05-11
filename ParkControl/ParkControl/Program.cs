using ParkControl;

Console.WriteLine("Me diga a quantidade de veículos");
int n = int.Parse(Console.ReadLine());

List<Vehicle> Lista1 = new List<Vehicle>();


for (int i = 0; i < n; i++)
{
    Console.WriteLine("É um Carro ou um caminhão ?");
    string resposta = Console.ReadLine();
    if (resposta == "Carro")
    {
        Console.WriteLine("Qual é o modelo do carro ?");
        string Model = Console.ReadLine();
        Console.WriteLine("Quantas horas ele ficou estacionado ?");
        int Hours = int.Parse(Console.ReadLine());
        Console.WriteLine("Qual é o preço por hora ?");
        double PricePerHour = double.Parse(Console.ReadLine());
        Vehicle Vehicle = new Vehicle(Model, Hours, PricePerHour);
        Lista1.Add(Vehicle);
    }
    if (resposta == "Caminhão")
    {
        Console.WriteLine("Qual é o modelo do caminhão ?");
        string Model = Console.ReadLine();
        Console.WriteLine("Quantas horas você permaneceu estacionado ?");
        int Hours = int.Parse(Console.ReadLine());
        Console.WriteLine("Qual o valor por hora?");
        double pricePerHour = double.Parse(Console.ReadLine());
        Console.WriteLine("Quantos eixos tem o caminhão ?");
        int Axles = int.Parse(Console.ReadLine());
        Console.WriteLine("Quanto é a taxa por eixo do caminhão");
        double feePerAxles = double.Parse(Console.ReadLine());
        Truck truck = new Truck(Model, Hours, pricePerHour, Axles, feePerAxles);
        Lista1.Add(truck);
    }
    foreach (Vehicle vehicle in Lista1)
    {
        Console.WriteLine("Modelo do veículo: " + vehicle.Model + " Total a pagar pelo estacionamento:" + vehicle.Payment().ToString("F2"));

    }
}
