public class CarroUsado extends  CarroNovo{
    private int Kilometragem ;


    public CarroUsado(String Marca, String Modelo, int Ano, double Preco, int kilometragem) {
        super(Marca, Modelo, Ano, Preco);
        this.Kilometragem = kilometragem;
    }
    public int getKilometragem() {
        return Kilometragem;
    }
}
