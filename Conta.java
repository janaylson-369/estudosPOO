public class Conta {
    // Atributos encapsulados
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private boolean ativa;

    // Construtor: recebe número da conta e nome do cliente
    // contas começam ativas e com saldo igual a zero
    public Conta(int numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
        this.ativa = true;
    }

    // Depositar: só deposita se valor > 0 e conta ativa
    public boolean depositar(double valor) {
        if (valor > 0 && this.ativa) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    // Sacar: só saca se valor <= saldo e conta ativa
    public boolean sacar(double valor) {
        if (valor > 0 && this.ativa && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    // Desativar: só desativa se estiver ativa
    public boolean desativar() {
        if (this.ativa) {
            this.ativa = false;
            return true;
        }
        return false;
    }

    // Ativar: só ativa se estiver desativada
    public boolean ativar() {
        if (!this.ativa) {
            this.ativa = true;
            return true;
        }
        return false;
    }

    // Exibir: exibe todas as informações da conta (usa toString)
    public void exibir() {
        System.out.println(this.toString());
    }

    // Getters e Setters (encapsulamento)
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // toString: retorna o estado da conta
    @Override
    public String toString() {
        return "Conta { numeroConta=" + numeroConta
                + ", nomeCliente='" + nomeCliente + '\''
                + ", saldo=" + String.format("%.2f", saldo)
                + ", ativa=" + ativa + " }";
    }
}