using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkControl
{
    public class Truck : Vehicle
    {
        public int Axles { get; set; }
        public double FeePerAxle { get; set; }

       

        public Truck(string model, int hours, double pricePerHour, int axles, double feePerAxle)
            : base(model, hours, pricePerHour)
        {
            Axles = axles;
            FeePerAxle = feePerAxle;
        }

        public override double Payment()
        {
            return (Hours * PricePerHour) + (Axles * FeePerAxle);
        }
    }
}
