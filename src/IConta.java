public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void tranferir(double valor, IConta ContaDestino);

    void imprimirExtrato();
}
// verficar saldo tranferencia,cpf