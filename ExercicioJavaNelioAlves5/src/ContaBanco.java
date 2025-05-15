public class ContaBanco {

    private int ContaBanco;
    private String Dono;
    private double Saldo;

    public ContaBanco(int ContaBanco, String Dono) {
        this.ContaBanco = ContaBanco;
        this.Dono = Dono;
    }

    public ContaBanco(int ContaBanco, String Dono, double DepositoInicial) {
        this.ContaBanco = ContaBanco;
        this.Dono = Dono;
        deposit(DepositoInicial);
    }

    public int Numero() {
        return ContaBanco;
    }

    public String Dono() {
        return Dono;
    }

    public void Dono(String Dono) {
        this.Dono = Dono;
    }

    public double Saldo() {
        return Saldo;
    }

    public void deposit(double Quantidade) {
        Saldo += Quantidade;
    }

    public void withdraw(double Quantidade) {
        Saldo -= Quantidade + 5.0;
    }

    public String toString() {
        return "Conta: "
                + ContaBanco
                + ", Dono: "
                + Dono
                + ", Quantidade: $ "
                + String.format("%.2f", Saldo);
    }
}