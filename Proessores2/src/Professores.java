public class Professores {
    protected String nome;
    protected int horas;
    protected double valorPorHora;

    public Professores(String nome, int horas, double valorPorHora) {
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