public class Substituto extends Professor {
    private double adicionalDeslocamento;

    public Substituto(String nome, int horas, double valorPorHora, double adicionalDeslocamento) {
        super(nome, horas, valorPorHora);
        this.adicionalDeslocamento = adicionalDeslocamento;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + adicionalDeslocamento;
    }
}
