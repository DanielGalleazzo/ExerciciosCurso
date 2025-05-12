public class CarroNovo {
    protected String Marca;
    protected String Modelo;
    protected int Ano;
    protected double Preco;

    public CarroNovo(String Marca, String Modelo, int Ano, double Preco){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.Preco = Preco;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public double getPreco() {
        return Preco;
    }
}

