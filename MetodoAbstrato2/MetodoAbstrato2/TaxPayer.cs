using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetodoAbstrato2
{
    abstract class TaxPayer
    {
        public string Name { get; set; }
        public double AnualIncome { get; set; }

        public TaxPayer() { }

        public TaxPayer(string name, double anualincome)
        {
            Name = name;
            AnualIncome = anualincome;
        }
        public abstract double Tax();
    }
}
