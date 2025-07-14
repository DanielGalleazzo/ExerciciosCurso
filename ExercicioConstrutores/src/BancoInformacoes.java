public class BancoInformacoes {
    protected String nome;
    protected int conta;
    protected double saldo;

    public BancoInformacoes(String nome, int conta) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = 0.0;
    }

    public BancoInformacoes(String nome, int conta, double depositoInicial) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = depositoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double quantidade) {
        saldo += quantidade;
    }

    public void saque(double quantidade) {
        saldo -= (quantidade + 5);
    }
    public String toString (){
        return "Conta: " + conta +
                " Proprietário: " + nome +
                " saldo: " + saldo;
    }
}
