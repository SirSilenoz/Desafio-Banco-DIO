public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = 0;
        this.numero = 1;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void tranferir(double valor, IConta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosConta() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("CPF: %s%n", this.cliente.getCpf());
        System.out.printf("Agência %d%n", this.agencia);
        System.out.printf("Número %d%n", this.numero);
        System.out.printf("Saldo %.2f%n", this.saldo);
    }
}