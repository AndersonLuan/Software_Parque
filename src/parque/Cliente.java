package parque;

public class Cliente extends Pessoa {

    private int planoEscolhido; // [0 - 2] Bronze, Silver, Gold

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(int planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }
}
