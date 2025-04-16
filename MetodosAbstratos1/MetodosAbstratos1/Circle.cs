using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetodosAbstratos1
{
    class Circle : Shape
    {
        public double Radius { get; set; }


        public Circle(double radius, Color color) : base(color)
        {
            Radius = radius;
        }
        public override double Area()
        {

            return Radius * Radius * Math.PI;



        }
    }
}
