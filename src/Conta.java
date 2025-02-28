public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor){
        saldo -= valor;

    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Conta: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

}
