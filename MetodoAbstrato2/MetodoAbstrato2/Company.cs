using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetodoAbstrato2
{
    class Company : TaxPayer
    {
        public int NumberOfEmployees { get; set; }

        public Company() { }

        public Company (int numberOfEmployees, string name, double anualincome) : base ( name,anualincome)
        {
            NumberOfEmployees = numberOfEmployees;
        }
        public override double Tax()
        {
            if (NumberOfEmployees < 10)
            {
                return AnualIncome * 0.16;       
            }
            else
            {
                return AnualIncome * 0.14;
            }
        }


    }
}
