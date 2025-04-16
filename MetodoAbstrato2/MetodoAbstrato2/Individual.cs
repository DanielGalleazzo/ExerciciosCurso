using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace MetodoAbstrato2
{
    class Individual : TaxPayer
    {
        public double HealthExpenditures { get; set; }

        public Individual() { }

        public Individual(double healthExpenditures, string name, double anualincome) : base(name, anualincome)
        {
            HealthExpenditures = healthExpenditures;
        }
        public override double Tax()
        {
            if (AnualIncome < 20000)
            {
                return AnualIncome * 0.15 - HealthExpenditures * 0.5;
            }
            else
            {
                return (AnualIncome * 0.25) - (HealthExpenditures * 0.50);
            }
        }

    }
}
