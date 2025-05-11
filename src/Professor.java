public class Professor {
    protected String nome;
    protected int horas;
    protected double valorPorHora;

    public Professor(String nome, int horas, double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public double pagamento() {
        return horas * valorPorHora;
    }

    public String getNome() {
        return nome;
    }
}