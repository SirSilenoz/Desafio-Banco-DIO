public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setCpf("421.512.653-58");
        joao.setNome("João");

        Conta contaCorrente = new ContaCorrente(joao);
        Conta contaPoupanca = new ContaPoupanca(joao);

        contaCorrente.depositar(300);
        contaCorrente.tranferir(150, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
