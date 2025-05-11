using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkControl
{
    public class Vehicle
    {
        public string Model { get; set; }
        public int Hours { get; set; }
        public double PricePerHour { get; set; }

        public Vehicle() { }

        public Vehicle(string model, int hours, double priceperhour) {
            Model = model;
            Hours = hours;
            PricePerHour = priceperhour;
        }

        public virtual double Payment ()
        {
            return Hours * PricePerHour;
        }
    }
}
