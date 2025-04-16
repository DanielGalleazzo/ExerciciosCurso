

namespace ExercicioVetor
{
    internal class Metodo
    {
        public int Array1 { get; set; }
        public int Array2 { get; set; }
        public int Array3 { get; set; }


        public Metodo(int array1, int array2)
        {
            Array1 = array1;
            Array2 = array2;
            Array3 = array1 + array2;
        }

        public override string ToString()
        {

            return "A junção do array 1 com o array 2 é " + Array3;
        }
    }
}
