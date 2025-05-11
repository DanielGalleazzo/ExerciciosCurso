public class Substituto extends Professores {
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
