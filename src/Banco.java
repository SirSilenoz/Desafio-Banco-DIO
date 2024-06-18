import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    List<Conta> contasList;

    public List<Conta> getContasList() {
        return contasList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}