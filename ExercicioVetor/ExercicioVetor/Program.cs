using System.ComponentModel;
using System.Runtime.InteropServices;
using System.Security.Cryptography.X509Certificates;

namespace Program
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite a quantidade de valores que você quer no primeiro array");
            int n = int.Parse(Console.ReadLine());
            int[] n1 = new int[n];
            Console.WriteLine("Digite a quantidade de valores que você quer no segundo array");
            int n2 = int.Parse(Console.ReadLine());
            int[] n3 = new int[n2];


            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("Digite os valores do primeiro array");
                n1[i] = int.Parse(Console.ReadLine());
                



            }
            for (int i = 0; i < n2; i++)
            {
                Console.WriteLine("Digite os valores do segundo array");
                n3[i] = int.Parse(Console.ReadLine());



            }




            




        }
    }
}
